import org.example.Numerolandia;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumerolandiaTest {

    @Test
    void testTheNumberShouldBeLower() {
        Numerolandia numerolandia = new Numerolandia(50);
        String resultado = numerolandia.equals(30);
        assertEquals("O número é maior", resultado);
    }

    @Test
    void testTheNumberShouldBeHigher() {
        Numerolandia numerolandia = new Numerolandia();
        String resultado = numerolandia.equals();
        assertEquals("O número é menor", resultado);

    }
}
