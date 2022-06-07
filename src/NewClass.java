public class NewClass {
    public static void main(String[] args) {


        String str = "Hello";
        System.out.println(str+" World");
        String newStr = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            newStr += str.charAt(i);
        }
        System.out.println(newStr);

    }
}
