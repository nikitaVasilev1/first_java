import java.util.Scanner;

public class Main {

    public static int lenght(int a) {
        String str = Integer.toString(a);
        int lenght = str.length();
        return lenght;
    }

    public static int rez(int a) {
        int rezult = 0;
        int l = 0;
        int lenght = lenght(a);
        while (lenght > 0) {
            l = a % 10;
            a = a / 10;
            rezult = rezult + l;
            lenght--;
        }
        return rezult;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int rezult = rez(a);
        while (lenght(rezult) > 1)
            rezult = rez(rezult);
        System.out.println("результат: " + rezult);
    }
}