import org.junit.jupiter.api.Test;

import obtenerDivisores.Game;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    @Test
    public void testNumeroInvalidoLanzaExcepcion() {
        Game game = new Game();
        Exception exception = assertThrows(Exception.class, () -> {
            game.obtenerDivisores((byte) 0);
        });
        assertEquals("Error. El número tiene que ser >0 y <=127", exception.getMessage());
    }

    @Test
    public void testNumeroUno() throws Exception {
        Game game = new Game();
        String resultado = game.obtenerDivisores((byte) 1);
        assertEquals("1", resultado);  // Solo 1 es divisor de 1
    }

    @Test
    public void testNumeroPrimo() throws Exception {
        Game game = new Game();
        String resultado = game.obtenerDivisores((byte) 7);
        assertEquals("1 7", resultado);  // Divisores de 7: 1 y 7
    }

    @Test
    public void testNumeroCompuesto() throws Exception {
        Game game = new Game();
        String resultado = game.obtenerDivisores((byte) 6);
        assertEquals("1 2 3 6", resultado);  // Divisores de 6: 1, 2, 3, 6
    }
}
