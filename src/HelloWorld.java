import java.util.Scanner;

public class HelloWorld {

    int addition(int a, int b) {
        int result = a + b;
        return result;
    }


    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("The first int? ");
        int first = Integer.valueOf(scan.nextLine());
        System.out.println("The second int? ");
        int second = Integer.valueOf(scan.nextLine());

        HelloWorld obj = new HelloWorld();
        int result = obj.addition(first, second);
        System.out.println("The addition of those numbers equals = " + result);
    }
}
