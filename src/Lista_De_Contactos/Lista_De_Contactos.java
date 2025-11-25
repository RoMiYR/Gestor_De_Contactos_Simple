package Lista_De_Contactos;

import Contacto.contacto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author josue
 */
public class Lista_De_Contactos {

    /*
    Esta clase es donde se almacena el ArrayList global, se usa de manera estatica para no tener que generar nuevas instancias y evitar errores, se accede a ella
    a travez del getter, ademas, cuenta con un metodo para ordenar la lista que funciona con el .sort y un comparator.
     */
    
    private static ArrayList<contacto> contactos = new ArrayList<>();

    public static ArrayList<contacto> getContactos() {
        return contactos;
    }

    public static void ordenarLista() {
        Collections.sort(contactos, Comparator.comparing(contacto -> contacto.getNombre()));
    }

}
