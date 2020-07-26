/*
 * Copyright (c) 2020. All rights Reserved By Krishnakanth Yachareni
 */

package com.coursera.algorithm;

import java.util.Scanner;

public class SumOfDigits {
    static int sumOfDigits(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(sumOfDigits(a, b));
    }
}
