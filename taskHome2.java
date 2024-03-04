public class taskHome2 {
    public static void main(String[] args) {
        int i = 0;
        int a =1000;
        while (i<a) {
            if (i%2!=0 & (i%5!=0) & i%3!=0) {
                
                System.out.println(i);
                i++;

            }if (i==2 | i == 3 | i ==5)  {
                System.out.println(i);
                i++;
            }else{
                i++;
            }
        }
    }
    
}
