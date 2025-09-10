package com.codegnan.Arrays;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,4,5,3,2,5,3,1,2,3};
boolean[] proceed=new boolean[arr.length];
for(int i=0;i<arr.length;i++) {
	if(proceed[i]) {
		continue;
	}
	int count=1;
	for(int j=i+1;j<arr.length;j++) {
		if(arr[j]==arr[i]) {
			count++;
			proceed[j]=true;
		}
	}
	System.out.println(arr[i]+ " ---> "+count);
	
       }
	}

}
//
