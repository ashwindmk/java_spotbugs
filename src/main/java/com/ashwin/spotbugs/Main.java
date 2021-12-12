package com.ashwin.spotbugs;

public class Main {
    //Unused field
    private int abc;

    private String ip = "127.0.0.1";

    public static void main(String[] args) {
        String x = "abc";
        String y = "abcd";
        if (x == y) {
            System.out.println("match");
        } else {
            System.out.println("mismatch");
        }

        System.out.println(compare("abc", "abc"));
    }

    private static boolean compare(String s1, String s2) {
        return s1 == s2;
    }

    public void test() {
        String[] field = {"a", "b", "c", "s", "e"};

        //concatenates strings using + in a loop
        String s = "";
        for (int i = 0; i < field.length; ++i) {
            s = s + field[i];
        }

        System.out.println(ip);
    }
}
