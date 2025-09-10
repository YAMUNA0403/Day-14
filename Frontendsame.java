package com.codegnan.Arrays;

import java.util.*;

class Frontendsame {
    public static boolean Front(int arr1[], int arr2[]) {
        
        return (arr1[0] == arr2[0]) || (arr1[arr1.length - 1] == arr2[arr2.length - 1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];

        System.out.println("Enter elements of first array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int arr2[] = new int[m];

        System.out.println("Enter elements of second array: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
		}
        System.out.println("Result: " + Front(arr1, arr2));

        sc.close();
    }
}
