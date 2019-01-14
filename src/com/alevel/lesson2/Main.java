package com.alevel.lesson2;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        int a, num;
        for (int i = 0; i <= 4; i++) {
            num = 1;
            a = i + 1;
            for (int j = 4; j > 0; j--) {
                if (j > 1) {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j <= i; j++) {
                if (j > 0) {
                    num = num * (a - j) / j;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}
