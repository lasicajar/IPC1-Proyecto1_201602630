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

        //    users[0]= new Usuario(2016, "lusvin", "sicaja", "lsicaja", "estudiante", "1234");
        //      users[1]= new Usuario(2017, "alex", "rami", "arami", "estudiante", "1234");
//        users[2]= new Usuario(2018, "david", "alof", "dalof", "catedratico", "4321");


        
        PantallaInicio pi = new PantallaInicio();
        pi.setVisible(true);

//            CargaMasiva cm = new CargaMasiva();
//            cm.setVisible(true);
            
        String[] des = {"el mjeor", "libro"};
        String[] des2 = {"el mjeor", "libro", "al mamater"};

        Libro lb2 = new Libro(12, 12, 2124124, 1, 1991, "larmind", "buen libro", 11, des, des2, "un gran libro");

        Usuario us = new Usuario(2120312039, "lusvin", "sicaja", "lsicaja", "estudiante", "123");

    }

}
