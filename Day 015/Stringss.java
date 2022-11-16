import java.util.*;
public class Stringss {
    public static void main(String[] args) {
        String firstname = "Shruti";
        String lastname = "Roy Chowdhury";
        String fullname = firstname + " " + lastname;
        System.out.println("My name is "+fullname);
        System.out.println(fullname.length());
        for ( int i = 0 ; i<fullname.length() ; i++){
            System.out.println(fullname.charAt(i));
        }
    }
}
