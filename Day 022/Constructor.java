import java.util.*;
class keyword_1 {

        int roll_no;
        String name;
        float fee;
        keyword_1(int roll_no,String name,float fee){
            this.roll_no = roll_no;
            this.name = name;
            this.fee = fee;
        }
        void display(){
            System.out.println(roll_no+" "+name+" "+fee);
        }
    }

public class TestThis2 {
        public static void main(String args[]) {
            keyword_1 kw1 = new keyword_1(101, "Shruti", 65000);
            keyword_1 kw2 = new keyword_1(202, "Snigdha", 70000);
            kw1.display();
            kw2.display();
        }
    }
