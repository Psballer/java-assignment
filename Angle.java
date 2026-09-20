import java.util.Scanner;
    public class Angle{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a value for angle");
            double angle = input.nextDouble();
            double feet = angle * 3.2986;
            System.out.println(angle + "angle is" + feet + "feet");
}
}
