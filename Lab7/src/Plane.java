public class Plane extends Vehicle implements Flyable{ //shortkey is alt enter and do 
    private String airline;
    private String boeing;
    private static final int MAX_FLYER = 2;
    
    public Plane(){
        this(0.0, "", "");
    }
    
    public Plane(double fuel, String airline, String boeing){
        this.fuel = fuel;
        this.airline = airline;
        this.boeing = boeing;
    }
   
    public void setAirline(String airline){
        this.airline = airline;
    }
    
    public String getAirline(){
        return airline;
    }
    
    public void setBoeing(String boeing){
        this.boeing = boeing;
        
    }
    
    public String getBoeing(){
        return boeing;
        
    }
   
    @Override
    public void honk() {
        System.out.println("Weeeeeee");
    }

    @Override
    public void startEngine() {
        if(this.fuel >= 20){
            this.fuel -= 20;
            System.out.println("Plane’s Engine starts");
        }else{
            System.out.println("Fuel is not enough.");
        }
    }

    @Override
    public void stopEngine() {
        System.out.println("Plane’s Engine stops");
    }
    
    @Override
    public void fly(){
       if(fuel >= 20){
           fuel -= 20;
           System.out.println("Plane Fly");
       }else{
           System.out.println("Fuel is nearly empty.");
       }
    }
    @Override
    public void takeOff(){
        if(fuel >= 10){
           fuel -= 10;
           System.out.println("Plane Already to Take Off");
       }else{
           System.out.println("Fuel is nearly empty.");
       }
    }
    
    @Override
    public void landing(){
              if(fuel >= 10){
           fuel -= 10;
           System.out.println("Plane Already to Landing");
       }else{
           System.out.println("Fuel is nearly empty.");
       }
    }
}
