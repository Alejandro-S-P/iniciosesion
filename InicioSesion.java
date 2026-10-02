import java.util.Scanner;

public class InicioSesion {
    public static void main(String[] args) {
        String user;
        int password;
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        while (contador < 3) {
            System.out.print("Ingrese usuario: ");
            user = sc.nextLine();

            System.out.print("Ingrese contraseña: ");
            password = sc.nextInt();
            sc.nextLine();

            if (user.equals("admin") && password == 1234) {
                System.out.println("inicio de sesion correcto :)");
                break;
            } else {
                contador++;
                if (contador < 3) {
                    System.out.println("usuario o contraseña incorrecta :( Te quedan " + (3 - contador) + " intentos.");
                } else {
                    System.out.println("usuario o contraseña incorrecta :( Has agotado los 3 intentos.");
                }
            }
        }

        sc.close();
    }
}
