public class Programmer extends Employee{
    private int happiness;
    
    public void coding(String str){
//        int nowEvergy = this.getEnergy(); but this not change in another class
        if (getEnergy() >= 30) {
            System.out.println("Your code is " + str);
            setEnergy(getEnergy()-30);
            this.happiness -= 30;
        }else{
            System.out.println("Error Error Error");
            setEnergy(getEnergy()-30);
            this.happiness -= 30;
        }
    }

    public void coding(char str) {
//     or coding(str+"");
       this.coding(String.valueOf(str)); //change to string, Intager.valueOf(object)
    }
    public int getHappiness() {
        return happiness;

    }
    public void setHappiness(int happiness){
        this.happiness = happiness;
    }
}
