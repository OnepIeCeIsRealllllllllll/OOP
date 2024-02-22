import java.util.*;
public class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your name : ");
        String name = sc.nextLine();
        System.out.print("Please insert your age : ");
        int ages = sc.nextInt();
        System.out.print("Please insert number of working days : ");
        int workingDays = sc.nextInt();//numDay1
        System.out.print("Please insert number of absent days : ");
        int absentDays = sc.nextInt();//numDay2
        System.out.print("Please insert you body weight : ");
        int weight = sc.nextInt();
        double salary=0;
//behind if has ;
        if ((21 <= ages)&&(ages <= 30)){
            salary = (workingDays * 300) - (absentDays * 50);
        } else if ((31 <= ages)&&(40 <= ages)){
            salary = (workingDays * 500) - (absentDays * 50);
        } else if ((41 <= ages)&&(50 <= ages)){
            salary = (workingDays * 1000) - (absentDays * 25);
        } else if ((51 <= ages)&&(60 <= ages)){
            salary = workingDays * 3000;
        } 
        System.out.println("Hi, " + name);
        System.out.println("Your salary is " + salary + " Bath");
        if ((weight >= 10)&&(weight <= 60)){
            System.out.println("Your salary and bonus is " + (salary + 5000));
        } else if ((weight >= 61)&&(weight <= 90)){
            System.out.println("Your salary and bonus is " + (salary + (5000 - (weight - 60) * 10)));
        } else{
            System.out.println(salary);
        }
                         
    }
    
}
