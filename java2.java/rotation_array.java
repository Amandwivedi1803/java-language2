import java.util.Arrays;
import java.util.Scanner;

public class rotation_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of the term in the array");
        int num = sc.nextInt();
        int array[] = new int[num];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter the element of the array");
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("lets rotate the array");
        System.out.println("enter the number of the term in the array which is to rotate");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int tem = array[i];
            for (int j = 1; j < array.length; j++) {
                array[j - 1] = array[j];
            }
            array[n - 1] = tem;
        }
        System.out.println("array after the rotation is ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        sc.close();
    }
}
