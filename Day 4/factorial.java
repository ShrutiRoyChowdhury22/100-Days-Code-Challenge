import java.util.*;
public class factorial {
    public static void main(String[] args) {
        int n,i,f=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any no.");
        n= sc.nextInt();
        for (i=1;i<=n;i++){
            f=f*i;
            if(n>0){
                System.out.println(f);
            }
            else{
                System.out.println("wrong number");
            }
        }

    }
}
