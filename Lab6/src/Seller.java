class Seller extends Employee{

    public Food sell(Employee e){
        if (e.getWallet().getBalance() >= Food.getPrice()){ //e.getWallet().getBalance() because want double to calculate
            double foodPrice = Food.getPrice();
            this.getWallet().setBalance(foodPrice + getWallet().getBalance()); //use methoid in Wallet , foodPrice + my money , add balance in seller wallet
            e.getWallet().setBalance(e.getWallet().getBalance()-foodPrice);//my money >= food so you can buy it, remove balance in employee wallet
            Food f = new Food();
            return f;           
        }else{
            System.out.println("Your money is not enough.");
            return null; // null is default of string
        }
    }
}
