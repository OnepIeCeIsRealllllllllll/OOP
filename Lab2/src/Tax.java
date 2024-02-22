import java.util.Scanner;
public class Tax {
    public static void main(String[] args) {
//        double(input) money and condition
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        if (salary > 50000){
//        number dont use , 
            System.out.println(salary * 0.10);
        } else {
            System.out.println(salary * 0.05);
        }
    } 
}
