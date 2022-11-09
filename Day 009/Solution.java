import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any no");
        n=sc.nextInt();
        if (n%2==0){
            if(n<=5 && n>=2){
                System.out.println("Not Werid");
            }
            else if (n>=6 && n<=20){
                System.out.println("Werid");
            }
            else {
                System.out.println("Werid");
            }
        }
    }
}
