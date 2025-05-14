package obtenerDivisores;
public class Game {
    public String obtenerDivisores(byte n) throws Exception {
        if (n<=0) throw (new Exception("Error. El número tiene que ser >0 y <=127"));
        String resultado = "1";
        for (byte i=2; i<=n; i++) {
            if (n%i==0) {
                resultado=resultado+" "+i;
            }
        }
        return resultado;
    }
}