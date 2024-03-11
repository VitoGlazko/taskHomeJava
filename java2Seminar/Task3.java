package java2Seminar;

import java.io.FileWriter;

public class Task3 {
    public static void main(String[] args) {
        int n =10;
        String text = "Test";
        try{
            FileWriter writer = new FileWriter("Text.txt");
            for (int i = 0; i < n; i++) {
                writer.write(text);
                writer.write("\n");
            }
            System.out.println("Получилось");
            writer.close();
        }
        catch(Exception e){
            System.out.println("Что-то пошло не так");
        }
    }
}
