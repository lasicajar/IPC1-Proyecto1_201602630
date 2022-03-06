
package biblioteca;

public class Libro extends Documento{
    
    private Integer copias;
    private Integer disponibles;
    private Integer isbn;

    public Libro(Integer copias, Integer disponibles, Integer isbn, Integer tipo, Integer anio_publica, String autor, String descripcion, Integer edicion, String[] palabraClave, String[] temas, String titulo) {
        super(tipo, anio_publica, autor, descripcion, edicion, palabraClave, temas, titulo);
        this.copias = copias;
        this.disponibles = disponibles;
        this.isbn = isbn;
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

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }
    
    
    
    
}
