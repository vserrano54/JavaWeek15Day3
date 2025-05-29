import java.util.Scanner;

public class LogInUser {
    private String usuario;
    private final String clave;
    private boolean bloqueado;

    public LogInUser(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
        this.bloqueado = false;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public boolean ingresar(Scanner teclado) {
        if (bloqueado) {
            System.out.println("Acceso bloqueado.");
            return false;
        }

        System.out.print("Ingrese usuario: ");
        String Usuario = teclado.nextLine();

        System.out.print("Ingrese contraseña: ");
        String Clave = teclado.nextLine();

        if (validar(Usuario, Clave)) {
            System.out.println("¡Bienvenido " + usuario + "!");
            return true;
        } else {
            System.out.println("Usuario o contraseña incorrecta.");
            return false;
        }
    }

    private boolean validar(String usuario, String clave) {
        return this.usuario.equals(usuario) && this.clave.equals(clave);
    }

    @Override
    public String toString() {
        return "LogInUser [usuario=" + usuario + ", clave=" + clave + ", bloqueado=" + (bloqueado ? "sí" : "no") + "]";
    }
}
