// Put in the radius of a circle in cm:
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put in the radius of a circle in cm:");
        double r = Double.parseDouble(sc.nextLine());
        double circumference = 2*Math.PI*r;
        System.out.println("The circumference is: " + circumference + " cm");
        double surface_area = Math.PI*Math.pow(r, 2);
        System.out.println("The surface area is: " + surface_area + " cm^2");
        System.out.println("Thank You for using this!");
    }
}