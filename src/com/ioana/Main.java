package com.ioana;

public class Main {

    public static void main(String[] args) {

       System.out.println("It works");

       displayArray();

    }

    public static void displayArray() {

        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        int[] c = copyArray(a);

        for (int i = 0; i < c.length; i++) {

            System.out.println(c[i]);
        }
    }

    public static int[] copyArray(int[] b) {

        int[] c = new int[3];
        System.arraycopy(b, 0, c, 0, 3);

        return c;
    }
}
