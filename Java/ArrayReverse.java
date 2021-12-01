import java.util.Scanner;

public class ArrayReverse {
    static int MAX = 10;
    // Reverse Method with parameter of array, start(Index with 0) , end(Index of
     // last element) and the n for number of elements to be Inserted for Reverse.


    

    static void Reverse(int array[], int start, int end, int n) {
        int temp;
        
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

        System.out.println("Reverserd Array: ");
        for(int i =0; i < n; i++); {
            System.out.println("t\t" + array[i] + " ");
        }

    System.out.println();
}

// Método Principal

public static void main(String[] args) {
    int array[] = new int[MAX];
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Total Number of Elements to be Entered: ");
    int n = input.nextInt();
    System.out.println("Enter which is to be Reverserd: ");
    for (int i =0; i < n; i++) {
        array[i] = input.nextInt();
    }

    int start = 0;
    int size = -1;
    Reverse(array, start, size, n);
    input.close();
 }
}
