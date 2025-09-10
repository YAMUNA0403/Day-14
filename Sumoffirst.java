import java.util.*;

public class Sumoffirst {
    public static int Sum(int arr[]) {
        int n = arr.length;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return arr[0];
        } else {
            return arr[0] + arr[1];
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of first two elements: " + Sum(arr));
        sc.close();
    }
}
