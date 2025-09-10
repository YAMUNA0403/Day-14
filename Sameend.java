import java.util.Scanner;
public class Sameend {
    public static boolean Same(int arr[]){
        int n=arr.length;
        return (arr[0]==arr[n-1]);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Same(arr));
        sc.close();
    }


}
