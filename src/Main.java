import com.Smart.SmartDivice;
import com.Smart.SmartPhone;
import com.Smart.SmartWatch;

public class Main {
    public static void main(String[] args) {
        SmartDivice num1 = new SmartDivice(true, "x21", "Android", 20, 20);
        System.out.println(num1);

        System.out.println("");

        SmartPhone num2 = new SmartPhone("4G" , 1178993376, 200, 100, 100, 200 );
        System.out.println(num2);

        System.out.println("");

        SmartWatch num3= new SmartWatch("Samsung" ,true);
        System.out.println(num3);
    }
}