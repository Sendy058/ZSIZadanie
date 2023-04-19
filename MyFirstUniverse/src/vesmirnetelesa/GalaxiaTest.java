package vesmirnetelesa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GalaxiaTest {
    Galaxia galaxia;
    @BeforeEach
    void setUp(){

         galaxia = new Galaxia();
    }
    @Test
    //test7
    void sendMessage() {
        String sprava = "Ahoj nova galaxia";
        galaxia.sendMessage(galaxia,sprava);
        assertEquals(sprava,galaxia.getSprava());
    }
    @Test
    //test8
    void setSprava(){
        String sprava = "Ahoj nova galaxia";
        galaxia.setSprava(sprava);
        assertEquals(sprava,galaxia.getSprava());
    }
}