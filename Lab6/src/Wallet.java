class Wallet {
    private double balance;
//if name of attribute == name of argument --> add this.arribute
    public void setBalance(double balance) { //void can't return
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
}
//must know form lec