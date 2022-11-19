import java.util.*;
public class String_3 {
    public static void main(String[] args) {
        String Tony;
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        sb.insert(2,"n");
        System.out.println(sb);

        sb.delete(2,3);
        System.out.println(sb);
    }
}
