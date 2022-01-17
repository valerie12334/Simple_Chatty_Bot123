import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int low = 0;
        int high = 10;
        
        boolean inRange = number > low && number < high;
        
        System.out.println(inRange);       
    }
}
