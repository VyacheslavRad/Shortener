package com.javarush.task.task33.task3310.strategy;

import java.util.Arrays;

public class Пробник {
    public static void main(String[] args) {
        char[] chars={'a','b','s','d','c'};
        System.out.println(Arrays.toString(chars));
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        System.out.println(chars[0]>chars[1]);
        System.out.println('D'<'H');
    }
}
