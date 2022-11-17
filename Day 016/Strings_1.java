public class Strings_1 {
    public static void main(String[] args) {
        String name1 = "Shruti";
        String name2 = "Trisha";
        if ( name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
        String sentence = "Shruti Roy Chowdhury";
        String name = sentence.substring(11,sentence.length());
        System.out.println(name);
    }
}
