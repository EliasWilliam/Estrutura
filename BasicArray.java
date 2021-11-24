import java.util.Scanner;

class BasicArray {
    public static void Create_array(int arr[]) {
        // Declaracao

        int array[] = new int[5];

        array[0] = 10;
        array[1] = 13;
        array[2] = 34;
        array[3] = 45;
        array[4] = 65;

        System.out.println("Print array with index");
        System.out.println(array[0]);

        System.out.println("Print all arrays with loop");

        // Todos os arrays com interações

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

            // Scanner

            Scanner input = new Scanner(System.in);

            System.out.println("Quantos elementos você quer adicionar ?: ");
            int n = input.nextInt();

            int array_input[] = new int[n];
            System.out.println("Enter " + n + "Elementos: ");
            for (int i = 0; i < n; i++) {
                array_input[i] = input.nextInt();
            }

            System.out.println("Mostrando o array com o loop");
            for (int j = 0; i < n; j++)
                ;

            System.out.println("\t" + array_input[i]);
            input.close();
        }

        // Receebendo array como parametro

        System.out.println("Recebendo o array como parametro");
        for (int i = 0; i < arr.length; i++)
            ;

        System.out.println(arr[i]);

        System.out.println();

    }
    // Método Principal

    public static void main(String[] args) {
        Create_array(new int[] { 10, 22, 44, 66 });
    }

}
