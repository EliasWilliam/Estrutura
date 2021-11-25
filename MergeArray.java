import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {

        System.out.println("Enter number of First Array's Element:  ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int firstArray[] = new int[n];
        System.out.println("Enter " + n + "Elements: ");
        for (int i = 0; i < n; i++) {
            firstArray[i] = input.nextInt();
        }
        System.out.println("Enter Number of Second Array's Element:  ");
        int n1 = input.nextInt();
        int SecondArray[] = new int[n1];
        System.out.println("Enter " + n1 + "Element:  ");
        for(int i = 0; i < n1; i++);
        SecondArray[i] = input.nextInt();
    }
    
        int[] result = new int[n + n1];

        System.arraycopy(firstArray, 0, result, 0, n);
        System.arraycopy(SecondArray, 0, result, n, n1);
        System.out.println(Arrays.toString(result));

        input.close();
     }
}
