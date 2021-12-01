public class FindDuplicate {
    
    // Função para mostrar as duplicações
    
    static void printRepeating(int arr[], int size) {

        int i;
        System.out.println("Os elementos repetitivos são: ");

        for(i = 0; i < size; i++) {
            int j = Math.abs(arr[i]);
            if( arr[j] >= 0)
            arr[j] = -arr[j];

            else
                System.out.print(j + " ");

        }
    }

    public static void main(String[] args){
        int arr [] = {1, 2,3,1,3,6,6};
        int arr_size = arr.length;
        printRepeating(arr, arr_size);
    }
}
