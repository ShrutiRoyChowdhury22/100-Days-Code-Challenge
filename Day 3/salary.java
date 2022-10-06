import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        int year;
        double salary, bon;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary");
        salary=sc.nextDouble();
        System.out.println("Enter the year");
        year=sc.nextInt();
        if(year>=5){
            bon=salary*5/100;
            System.out.println(bon);
        }
        else{
            System.out.println("no bonus");
        }
    }
}
