package Contacto;

/**
 *
 * @author josue
 */
public class contacto {

    /*
    Esta es la clase del objeto "contacto" con sus atributos, constructores y getters.
    */
    
    //Atributos
    private String nombre;
    private String telefono;
    private String correo;

    //Constructores
    public contacto() {

    }

    public contacto(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    //Metodos
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

}
