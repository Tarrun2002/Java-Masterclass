public class Shapeutility {
    
    public static void main(String[] args) {
        Shape circle=new Circle();
        Integer areaofCircle=circle.area();
        System.out.println("Area of Circle"+areaofCircle);
        Shape square=new Square();
        System.out.println("Area of Sqaure"+square.area());
    }
}
