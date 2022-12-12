public class Tester {
    public static void main(String[] args) {
        System.out.println((55 != 55) && (false ^ true));    //false
        boolean a = true, b = false;
        int c = 2;
        char d = '2';
        System.out.println((!a || !b) || c == d);   //true
        System.out.println(false && true || false && !false);   //false
        System.out.println((false && true) || (false || true));   //true
    }
}
