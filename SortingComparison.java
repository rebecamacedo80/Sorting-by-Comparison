
import java.util.Arrays;
import java.util.Scanner;

public class SortingComparison {

    public static int[] selectionSort(int[] ar){
        int minimo, aux;
        for(int i = 0; i < (ar.length - 1); i++){
            minimo = i;
            for(int j = (i+1); j < ar.length; j++){
                if(ar[j] < ar[minimo]){
                    minimo = j;
                }
            }

            if(ar[i] != ar[minimo]){
                aux = ar[i];
                ar[i] = ar[minimo];
                ar[minimo] = aux;
            }
        }

        return ar;
    }

    public static int[] insertionSort(int[] ar){
        int chosen, j;
        for(int i = 1; i < ar.length -1; i++){
            chosen = ar[i];
            j = (i-1);
            while(j >= 0 && chosen < ar[j]){
                ar[j+1] = ar[j];
                j--;
            }
            ar[j+1] = chosen;
        }
        return ar;

    }

    public static void main(String[] args) {
        //int[] array = {8, 4, 6, 2, 5, 9, 3, 1, 0, 7};

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira os números que compões o vetor: \n");
        String in = scan.nextLine();
        String[] input = in.split(" ");
        int[] array = new int[input.length];

        for(int i = 0; i < input.length; i++){
            array[i] = Integer.parseInt(input[i]);

        }

        System.out.println(Arrays.toString(array));

        System.out.println("\n### SELECTION SORT ###");
        System.out.println(Arrays.toString(selectionSort(array)));

        System.out.println("\n### INSERTION SORT ###");
        System.out.println(Arrays.toString(insertionSort(array)));

    }
}
