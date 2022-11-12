import java.util.Scanner;

public class func1 {
    static double area(int r ){
        double ar= 3.14*r*r;
        return ar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius ");
        int x= sc.nextInt();
        System.out.println("Area of the circle = " + area(x));
    }
}

