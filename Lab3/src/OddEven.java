import java.util.Scanner;
public class OddEven { //10
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int j = 1; j <= number; j++)
            if (j % 5 == 0){
                System.out.print("/");
            }else{
                System.out.print("|");  
        }
        
        
    }
    
}
