package Listar_Contactos;

import Contacto.contacto;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class listar_Contactos {

    /*
    Este metodo se encarga de mostrar a los contactos registrados, pero primero verifica que la lista no esta vacia para despues proseguir al concatenar los datos del contacto
    en un StringBuilder, al final se muestra la lista de los contactos registrados.
    */
    
    public static void listarContactos() {

        if (Lista_De_Contactos.Lista_De_Contactos.getContactos().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Aun no hay contactos registrados");
            return;
        }

        Lista_De_Contactos.Lista_De_Contactos.ordenarLista();

        StringBuilder listaDeContactos = new StringBuilder();

        for (contacto contactoActual : Lista_De_Contactos.Lista_De_Contactos.getContactos()) {
            listaDeContactos.append(contactoActual.getNombre()).append("/").append(contactoActual.getTelefono()).append("/").append(contactoActual.getCorreo()).append("\n");
        }

        JOptionPane.showMessageDialog(null, "Mostrando lista de contactos registrados\n"
                + listaDeContactos.toString());

    }

}
