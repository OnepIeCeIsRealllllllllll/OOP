public class Plane extends Vehicle{
    public void showPlaneInfo() {
        System.out.println("Plane detail is, Fuel is " + super.getFuel() + " litre and Top Speed is " + super.getTopSpeed() + " m/s.");
    }
    public void setPlaneInfo(int s, String t) {
        super.setFuel(s);
        super.setTopSpeed(t);
    }
    public void fly() {
        int planeFuel = super.getFuel();
        if (planeFuel < 200) {
            System.out.println("Please add fuel.");
        }else{
            System.out.println("Fly.");
            super.setFuel(planeFuel - 200);
        }
    }
}
