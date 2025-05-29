import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Numero> numeros = new ArrayList<>();

        Numero num;
        for (int i=37;i<=137;i++){
            num = new Numero(i);
            
            if (i <= 137-1){
                 if (num.esNumeroPar())
                    numeros.add(num);

            }else if (num.esNumeroPar()&&!num.terminaEnCero())
                  numeros.add(num);
            }

        System.out.println("Lista de números pares del 37 al 173");
           
        for (Numero n: numeros){
            System.out.println(n);
        }

        num = new Numero(73);

        if (!num.esNumeroPar()){
            System.out.println("El numero 73 no cumple con la norma de ser par, no es posible agregarlo a la lista");
        }

    }
}
