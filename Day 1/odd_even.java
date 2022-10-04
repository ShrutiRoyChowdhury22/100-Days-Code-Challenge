import java.util.*;
public class odd_even {
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter lower limit and higher limit");
        n= sc.nextInt();
        m= sc.nextInt();
        System.out.println("odd no.");
        for(int i=n;i<=m;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        System.out.println("even no.");
        for(int i=n;i<=m;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
