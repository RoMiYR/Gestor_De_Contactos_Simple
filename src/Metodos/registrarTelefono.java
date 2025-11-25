package Metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class registrarTelefono {

    public static String registrarTelefono() {

        // Este metodo dentro de un bucle que no se termina amneos que se cierre la ventana o se cancele la operacion, le pide al usuario que ingrese el telefono del
        //contacto a registrar.
        while (true) {
            //Pedimos al usuario que ingrese el numero de telefono del contacto.
            String telefono = JOptionPane.showInputDialog("Ingresa el numero telefonico del contacto");
            //Verificamos si el valor es nulo.
            if (telefono == null) {
                JOptionPane.showMessageDialog(null, "Operacion cancelada");
                return "-1";
                //Eliminamos los espacios a los lados y verificamos si la cadena esta vacia.
            } else if (telefono.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Este campo no puede quedar vacio");
                //Verificamos que el telefono no tenga menos de 10 digitos
            } else if (telefono.length() < 10) {
                JOptionPane.showMessageDialog(null, "El numero de telefono no puede tener menos de 10 digitos");
                //Verificamos si el telefono no tiene mas de 10 digitos
            } else if (telefono.length() > 10) {
                JOptionPane.showMessageDialog(null, "El numero de telefono no puede tener mas de 10 digitos");
            } else {
                //Si pasa todas las comprobaciones, devolvemos el valor del telefono,
                return telefono;
            }

        }

    }

}
