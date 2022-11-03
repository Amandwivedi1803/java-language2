import java.util.*;

public class sorted_insertion {
    public static void main(String[] args) {
        System.out.println("enter the shorted array");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of the term in the array");
        int num = sc.nextInt();
        int array[] = new int[num];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter the element of the array");
            array[i] = sc.nextInt();
        }
        sort(num, array);
        sc.close();
    }

    public static void sort(int n, int a[]) {
        System.out.println("lets maker  the sorted array");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int tem = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tem;
                }

            }
        }
        System.out.println("print the sorted array");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
