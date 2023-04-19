package vesmirnetelesa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Slnecna_sustavaTest {

    Slnecna_sustava slnecna_sustava ;
    @BeforeEach
    void setUp(){
        slnecna_sustava = new Slnecna_sustava();
    }

    @Test

    //test3
    public void testAddTeleso() {
        Vesmirne_teleso nove_teleso = new Vesmirne_teleso();
        slnecna_sustava.addTeleso(nove_teleso);
        assertEquals(5, slnecna_sustava.obezne_telesa.size());
        assertEquals(5, slnecna_sustava.object_counter);
    }



}