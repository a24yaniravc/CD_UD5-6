public class Persoa {

    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean idadeValida(){
        if (this.idade>=18 && this.idade<=60){
            return true;
        }else{
            return false;
        }
    }
}