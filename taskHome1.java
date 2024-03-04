import java.util.Scanner;
public class taskHome1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i  = sc.nextInt();
        System.out.printf("Теугодьное число %d\n", Triple(i));
    }
    public static int Triple(int a) {
        return (a*(a+1))/2;
    }
}
