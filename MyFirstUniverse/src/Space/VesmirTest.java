package Space;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VesmirTest {


    Vesmir vesmir;
    @BeforeEach
    void setUp(){
        vesmir = new Vesmir();

    }
    //test1
    @Test
    public void testStartVesmir() {
        vesmir.startVesmir();
        assertEquals(true, vesmir.state);
    }
    //test2
    @Test
    public void testStopVesmir(){
        vesmir.stopVesmir();
        assertEquals(false,vesmir.state);
    }


}