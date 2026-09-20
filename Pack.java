import java.util.Scanner;
    public class Pack{
        public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 100");
        int number = input.nextInt();
        int sum = 0;
        sum = sum + number % 10;
        number = number/10;

        sum = sum + number % 10;
        System.out.println("The sm or integer is + sum");
 }
}
