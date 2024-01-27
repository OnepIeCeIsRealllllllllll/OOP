public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;

    public boolean equals(Employee e) {

        if (e.name.equals(name)){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public String toString(){
        return "My name is " + name + ".\nI have " + energy + " energy left.\nI have a balance of " + wallet.getBalance()+ " baht.";  
    }
    
    public boolean buyFood(Seller s){
        // Try to buy food from the seller
        
        /*the use of this indicates that a 
        reference to the current object is being
        passed as an argument to the sell method 
        of the Seller object (s).*/
        
        //(the current object)        
        if (s != null) {
            eat(s.sell(this));//or Food food = s.sell(this); but sell return food already
            return true;
        }else{
            return false;           
        }
    }

    public void eat(Food f){
        this.energy += f.getEnergy();  // Food as f
        
    }
    public String getName(){
        return name;
        
    }
    public void setName(String name){
        this.name = name;
    }
    public Wallet getWallet(){
        return wallet;
    }
    public void setWallet(Wallet wallet){
        this.wallet = wallet; //demaind attribute
    }
    public int getEnergy(){
        return energy;
    }
    public void setEnergy(int energy){
        this.energy = energy; //replace this energy 
    }
    public static String getNationality(){
        return nationality;
    }
    public static void setNationality(String nationality){
        Employee.nationality = nationality;
    }
}
