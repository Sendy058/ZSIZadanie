package vesmirnetelesa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PlanetaTest {

    Planeta planetka;
    @BeforeEach
    void setUp(){
        planetka = new Planeta();
    }

    @Test
    //test4
    public void testSetVaha() {
      planetka.setVaha(500);
      assertEquals(500,planetka.getVaha());
        }

    @Test
    //test5
    public void testPrintSetVaha(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        planetka.setVaha(500);
        assertEquals("Ja chudnem", outContent.toString());
    }
    @Test
    //test6
    public void testPrintSetVaha2(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        planetka.setVaha(5000);
        assertEquals("Pribrala som moc", outContent.toString());
    }



}