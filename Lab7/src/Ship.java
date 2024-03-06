public class Ship extends Vehicle implements Floatable{

    public Ship(){
        super(0.0); //extends from Vehicle
    }
    
    public Ship(double fuel){
        this.fuel = fuel;
    }
    
//    Override from abstract of Vehicle and Floatable
    @Override
    public void honk() {
        System.out.println("Shhhhh");
    }
    
    public void move(){//????????????????
        fl0at();
    }
    
    public void move(int distance){
        for(int i = 0; i < distance; i++){
            if (fuel < 50){
                System.out.println("Fuel is not enough.");
                break;
            }else{
                fl0at();//if enought fuel is still run
            }
//            ?????????????????????????????????????
        }
    }

    @Override
    public void startEngine() {
        if(this.fuel >= 10){
           this.fuel -= 10;
           System.out.println("Engine starts");
       }else{
           System.out.println("Fuel is not enough.");
       }
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stops");
    }

    @Override
    public void fl0at() {
       if(this.fuel >= 50){
           this.fuel -= 50;
           System.out.println("Ship moves");
       }else{
           System.out.println("Fuel is not enough.");
       }
    }
    
    
    
}
