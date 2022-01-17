import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();


        if(((cups <= 25 && cups >= 15) && (isWeekend == true)) || ((cups <= 20 && cups >= 10) && (isWeekend == !true ))) {
            System.out.println(true);

        }else{
            System.out.println(false);
    }
}
