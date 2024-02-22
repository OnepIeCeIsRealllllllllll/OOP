import java.util.*;
public class increase {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Input your money : ");
        double money = inp.nextDouble();
        System.out.print("Input your account type : ");
        char type = inp.next().charAt(0);
//        dont forget .
        if (type == 'A'){
            System.out.print("Your total money in one year = " + (money + (money * 1.5/100)));
            
        } else if (type == 'B'){
            System.out.print("Your total money in one year = " + (money + (money * 2.0/100)));

        } else if (type == 'C') {
            System.out.print("Your total money in one year = " + (money + (money * 1.5/100)));
        } else if (type == 'X'){
            System.out.print("Your total money in one year = " + (money + (money * 5.0/100)));

        }
            
    }
}
