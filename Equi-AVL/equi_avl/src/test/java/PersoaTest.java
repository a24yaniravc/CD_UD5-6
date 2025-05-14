import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersoaTest {

    private Persoa p;

    @BeforeEach
    public void setUp() {
        p = new Persoa();
    }

    // Clases de equivalencia
    @Test
    public void testEdadValidaDentroDelRango() {
        p.setIdade(30);
        assertTrue(p.idadeValida(), "Edad 30 debe ser válida");
    }

    @Test
    public void testEdadInvalidaMenor() {
        p.setIdade(10);
        assertFalse(p.idadeValida(), "Edad 10 no debe ser válida");
    }

    @Test
    public void testEdadInvalidaMayor() {
        p.setIdade(70);
        assertFalse(p.idadeValida(), "Edad 70 no debe ser válida");
    }

    // Análisis de valores límite
    @Test
    public void testLimiteInferior() {
        p.setIdade(18);
        assertTrue(p.idadeValida(), "Edad 18 debe ser válida");
    }

    @Test
    public void testLimiteSuperior() {
        p.setIdade(60);
        assertTrue(p.idadeValida(), "Edad 60 debe ser válida");
    }

    @Test
    public void testUnidadesAntesYDespuesDelLimite() {
        p.setIdade(17);
        assertFalse(p.idadeValida(), "Edad 17 no debe ser válida");

        p.setIdade(61);
        assertFalse(p.idadeValida(), "Edad 61 no debe ser válida");
    }

    // Conjeturas de error
    @Test
    public void testEdadNegativa() {
        p.setIdade(-5);
        assertFalse(p.idadeValida(), "Edad negativa no debe ser válida");
    }

    @Test
    public void testEdadCero() {
        p.setIdade(0);
        assertFalse(p.idadeValida(), "Edad 0 no debe ser válida");
    }

    @Test
    public void testEdadExcesivamenteAlta() {
        p.setIdade(150);
        assertFalse(p.idadeValida(), "Edad 150 no debe ser válida");
    }
}
