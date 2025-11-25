package Menu;

import Metodos.buscar_Contacto_Por_Nombre;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class menu {

    public static void menu() {

        /*
        Este es el menu interactivo, esta dentro del un while para que no se detenga a menor que el usuario ingrese el numero 4 o cierre la ventana, cada numero accede
        a un metodo ya creado.
         */
        
        while (true) {

            String opcionSeleccionada = JOptionPane.showInputDialog("Selecciona una de las siguientes opciones\n"
                    + "1 -> Agregar contacto\n"
                    + "2 -> Listar contactos\n"
                    + "3 -> Buscar contactos\n"
                    + "4 -> Cerrar Programa");

            if (opcionSeleccionada == null) {
                JOptionPane.showMessageDialog(null, "Cerrando aplicacion");
                return;
            }

            switch (opcionSeleccionada) {
                case "1" -> {
                    Agregar_Contacto.Agregar_Contacto.agregarContacto();
                }
                case "2" -> {
                    Listar_Contactos.listar_Contactos.listarContactos();
                }
                case "3" -> {
                    buscar_Contacto_Por_Nombre.buscarContactoPorNombre();
                }
                case "4" -> {
                    JOptionPane.showMessageDialog(null, "Cerrando aplicacion");
                    return;
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Debes elegir una opcion valida");
                }
            }

        }

    }

}
