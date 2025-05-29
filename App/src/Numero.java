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
        String numText = String.valueOf(numero);
        char ultimoCaracter = numText.charAt(numText.length() - 1);
        return ultimoCaracter == '0';
    }

    
}

