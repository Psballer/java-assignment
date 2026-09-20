import java.util.Scanner;
  public class Checkboard{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    boolean repeat = true;
    System.out.print("Enter Password: ");
    String password = input.next();

    while(repeat);  
    if(password.equalsIgnoreCase ("1234ABC@"){
    System.out.print("Correct");
    repeat = false;
    }
    else{
    System.out.println("Wrong Password, Try again!!");
    }  





}
}
