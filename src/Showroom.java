public class Showroom {

    public static void main(String[] args){

        Car wagonr=new Car();
        Car bmw=new Car();
        Vehicle vehicle1=wagonr;
        Vehicle vehicle2=new Vehicle();


        vehicle1.move();//Wagonr is object of class so Move to car will print , Coz it is indirectly pointing on Cars.
        vehicle2.move();//It is the object of vehicle itself So print move to vehicle is printed.

        
    


        bike ktm=new bike();
        //bike ducati=new bike();

        ktm.printwheelsdemo();

        //ktm.Wheels=2;
        //ducati.Wheels=2;

       // bmw.move();
    }
    
    
}
