public class Contacto {
    String nombre;
    String apellido;
    String telefono;

    //constructor
    public Contacto (String nombre, String apellido, String telefono){
        setNombre(nombre);
        setApellido(apellido);
        setTelefono(telefono);

    } // constructor

    public String getNombre() {
        return nombre;
    } // getNombre

    public void setNombre(String nombre) {
        if(nombre.isBlank()){
        } else {
            this.nombre = nombre.trim().toUpperCase();
        } // else
    } // setNombre

    public String getApellido() {
        return apellido;
    } // getApellido

    public void setApellido (String apellido) {
            if(apellido.isBlank()){
            } else {
                this.apellido= apellido.trim().toUpperCase();
            } //  else
    } // setApellido

    public String getTelefono() {
        return telefono;
    } // getTelefono

    public void setTelefono(String telefono) {
            if(telefono.isBlank()){
            } else {
                this.telefono = telefono.trim();
            } //  else
        } // setTelefono



    @Override
    public String toString() {
        return nombre + " " + apellido + " " + telefono;
    }
} // Contacto




