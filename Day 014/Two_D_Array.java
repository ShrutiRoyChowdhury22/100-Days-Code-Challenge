import java.util.*;
public class Two_D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int colus = sc.nextInt();
        int num[][]= new int[rows][colus];
        for (int i = 0;i<rows;i++){
            for ( int j = 0 ; j<colus;j++){
                num[i][j]=sc.nextInt();
            }
        }
        for (int i = 0;i<rows;i++){
            for ( int j = 0 ; j<colus;j++){
                System.out.print(num[i][j] +" ");
            }
            System.out.println();
        }

    }
}