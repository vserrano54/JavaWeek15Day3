import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * 2- LOG-IN tres intentos
            Crea la clase LogInUser, con las propiedades:
            - String usuario
            - String clave
            - boolean bloqueado
            Siendo clave final, es decir constante para cada usuario (no se puede cambiar una vez creada, 
            y se crea al hacer new LogInUser() y pasarle los parámetros).
            Condición: el usuario debe introducir la clave correcta en maximo 3 intentos, si hace tres, 
            el boolean bloqueado queda como TRUE y no funciona más el método, 
            (solo para decirle que ha hecho demasiados intentos y el acceso está bloqueado)

         */
        final int MAX_INTENTOS = 3;
        int intentos = 0;
        boolean accesoConcedido = false;

        LogInUser login = new LogInUser("vserrano", "123456");
        Scanner teclado = new Scanner(System.in);

        while (!login.isBloqueado() && intentos < MAX_INTENTOS && !accesoConcedido) {
            accesoConcedido = login.ingresar(teclado);
            intentos++;

            if (!accesoConcedido && intentos == MAX_INTENTOS) {
                login.setBloqueado(true);
                System.out.println("Demasiados intentos. Usuario bloqueado.");
            }
        }

        if (accesoConcedido) {
            System.out.println("Sesión iniciada correctamente.");
        }

        teclado.close();
    }
}