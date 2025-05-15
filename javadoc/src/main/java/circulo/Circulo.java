package circulo;

/**
 * La clase {@code Circulo} representa un círculo en un plano cartesiano,
 * definido por su centro (coordenadas X e Y) y su radio.
 * Proporciona métodos para modificar y consultar sus propiedades, así como
 * para calcular su diámetro, circunferencia y área.
 */
public class Circulo {
    private int x;            // Coordenada X del centro
    private int y;            // Coordenada Y del centro
    private double radio;     // Radio del círculo

    /**
     * Constructor que inicializa el círculo con valores dados.
     * 
     * @param valorX Coordenada X del centro
     * @param valorY Coordenada Y del centro
     * @param valorRadio Radio del círculo
     */
    public Circulo(int valorX, int valorY, double valorRadio) {
        establecerX(valorX);
        establecerY(valorY);
        establecerRadio(valorRadio);
    }

    /**
     * Establece la coordenada X del centro.
     * 
     * @param valorX nuevo valor de X
     */
    public void establecerX(int valorX) {
        x = valorX;
    }

    /**
     * Obtiene la coordenada X del centro.
     * 
     * @return coordenada X
     */
    public int obtenerX() {
        return x;
    }

    /**
     * Establece la coordenada Y del centro.
     * 
     * @param valorY nuevo valor de Y
     */
    public void establecerY(int valorY) {
        y = valorY;
    }

    /**
     * Obtiene la coordenada Y del centro.
     * 
     * @return coordenada Y
     */
    public int obtenerY() {
        return y;
    }

    /**
     * Establece el radio del círculo.
     * Si el valor es negativo, se establece como 0.0.
     * 
     * @param valorRadio nuevo valor del radio
     */
    public void establecerRadio(double valorRadio) {
        radio = (valorRadio < 0.0 ? 0.0 : valorRadio);
    }

    /**
     * Obtiene el radio del círculo.
     * 
     * @return radio actual
     */
    public double obtenerRadio() {
        return radio;
    }

    /**
     * Calcula y devuelve el diámetro del círculo.
     * 
     * @return diámetro (2 * radio)
     */
    public double obtenerDiametro() {
        return radio * 2;
    }

    /**
     * Calcula y devuelve la circunferencia del círculo.
     * 
     * @return circunferencia (π * diámetro)
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    /**
     * Calcula y devuelve el área del círculo.
     * 
     * @return área (π * radio²)
     */
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    /**
     * Devuelve una representación en cadena del círculo, con sus coordenadas y radio.
     * 
     * @return una cadena con la forma "Centro = [x, y]; Radio = r"
     */
    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }
}
