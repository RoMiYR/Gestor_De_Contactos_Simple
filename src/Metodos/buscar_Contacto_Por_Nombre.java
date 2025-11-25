package Metodos;

import Contacto.contacto;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class buscar_Contacto_Por_Nombre {

    /*
    Este metodo busca a un contacto que contenga una prefijo o palabra, pero primero verifica que la lista no este vacia o que solo tenga un contacto registrado.
     */
    public static void buscarContactoPorNombre() {

        //Verificamos que la lista no este vacia
        if (Lista_De_Contactos.Lista_De_Contactos.getContactos().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Aun no hay contactos registrados para hacer la busqueda");
            return;
            //Verificamos si la lista solo tiene un solo contacto registrado
        } else if (Lista_De_Contactos.Lista_De_Contactos.getContactos().size() == 1) {
            JOptionPane.showMessageDialog(null, "Solo hay un contacto registrado");
            return;
        }

        //Metemos todo dentro de un bucle que no se termina a menos que se cierre la pestaña
        while (true) {

            //Pedimos al usuario el prefijo
            String prefijo = JOptionPane.showInputDialog("Ingresa el nombre o prefijo a buscar");
            //Verificamos que no se haya cerrado la ventana
            if (prefijo == null) {
                JOptionPane.showMessageDialog(null, "Operacion cancelada");
                return;
                //Eliminamos los espacios del la izquierda y derecha y despues comprobamos si la cadena ingresada esta vacia.
            } else if (prefijo.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debes ingresar un nombre o prefijo");
            } else {
                //Si la cadena no esta vacia, creamos un StringBuilder que guardara los nombres de los contacctos.
                StringBuilder nombresContenedores = new StringBuilder();
                //Con un for each recorremos toda la lista.
                for (contacto contactoActual : Lista_De_Contactos.Lista_De_Contactos.getContactos()) {
                    //Concatenamos los nombres que contengan el prefijo elegido.
                    if (contactoActual.getNombre().contains(prefijo)) {
                        nombresContenedores.append(contactoActual.getNombre()).append("/").append(contactoActual.getTelefono()).append("/").append(contactoActual.getCorreo()).append("\n");
                    }

                }
                //Verificamos si l lista esta vacia, lo que quire decir que no habia contactos registrados que contengan ese prefijo.
                if (nombresContenedores.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay nombres que contengan " + prefijo);
                    return;
                    //Si la lista no esta vacia, mostramos las coincidencias.
                } else {
                    JOptionPane.showMessageDialog(null, "Se encontraron las siguientes coincidencias\n"
                            + nombresContenedores.toString());
                    return;
                }

            }

        }

    }

}
