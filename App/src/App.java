import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Numero> numeros = new ArrayList<>();

        Numero num;
        for (int i=37;i<=137;i++){
            num = new Numero(i);
            
            if (i <= 137-1){
                 if (num.esNumeroPar() && !num.terminaEnCero()||num.isNumero73())
                    numeros.add(num);
            }

        System.out.println("Lista de números pares del 37 al 173 incluyendo el número 73");
           
        for (Numero n: numeros){
            System.out.println(n);
        }

    }
}
}