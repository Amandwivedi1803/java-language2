import java.util.*;

public class shift_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of the term in the array");
        // lets left shift the array
        int num = sc.nextInt();
        int array[] = new int[num];
        for (int i = 0; i < array.length; i++) {
            System.out.println("the element of the array is");
            array[i] = sc.nextInt();
        }
        shi(array, num);
        sc.close();
    }

    public static void shi(int a[], int n) {
        int tem = a[0];
        System.out.println("shifting the array");
        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
        }
        a[n - 1] = tem;

        System.out.println("the new array is");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
