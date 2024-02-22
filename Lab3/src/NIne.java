import java.util.Scanner;
public class NIne {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int odd = 0, even = 0;
    while (true){
        int number = sc.nextInt();
        if (number == -1){
            break;
        }else{
            if(number%2 == 0){
                even += 1;
            }else{
                odd += 1;
            }
        }
    }
        System.out.println("Odd number = " + odd + " and Even number = ^" + even);
    }
    
}
