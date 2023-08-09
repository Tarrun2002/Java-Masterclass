public class Manager {

    long salary;

    public void display(Integer dummyintvaluetobeprinted){
        System.out.println("Printing integer value"+dummyintvaluetobeprinted);
    }
     public void display(String dummystringvaluetobeprinted){
        System.out.println("Printing String value"+dummystringvaluetobeprinted);

     }
    public static void main(String[] args){
        Manager seniorManagerGrade2= new Manager();
        seniorManagerGrade2.display(1);
        seniorManagerGrade2.display( "Senior manager grade 2");

    
    }


}
