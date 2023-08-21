
import static org.junit.Assert.assertEquals;


import java.util.Arrays;

import org.junit.Test;

public class ArraysCompleteTest {


        
        @Test
        public void test(){
            int[] array={12,3,4,1};
            int[] expected={1,3,4,12};

            Arrays.sort(array);
            assertEquals(expected,array);

        }
    }
    

