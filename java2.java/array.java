import java.util.*;

public class array {
    public static void main(String[] args) {
        System.out.println("lets make array in the list");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of the term in the array");
        int num = sc.nextInt();
        int array[] = new int[num];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter the element of the array");
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        sc.close();
    }
}
