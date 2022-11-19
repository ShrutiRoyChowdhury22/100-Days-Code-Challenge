import java.util.*;
public class String_2 {
    public static void main(String[] args) {

        String Tony;
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        System.out.println(sb.charAt(2));

        sb.setCharAt(0,'J');
        System.out.println(sb);
    }
}
