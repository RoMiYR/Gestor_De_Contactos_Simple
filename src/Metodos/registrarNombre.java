package Metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class registrarNombre {

    public static String registrarNombre() {

        /*
        Este metodo dentro de un bucle que no se termina amneos que se cierre la ventana o se cancele la operacion, le pide al usuario que ingrese su nombre
        */
        while (true) {
            //Pedimos al usuario que ingrese su nombre.
            String nombre = JOptionPane.showInputDialog("Ingresa el nombre del contacto");
            //Verificamos si el valor del nombre es nulo.
            if (nombre == null) {
                JOptionPane.showMessageDialog(null, "Operacion cancelada");
                return "-1";
                //Eliminamos los espacios al los lados y comprobamos si la cadena esta vacia.
            } else if (nombre.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No puedes registrar un contacto sin un nombre!");
            } else {
                //Si pasa todas las comprobaciones, regresamos el valor del nombre introducido.
                return nombre;
            }

        }

    }

}
