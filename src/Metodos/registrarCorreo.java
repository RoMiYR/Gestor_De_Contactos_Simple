package Metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class registrarCorreo {

    public static String registrarCorreo() {

        //Este metodo dentro de un bucle infinito que no se termina a no ser que se cancele la operacion o se cierre la ventana le pide al usuario un correo electronico
        //Con el prefijo de @gmail.com
        while (true) {
            //Pedimos al usuario el correo electronico que desea agregar.
            String correo = JOptionPane.showInputDialog("Ingresa el correo electronico (@gmail.com)");
            //Si el correo electronico es null, quiere decir que se cancelo la operacion y regresamos al menu.
            if (correo == null) {
                JOptionPane.showMessageDialog(null, "Operacion cancelada");
                return "-1";
                //Si no esta vacia, eliminamos los espacios a los lados y verificamos que la cadena no este vacia.
            } else if (correo.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Este campo no puede quedar vacio");
                //Si no esta vacia verificamos que la cadena termine con el sufijo que elegimos.
            } else if (!correo.endsWith("@gmail.com")) {
                JOptionPane.showMessageDialog(null, "El correo debe llevar el sufijo -> @gmail.com");
            } else {
                //Si pasa todas las comprobaciones entonces regresamos el valor del correo electronico.
                return correo;
            }

        }

    }

}
