package com.victor.jvmtest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteration {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>();

        for (int i = 0; i < 10; i++)
        {
            strList.add("string" + i);
        }

        Iterator<String> iterator = strList.iterator();
        while (iterator.hasNext())
        {
            if (iterator.next().equals("string3"))
            {
                iterator.remove();	//iterator.remove()移除的是最近一次iterator.next()所获取的对象
            }
        }

        iterator = strList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
