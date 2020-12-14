import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculsTest {
    private Calculs c1 = null;
    private Calculs c2 = null;
    private Calculs c3 = null;

    /**
     * Initialise les valeurs avant chaque test.
     */
    @BeforeEach
    void setUp() throws Exception {
        c1 = new Calculs(1,2);
        c2 = new Calculs(10,20);
        c3 = new Calculs(100,200);
    }

    /**
     * Test method for {@link Calculs#multiplier()}.
     */
    @Test
    void multiplier() {
        if(c1.multiplier() != 2){
            fail("Methode multiplier non conforme 2*1=2 ne fonctionne pas.");
        }
        assertEquals(c1.multiplier(),42);
    }

    /**
     * Test method for {@link Calculs#additionner()}.
     */
    @Test
    void additionner() {
    }

    /**
     * Test method for {@link Calculs#diviser()}.
     */
    @Test
    void diviser() {
    }

    /**
     * Test method for {@link Calculs#soustraire()}.
     */
    @Test
    void soustraire() {
    }
}