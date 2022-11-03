import java.util.*;

public class array_binary {
    public static void main(String[] args) {
        System.out.println("lets make a programm for the searching of the elemeent ");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lower limit of the array");
        int l = sc.nextInt();
        System.out.println("enter the upper limit of the array");
        int h = sc.nextInt();
        int mid;
        int a[] = new int[h];
        for (int i = l; i < h; i++) {
            System.out.println("enter the element of the array");
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        System.out.println("enter the element whic you are searching in the list of array");
        int key = sc.nextInt();
        while (l <= h) {
            mid = (l + h) / 2;
            if (key == a[mid]) {
                System.out.print(mid);
                break;
            } else if (key < a[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        sc.close();
    }
}
