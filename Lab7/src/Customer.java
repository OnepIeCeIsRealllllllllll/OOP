public class Customer {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;
    
    public Customer(){
        this.firstName = "";
        this.lastName = "";
        acct = null; //warning construtor
    
}
    
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = null;
    }
    
    public Customer(String firstName, String lastName, CheckingAccount acct){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct; //assign from class checkingAccount
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setAcct(CheckingAccount acct){
        this.acct = acct;
    }
    
    public CheckingAccount getAcct(){
        return acct;
    }
    
    @Override
    public String toString(){
//        Account a = New Account();
        if ((acct) == null){
            return String.format("%s %s doesn’t have account.", this.firstName , this.lastName);
        }else{
            return String.format("The %s account has %s baht and %s credits." ,this.firstName, acct.getBalance(), acct.getCredit());
        }
    }

    public boolean equals(Customer c){
        return this.firstName.equals(c.firstName) && this.lastName.equals(c.lastName); // check c and this equal
    }
}