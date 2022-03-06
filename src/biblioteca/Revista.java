package biblioteca;

public class Revista extends Documento {

    private Integer id;
    private String categoria;
    private Integer copias;
    private Integer disponibles;
    private Integer ejemplares;

    public Revista(Integer id, String categoria, Integer copias, Integer disponibles, Integer ejemplares, Integer tipo, Integer anio_publica, String autor, String descripcion, Integer edicion, String[] palabraClave, String[] temas, String titulo) {
        super(tipo, anio_publica, autor, descripcion, edicion, palabraClave, temas, titulo);
        this.categoria = categoria;
        this.copias = copias;
        this.disponibles = disponibles;
        this.ejemplares = ejemplares;
        this.id= id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getCopias() {
        return copias;
    }

    public void setCopias(Integer copias) {
        this.copias = copias;
    }

    public Integer getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(Integer disponibles) {
        this.disponibles = disponibles;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

}
