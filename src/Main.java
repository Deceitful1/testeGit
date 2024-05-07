import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        System.out.println(Soma(numero1,numero2));


    }
    public static int Soma(int a, int b)
    {
        return a + b;
    }

}