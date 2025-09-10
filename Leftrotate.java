import java.util.*;

public class Leftrotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();;
        int[] nums = new int[n];
        System.out.println("Enter 3 numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = {nums[1], nums[2], nums[0]};
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}