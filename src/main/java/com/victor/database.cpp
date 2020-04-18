//
// Created by z00500247 on 2020/4/18.
//

#include <algorithm>
#include <iomanip>
#include <iostream>
#include <map>
#include <math.h>
#include <string>
#include <vector>

using namespace std;

vector<pair<int, int>> calculate_result(vector<vector<int>> &input1, vector<vector<int>> &input2);
vector<vector<int>> calculate_join(vector<vector<int>> &input1, vector<vector<int>> &input2);
vector<vector<vector<int>>> calculate_group_by(vector<vector<int>> &input);
vector<vector<vector<int>>> calculate_order_by(vector<vector<vector<int>>> &input);

int main(int argc, char const *argv[])
{
    vector<vector<int>> input1({
        vector<int>({1, 2, 3}),
        vector<int>({2, 2, 3}),
        vector<int>({3, 1, 2})
    });

    vector<vector<int>> input2({
        vector<int>({1, 1, 2}),
        vector<int>({2, 2, 2}),
        vector<int>({3, 1, 2})
    });

    auto res = calculate_result(input1, input2);

    size_t len = res.size();
    for (int i = 0; i < len; i++) {
        cout << res[i].first << ", " << res[i].second << endl;
    }
}

vector<pair<int, int>> calculate_result(vector<vector<int>> &input1, vector<vector<int>> &input2) {
    vector<pair<int, int>> res;
    auto join_res = calculate_join(input1, input2);
    auto group_by_res = calculate_group_by(join_res);
    auto order_by_res = calculate_order_by(group_by_res);

    size_t len = order_by_res.size();

    for (int i = 0; i < len; i++) {
        int max_t1_1 = order_by_res[i][0][0];
        int min_t2_1 = order_by_res[i][0][3];
        for (auto &each : order_by_res[i]) {
            max_t1_1 = each[0] > max_t1_1 ? each[0] : max_t1_1;
            min_t2_1 = each[3] < min_t2_1 ? each[3] : min_t2_1;
        }
        res.push_back(pair<int, int>(max_t1_1, min_t2_1));
    }

    return res;
}


// merge join
vector<vector<int>> calculate_join(vector<vector<int>> &input1, vector<vector<int>> &input2) {
    auto sort_fun = [](vector<int> x, vector<int> y) { return x[2] < y[2]; };
    sort(input1.begin(), input1.end(), sort_fun);
    sort(input2.begin(), input2.end(), sort_fun);

    vector<vector<int>> res;

    size_t input1_len = input1.size();
    size_t input2_len = input2.size();

    if (input1_len == 0 || input2_len == 0) {
        return res;
    }

    int begin = 0;

    for (int i = 0; i < input1_len; i++) {
        if (input1[i][2] < input2[begin][2]) {
            continue;
        } else if (input1[i][2] > input2[begin][2]) {
            while (begin < input2_len && input1[i][2] > input2[begin][2]) {
                begin++;
            }
            if (begin >= input2_len) {
                break;
            }
        } else {
            for (int j = begin; j < input2_len && input2[begin][2] == input2[j][2]; j++) {
                res.push_back(vector<int>({input1[i][0], input1[i][1], input1[i][2], input2[j][0], input2[j][1], input2[j][2]}));
            }
        }
    }

    return res;
}

vector<vector<vector<int>>> calculate_group_by(vector<vector<int>> &input) {
    auto sort_fun = [](vector<int> x, vector<int> y) {
        if (x[1] == y[1]) {
            return x[4] < y[4];
        }
        return x[1] < y[1];
    };

    sort(input.begin(), input.end(), sort_fun);
    size_t len = input.size();

    vector<vector<vector<int>>> res;

    if (len == 0) {
        return res;
    }

    vector<vector<int>> tmp({input[0]});

    for (int i = 1; i < len; i++) {
        if (tmp[0][1] != input[i][1] || tmp[0][4] != input[i][4]) {
            res.push_back(tmp);
            vector<vector<int>> empty;
            tmp.swap(empty);
        }
        tmp.push_back(input[i]);
    }
    res.push_back(tmp);

    return res;
}

vector<vector<vector<int>>> calculate_order_by(vector<vector<vector<int>>> &input) {
    auto sort_fun = [](vector<vector<int>> x, vector<vector<int>> y) {
        int max_x = x[0][0], max_y = y[0][0];
        for (auto each_x : x) {
            max_x = each_x[0] > max_x ? each_x[0] : max_x;
        }
        for (auto each_y : y) {
            max_y = each_y[0] > max_y ? each_y[0] : max_y;
        }

        if (max_x == max_y) {
            if (x[0][4] == y[0][4]) {
                return x[0][1] < y[0][1];
            }
            return x[0][4] < y[0][4];
        }
        return max_x < max_y;
    };

    sort(input.begin(), input.end(), sort_fun);
    return input;
}