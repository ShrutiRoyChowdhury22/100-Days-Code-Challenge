import java.util.*;
public class garments {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any size");
        char opr;
        opr=sc.next().charAt(0);
        switch (opr){
            case 's':
                System.out.println("extra small");
                break;
            case 'S':
                System.out.println("small");
                break;
            case 'M':
                System.out.println("medium");
                break;
            case 'l':
                System.out.println("large");
                break;
            case 'L':
                System.out.println("extra large");
                break;
            default:
                System.out.println("wrong");
        }
    }
}
