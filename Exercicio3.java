package Array;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int[][] a = new int[2][4];
        int[][] b = new int[2][4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i - j;
            System.out.println(a[i][j]);
            } }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = (i+j)*7;
                System.out.println(b[i][j]);
            } }
        }
    }

