public class helloworld {

    Integer Instancevariable=10;
    static Integer staticvariable=30;

    public void nonstatictest(){
        System.out.println("Non Static Method");
    }



    public static void statictest(){
        System.out.println(" Static Method");

    }
    
    public static void main(String[] args){
        helloworld HelloWorldObejct=new helloworld();
        helloworld HelloWorldObejct1=new helloworld();
        HelloWorldObejct1.Instancevariable=10;
        helloworld HelloWorldObejct2= new helloworld();
        HelloWorldObejct2.Instancevariable=20;

        System.out.println("Hello World!!!*");
        HelloWorldObejct.nonstatictest();
        statictest();
    }
}
