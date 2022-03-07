package biblioteca;

public class Usuario {

    private Integer id; //el DPI 
    private String nombre;
    private String apellido;
    private String user; //nickename
    private String rol;
    private String password;
    private Libro[] libro;
    private Revista[] revista;
    private Tesis[] tesis;
    private LibroDigital[] libroDigital;

    public Usuario(Integer id, String nombre, String apellido, String user, String rol, String password, Libro[] libro, Revista[] revista, Tesis[] tesis, LibroDigital[] libroDigital) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.user = user;
        this.rol = rol;
        this.password = password;
        this.libro = libro;
        this.revista = revista;
        this.tesis = tesis;
        this.libroDigital = libroDigital;
    }

    public Usuario(Integer id, String nombre, String apellido, String user, String rol, String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.user = user;
        this.rol = rol;
        this.password = password;
    }
    
    

    public Libro[] getLibro() {
        return libro;
    }

    public void setLibro(Libro[] libro) {
        this.libro = libro;
    }

    public Revista[] getRevista() {
        return revista;
    }

    public void setRevista(Revista[] revista) {
        this.revista = revista;
    }

    public Tesis[] getTesis() {
        return tesis;
    }

    public void setTesis(Tesis[] tesis) {
        this.tesis = tesis;
    }

    public LibroDigital[] getLibroDigital() {
        return libroDigital;
    }

    public void setLibroDigital(LibroDigital[] libroDigital) {
        this.libroDigital = libroDigital;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getlogeo(){
    return ("Bienvenido: "+ this.user );  
    }
    
    public String getDatoslog() {
        return ("ID: "+ this.id + "\n" + "Nombre: " + this.nombre +" "+ this.apellido+ " \n"+ "Nickname: "+ this.user+ "\n"+ "Rol: "+ this.rol);
    }

    
    
    
}
