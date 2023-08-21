

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

    @BeforeClass
    public static void beforeclass(){
        System.out.println("Before CLass");

    }

    @Before
    public void setup(){
        System.out.println("Before Test");
    }

    @Test
    public void test1(){
        System.out.println("Test1 Executed");
    }

    @Test
    public void test2(){
        System.out.println("Test2 Executed");
    }

    @After
    public void after(){
        System.out.println("After Test");
    }
   
    @AfterClass
    public static void afterclass(){
        System.out.println("After class");


    }    
}
