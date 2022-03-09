package biblioteca;

import Presentacion.*;

/**
 *
 * @author Lusvin
 */
public class Biblioteca {

    //Variables globales
    //Usuario administrador
    public static Administrador admin1 = new Administrador(1, "admin", "admin", "admin", "admin");
    //Conteo de Usuario y vector de usuarios.
    public static Integer contuser = 0;
    public static Usuario users[] = new Usuario[10];
   
    //Conteo de Documentos y vector de documentos. 
    public static Integer contlibros = 0;
    public static Integer contrevistas = 0;
    public static Integer conttesis = 0;
    public static Integer contlibrodigital = 0;

    public static Libro libros[] = new Libro[50];
    public static Revista revistas[] = new Revista[50];
    public static Tesis tesis[] = new Tesis[50];
    public static LibroDigital librosDigital[] = new LibroDigital[30];

    public static void main(String[] args) {

        PantallaInicio pi = new PantallaInicio();
        pi.setVisible(true);

        

    }

}
