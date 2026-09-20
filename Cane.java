import java.util.Scanner;
    public class primenumber{
     public static void main (String [] args){
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the number");
     int number = input.nextInt();
    int sum = 0;

    for(int index = 2; index <= number/2; index++){
      if(number % index == 0) {
        sum =+ index;
       System.out.println("It a prime number");
 }
       else{
        System.out.println("Is not a prime number");
}
}
}
}







