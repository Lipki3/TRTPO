package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void divt() {
        Complex a = new  Complex(5,5);
        Complex b = new  Complex(2,2);
        Complex c = new  Complex(2.5,0);
        a=a.div(b);
        assertEquals(c.getIm(),a.getIm(),0);
        assertEquals(c.getRe(),a.getRe(),0);
    }

    @Test
    public void minust() {
        Complex a = new  Complex(5,5);
        Complex b = new  Complex(2,2);
        Complex c = new  Complex(3,3);
        a=a.minus(b);
        assertEquals(c.getIm(),a.getIm(),0);
        assertEquals(c.getRe(),a.getRe(),0);

    }
}