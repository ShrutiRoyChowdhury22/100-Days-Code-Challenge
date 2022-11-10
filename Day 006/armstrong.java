import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        int dig1,dig2,dig3;
        for (int num = 1;num<=500;num++){
            int temp = num;
            dig1 = temp % 10;
            temp = temp / 10;
            dig2 = temp % 10;
            temp = temp /10;
            dig3 = temp % 10;
            if (dig1*dig1*dig1 + dig2*dig2*dig2 + dig3*dig3*dig3 == num) {
                System.out.println(num);
            }

        }
    }
}
