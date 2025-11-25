package Agregar_Contacto;

import Contacto.contacto;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class Agregar_Contacto {

    /*
    Esta clase es la encarga de obtener los datos de un objeto del tipo "contacto" para despues agregarlo a el arrayList, antes de eso, despues de recibir cada dato
    se verifica que no haya regresado el valor de "-1" ya que si devuelve ese valor, quiere decir que cancelo la operacion y el dato quedara vaciom por lo que con
    un return se regresa al menu.
     */
    
    public static void agregarContacto() {

        String nombre = Metodos.registrarNombre.registrarNombre();
        if (nombre.equals("-1")) {
            return;
        }

        String telefono = Metodos.registrarTelefono.registrarTelefono();
        if (telefono.equals("-1")) {
            return;
        }

        String correo = Metodos.registrarCorreo.registrarCorreo();
        if (correo.equals("-1")) {
            return;
        }

        contacto nuevoContacto = new contacto(nombre, telefono, correo);

        Lista_De_Contactos.Lista_De_Contactos.getContactos().add(nuevoContacto);
        JOptionPane.showMessageDialog(null, "Contacto registrado con exito");
    }
}
