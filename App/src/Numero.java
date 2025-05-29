public class Numero {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Numeros [numero=" + numero + "]";
    }

    public boolean esNumeroPar() {
        return numero % 2 == 0;
    }

    public boolean terminaEnCero() {
       
        return numero%10==0;
    }

    public boolean isNumero73(){
        return numero==73;
    }

    
}

