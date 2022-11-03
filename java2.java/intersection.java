import java.util.*;

public class intersection {
    public static void main(String[] args) {
        System.out.println("lets make an array on the intersection ");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of term in the array1");
        int num1 = sc.nextInt();
        System.out.println("enter the number of term in the array2");
        int num2 = sc.nextInt();
        int array1[] = new int[num1];
        int array2[] = new int[num2];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("enter the element of the array1");
            array1[i] = sc.nextInt();
        }
        for (int j = 0; j < array2.length; j++) {
            System.out.println("enter the element of the array2");
            array2[j] = sc.nextInt();
        }
        // now found out the intersection of two array
        System.out.println("the arrray1 intersection array2 is");
        System.out.print("[" + " ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                }
            }
        }
        System.out.print("]");
        sc.close();
    }
}
