import java.util.*;

public class deletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of the term in the array");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the element of the array");
            arr[i] = sc.nextInt();
        }
        System.out.println("the orginal array is");
        System.out.print(Arrays.toString(arr));
        System.out.println("enter the term from wher the element is to be deleted ");
        int n = sc.nextInt();
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        sc.close();
    }
}
