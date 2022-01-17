import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt() > 0 ? 1 : 0;
        int b = scanner.nextInt() > 0 ? 1 : 0;
        int c = scanner.nextInt() > 0 ? 1 : 0;
        
       System.out.println(a + b + c == 1);
    }
}
