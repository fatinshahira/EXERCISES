//Intro | How to add and remove data from ArrayList in Java

package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList anyList = new ArrayList();

        anyList.add(123);
        anyList.add("Java");
        anyList.add(20.8);
        anyList.add('A');
        System.out.println(anyList);

        anyList.remove(1);
        System.out.println(anyList);

        anyList.add("Phyton");
        System.out.println(anyList);

        anyList.add(0, "Java");
        System.out.println(anyList);
    }
}

![output arrayList](https://user-images.githubusercontent.com/55240830/84176891-a9edf180-aab4-11ea-8e94-a6534429d2e5.png)
