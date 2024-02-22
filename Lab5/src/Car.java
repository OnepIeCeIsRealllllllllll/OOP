public class Car extends Vehicle{
    private String typeEngine;
    
    public void setTypeEngine(String t) {
        typeEngine = t;
    }
    public String getTypeEngine() {
        return typeEngine;
    }
    public void showCarInfo(){
        System.out.println("Car engine is " + typeEngine + ".");
        System.out.println("Fuel is " + super.getFuel() + " litre and Top Speed is " + super.getTopSpeed()+ " m/s.");
    }
    public void setCarInfo(int s, String t, String y){
        super.setFuel(s);
        super.setTopSpeed(t);
        typeEngine = y;
    }
    public void move(){
        //set object to get super.getFuel() because use more 1 time.
        int nowFuel = super.getFuel();
        if (nowFuel < 50) {
            System.out.println("Please add fuel.");
        }else {
            System.out.println("Move.");
            super.setFuel(nowFuel-50);// wrong --> nowFuel -= 50; 
        }
     }
}
