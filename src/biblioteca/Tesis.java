
package biblioteca;


public class Tesis extends Documento{
    private Integer id;
    private Integer copias;
    private Integer disponibles;
    private String area;

    public Tesis(Integer id, Integer copias, Integer disponibles, String area, Integer tipo, Integer anio_publica, String autor, String descripcion, Integer edicion, String[] palabraClave, String[] temas, String titulo) {
        super(tipo, anio_publica, autor, descripcion, edicion, palabraClave, temas, titulo);
        this.copias = copias;
        this.disponibles = disponibles;
        this.area = area;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    
    
    
}
