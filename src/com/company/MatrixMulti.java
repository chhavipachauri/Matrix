package com.company;
import java.util.Scanner;

public class MatrixMulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1, r2, c1, c2;
        int i, j, k;
        System.out.println("enter size of both matrices: ");
        r1 = sc.nextInt();
        r2 = sc.nextInt();
        c1 = sc.nextInt();
        c2 = sc.nextInt();
        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        int c[][] = new int[r1][c2];
        System.out.println("enter first array elements: ");
        for (i = 0; i < a.length; i++)          //a.length= length of rows
            for (j = 0; j < a[i].length; j++)  // a[i].length= length of column in ith row
                a[i][j] = sc.nextInt();

        System.out.println("enter second array elements: ");
        for (i = 0; i < b.length; i++)
            for (j = 0; j < b[i].length; j++)
                b[i][j] = sc.nextInt();

        if (r2 != c1) System.out.println("multiplication not possible");

        System.out.println("multiplication of a and b: ");


        for (i = 0; i < c.length; i++)
            for (j = 0; j < c[i].length; j++)
                for (k = 0; k < r2; k++)
                    c[i][j] += a[i][k] * b[k][j];

        for (i = 0; i < c.length; i++) {
            for (j = 0; j < c[i].length; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }

    }
}

