import java.util.*;
public class Student {
    int id;
    String name;
    Student (int i,String n){
        id = i;
        name = n;
    }
    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String args[]){
        Student sc1 = new Student (101,"Shruti");
        Student sc2 = new Student (102,"Trisha");
        sc1.display();
        sc2.display();
    }
}
