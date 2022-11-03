import java.util.*;

public class reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of the term in the array");
        int num = sc.nextInt();
        int array[] = new int[num];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter the element of the array");
            array[i] = sc.nextInt();
        }
        System.out.println("the original array is ");
        System.out.print(Arrays.toString(array));
        System.out.println("enter the number of the term to be rotate");
        int n = sc.nextInt();
        int i = 0;
        while (i < n) {
            int tem = array[0];
            i++;
            for (int j = 1; j < array.length; j++) {
                array[j - 1] = array[j];

            }
            array[num - 1] = tem;

        }
        System.out.println("the new array is");
        for (int p = 0; p < array.length; p++) {
            System.out.print(array[p]);
        }
        sc.close();
    }
}
