import java.util.*;
public class calculator {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two no.");
        a= sc.nextInt();
        b= sc.nextInt();
        char opr;
        System.out.println("Enter the opr");
        opr= sc.next().charAt(0);
        switch (opr){
            case '+':
                c=a+b;
                System.out.println(c);
                break;
            case '-':
                c= a-b;
                System.out.println(c);
                break;
            case '*':
                c=a*b;
                System.out.println(c);
                break;
            case '/':
                c=a/b;
                System.out.println(c);
                break;
            case '%':
                c= a%b;
                System.out.println(c);
            default:
                System.out.println("Wrong Opr");
        }
    }
}