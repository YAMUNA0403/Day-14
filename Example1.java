package com.codegnan.Arrays;
//import java.util.*;
public class Example1 {
	public static int[] arr2(int arr[]) {
			if(arr[0]==2 && arr[1]==3) {
				arr[1]=0;
			}if(arr[1]==2 && arr[2]==3) {
				arr[2]=0;
		}
		return arr;
	}
	public static void printArray(int[] nums) {
		System.out.print("[");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]);
			if(i<nums.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] testcases= {{1,2,3},{4,2,3},{2,0,7}};
		for(int i=0;i<testcases.length;i++) {
			int[] result=arr2(testcases[i]);
			System.out.print("testcase"+(i+1)+" ");
			printArray(result);
		}
		}

	}

