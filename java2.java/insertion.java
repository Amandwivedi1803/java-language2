import java.util.*;

public class insertion {
    public static void main(String[] args) {
        System.out.println("lets make a programm for the insertion of the element of the array");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of the term in the array");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the element  of the array");
            arr[i] = sc.nextInt();
        }
        System.out.print("the orginal array is " + Arrays.toString(arr));
        int array[] = new int[num + 1];
        for (int i = 0; i < num; i++) {
            array[i] = arr[i];
        }
        array[num] = 0;
        System.out.println("enter the term from where the insertion is to take place");
        int n = sc.nextInt();
        System.out.println("neter the value of the inserted element of the array");
        int val = sc.nextInt();
        for (int i = num; i > n; i--) {
            array[i] = array[i - 1];
        }
        array[n] = val;

        System.out.println("the new array after the insertion of the element is");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}
