 import java.util.Scanner;
    public class Seperators{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number"); 
        int number = input.nextInt();

        int number1 = (number/10000) % 10;
        int number2 = (number/1000) % 10;
        int number3 = (number/100) % 10;
        int number4 = (number/10) % 10;
        int number5 = (number/1) % 1;

           System.out.printf("%d %d %d %d %d %n ", number1,number2,number3,number4,number5);

 }
}
