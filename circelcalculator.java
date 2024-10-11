import java.util.Scanner;
public class circelcalculator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the redus of the circel");
            double radious = sc.nextDouble();

            double circumferance = 2* Math.PI *radious;
            double area = Math.PI * radious * radious ;


            System.out.println("circumference : " + circumferance);
            System.out.println("area:" + area );
            sc.close();
    }
}
