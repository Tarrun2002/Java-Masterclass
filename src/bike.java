public class bike extends Vehicle {

    Integer Wheels;
    public void move(){
        System.out.println("Move in bike class");
    }

    public void printwheelsdemo(){
        Wheels=2;
        System.out.println(Wheels);  
        System.out.println(super.Wheels);
    }
    
}
