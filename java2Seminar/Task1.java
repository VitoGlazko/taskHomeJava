//
package java2Seminar;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите символ: ");
        String i  = sc.nextLine();
        System.out.println("Введите символ: ");
        String r = sc.nextLine();
        System.out.println("Введите Число: ");
        int g = sc.nextInt();
        System.out.println(CreatString(i, r, g));
    }
    public static String CreatString(String i, String r, int g) {
        StringBuilder str = new StringBuilder();
        for (int t = 0; t< g/2; t++ ){
            str.append(i+r);
        }
        return str.toString();
    } 
}