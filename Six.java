import java.util.*;
public class Six {
    public static boolean Sixes(int arr[]){
        int n=arr.length;
        return (arr[0]==6 || arr[n-1]==6);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
         System.out.println("Enter elemnts");
        for(int i=0;i<n;i++){
           
            arr[i]=sc.nextInt();
        }
        System.out.println(Sixes(arr));
        sc.close();
    }
}
