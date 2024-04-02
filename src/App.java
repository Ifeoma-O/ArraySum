import java.util.Scanner;
public class App {
    public static void main(String[] args){
        int[][] arr = getArray();

        System.out.println("\nSum of all elements is " + sum(arr));

    }

    public static int[][] getArray(){
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][4];
        System.out.println("Enter " + arr.length + " rows and " + arr[0].length + " columns: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }

    public static int sum(int[][] arr){
        int total = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                total += arr[i][j];
            }
        }
        return total;
    }
}

