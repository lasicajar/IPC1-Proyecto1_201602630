
package biblioteca;

public class Administrador {
    
    private Integer id;
    private String nombre;
    private String user;
    private String rol;
    private String password;

    public Administrador(Integer id, String nombre, String user, String rol, String password) {
        this.id = id;
        this.nombre = nombre;
        this.user = user;
        this.rol = rol;
        this.password = password;
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
    
    
    
    
}
