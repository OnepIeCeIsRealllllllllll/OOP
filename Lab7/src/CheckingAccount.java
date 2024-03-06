public class CheckingAccount extends Account {
    private double credit;
    
    public CheckingAccount(){
//        super(0, " ");  // Calling the constructor of the Parent class , jum jum, order follow from constructor Account
//        this.credit = 0;
          this(0, "", 0);//shortly write from mother to child
    }
    
    public CheckingAccount(double balance, String name, double credit){
//        super.balance = balance;
//        super.name = name;
        super(balance, name);
        this.credit = credit;
    }
    
    public void setCredit(double credit){
        if(credit > 0){
            this.credit = credit;
        }else{
            System.out.println("Input number must be a positive interger.");
        }       
    }
    
    public double getCredit(){
        return credit;
    }
    
    @Override
    public void withdraw(double a) {
//        if(a > 0) {
//            credit -= a;
//            balance -= a;  because a > 0 will do in medthod anything     
            if ((balance - a) >= 0) {
                balance -= a;
                System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
                
            }else if (((balance - a) < 0 ) && ((balance - a) + credit >= 0)){ //condition 2 credit still enough because +
                balance = 0;
                credit = credit + (balance - a); //balance - a < 0 so -- = + so credit + (balance -a) 
                System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
          
            }else if(((balance - a) < 0 ) && ((balance - a) + credit < 0)){
                System.out.println("Not enough money!");
                }              
            }
        

    public void withdraw(String a){//do in double withdraw(double a) because override from labsheet
        this.withdraw(Double.parseDouble(a));
    }

    @Override
    public String toString(){
        return "The " + name + " account has " + balance + " baht and " + credit + " credits.";
    }
}
