import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Llamar a Scanner

        Agenda ag = new Agenda();

        // MENÚ PRINCIPAL

        int opcion = 0;

        while (opcion!= 9){
            System.out.println("════════════════════════════════════════════");
            System.out.println("          SISTEMA AGENDA  ");
            System.out.println("════════════════════════════════════════════");
            System.out.println("  1. Registrar un nuevo contacto");
            System.out.println("  2. Verificar contacto existente");
            System.out.println("  3. Listar contactos");
            System.out.println("  4. Buscar contacto");
            System.out.println("  5. Eliminar contacto");
            System.out.println("  6. Modificar télefono");
            System.out.println("  7. Verificar si la agenda esta llena");
            System.out.println("  8. Mostrar espacios libres");
            System.out.println("  9. Salir");
            System.out.println("   SELECCIONA UNA OPCIÓN");
            System.out.println("════════════════════════════════════════════");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("------Agregar Contacto------");
                    System.out.println("Nombre: ");
                    String nombreRegistro = sc.nextLine();
                    System.out.println("Apellido: ");
                    String apellidoRegistro = sc.nextLine();
                    System.out.println("Telefono: ");
                    String telefonoRegistro = sc.nextLine();
                    Contacto nuevo = new Contacto(nombreRegistro, apellidoRegistro, telefonoRegistro);
                    ag.agregarContacto(nuevo);
                    break;

                case 2:
                    System.out.println("------Verificar Contacto Existente------");
                    System.out.println("Ingresa el nombre del contacto a verificar: ");
                    String nombreVerificar = sc.nextLine();
                    System.out.println("Ingresa el apellido del contacto a verificar: ");
                    String apellidoVerificar = sc.nextLine();
                    Contacto buscar = new Contacto(nombreVerificar, apellidoVerificar, "");
                    System.out.println("Existe el contacto: " + ag.existeContacto(buscar));
                    break;

                case 3:
                    System.out.println("------Lista de Contactos------");
                    ag.listarContactos();
                    break;

                case 4:
                    System.out.println("------Buscar Contacto------");
                    System.out.print("Nombre: ");
                    String nombreBusca = sc.nextLine();
                    System.out.print("Apellido: ");
                    String apellidoBusca = sc.nextLine();
                    ag.buscaContacto(nombreBusca, apellidoBusca);
                    break;

                case 5:
                    System.out.println("------Eliminar Contacto------");
                    System.out.println("Ingresa el nombre del contacto: ");
                    String nombreEliminar = sc.nextLine();
                    System.out.println("Ingresa el apellido del contacto: ");
                    String apellidoEliminar = sc.nextLine();
                    
                    Contacto contactoAEliminar = new Contacto(nombreEliminar, apellidoEliminar, "");

                    ag.eliminarContacto(contactoAEliminar);
                    break;

                case 6:
                    System.out.println("------Modificar Teléfono------");
                    System.out.println("Ingresa el nombre del contacto:");
                    String nombre = sc.nextLine();
                    System.out.println("Ingresa el apellido del contacto:");
                    String apellido = sc.nextLine();

                    System.out.println("Ingresa el nuevo teléfono: ");
                    String nuevoTel = sc.nextLine();
                    
                    ag.modificarTelefono(nombre, apellido, nuevoTel );
                    break;

                case 7:
                    System.out.println("------Agenda Llena------");
                    System.out.println("Esta la agenda llena: " + ag.agendaLlena());
                    break;
                    
                case 8:
                    System.out.println("------Espacios Libres------");
                    ag.espacioLibres();
                    break;

                case 9:
                    System.out.println("Gracias por usar la agenda! Saliendo del programa...");
                    break;
            }//switch
        }//while
        sc.close();
    }//psvm
}//Class Main
