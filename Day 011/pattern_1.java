import java.util.*;
public class pattern_1 {
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any limit");
        int x = sc.nextInt();
        for (i=1;i<=x;i++){
            for (j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
