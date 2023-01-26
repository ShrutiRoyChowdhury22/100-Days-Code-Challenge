import java.util.Scanner;

public class euler {
    static int gcd(int a, int b){
        if (a==0){
            return b;
        }
        return gcd(b%a, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int b = sc.nextInt();
        for (int a=1; a<b; a++){
            if(gcd(a,b)==1){
                count++;
                System.out.println(a);
            }
        }
        System.out.println("\n"+count);
        sc.close();
    }
}