public class Agenda {

    private Contacto[] contactos;
    private int contador;

    // Constructor
    public Agenda() {
        contactos = new Contacto[10];
        contador = 0;
    }  //constructorAgenda

    //Verificar si un contacto existe.
    public boolean existeContacto (Contacto c){
        for(int i = 0; i< contador; i++){
            if (contactos[i].getNombre().equalsIgnoreCase(c.getNombre())
            &&  contactos[i].getApellido().equalsIgnoreCase(c.getApellido())){
                return true;
            }//if
        } // for
        return false;
    } // existeContacto

    //AgregarContacto()
    public void agregarContacto (Contacto c){
        if(existeContacto(c)){
            System.out.println(">ERROR: El contacto ya existe");
        } else if
         (contador == 10){
            System.out.println(">ERROR: Agenda llena.");
        } else if (c.getApellido() == null || c.getNombre() == null || c.getTelefono() == null) {
            System.out.println(">ERROR: El nombre, apellido o télefono no pueden ir vacios.");
         } else {
            contactos[contador] = c;
            contador++;
            System.out.println("Contacto agregado con exito");
        }//else
    }  // Metodo agregarContacto

    //listarContactos():
    public void listarContactos(){
        if(contador == 0){
            System.out.println(">ERROR: Agenda Vacía.");
        } else {
            for (int i = 0; i < contador -1; i++) { //1er for selecciona un contacto
                for (int j = i + 1; j < contador; j++) { //2do for compara y ordena 2 contactos
                    String persona1 = contactos[i].getNombre() + " " + contactos[i].getApellido();
                    String persona2 = contactos[j].getNombre() + " " + contactos[j].getApellido();

                    //compareToIgnoreCase = compara textos alfabeticamente
                    if (persona1.compareToIgnoreCase(persona2) > 0) { //3er for recorre e imprime los contactos
                        Contacto provisional = contactos[i];
                        contactos[i] = contactos[j];
                        contactos[j] = provisional;
                    }
                }
            }
            for (int i = 0; i < contador; i++) {
                System.out.println(contactos[i]);
            }
        }//else
    }// Metodo Listar Contacto

    //buscaContacto(String nombre):
    public void buscaContacto(String nombre, String apellido) {
        //Si lo encuentra muenstra mensaje y la informacion del contacto
        for(int i = 0; i< contador; i++){
            if (contactos[i].getNombre().equalsIgnoreCase(nombre)
                    &&  contactos[i].getApellido().equalsIgnoreCase(apellido)){
                System.out.println("Contacto encontrado:");
                System.out.println("Nombre: " + contactos[i].getNombre());
                System.out.println("Apellido: " + contactos[i].getApellido());
                System.out.println("Teléfono: " + contactos[i].getTelefono());
                return;
            }//if
        } // for
        //Si termina el ciclo y no lo encuentra
        System.out.println("Contacto no registrado");
    }//buscaContacto

    //eliminarContacto

    public void eliminarContacto (Contacto c) {
           int indiceEncontrado = -1;

           for(int i = 0; i < contador; i++){
               if (contactos[i].getNombre().equalsIgnoreCase(c.getNombre()) &&
                   contactos[i].getApellido().equalsIgnoreCase(c.getApellido())){
                   indiceEncontrado = i;
                   break;
               } // if
           } // for
           if (indiceEncontrado == -1) {
                 System.out.println("El contacto no se encuentra en la agenda");
                 return;
                 } // if

           for (int i = indiceEncontrado; i < contador -1; i++){
                contactos[i] = contactos[i +1];
            }// for

            contactos[contador -1] = null;
            contador--;

            System.out.println("¡Contacto eliminado con éxito!");

    }  // eliminarContacto

    //modificarTelefono:

    public void modificarTelefono(String nombre, String apellido, String nuevoTelefono){
        boolean encontrado = false; // partimos de la idea de que aún no encontramos a la persona
        for (int i=0; i < contador; i++){
            if (contactos[i].getNombre().equalsIgnoreCase(nombre) && contactos[i].getApellido().equalsIgnoreCase(apellido)){
                contactos[i]. setTelefono(nuevoTelefono);
                System.out.println("Téléfono modificado con éxito");
                encontrado = true;
                break;
            }//if
        }//for
        if (!encontrado){
            System.out.println("El contacto no existe");
        }//if

    } //modificarTelefono


    //agendaLlena()
    public boolean agendaLlena(){
        if (contador == 10){
            System.out.println(">ERROR: Agenda llena.");
            return true;
        } else {
            return false;
        }//else
    }//Metodo agendaLlena

    // espacioLibres():
    public void espacioLibres() {
        int libres = contactos.length - contador;
        System.out.println("Se pueden agregar " + libres + " contactos más.");
    } // espacioLibres
} // Agenda
