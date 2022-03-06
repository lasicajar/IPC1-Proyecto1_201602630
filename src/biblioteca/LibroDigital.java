
package biblioteca;

public class LibroDigital extends Documento{
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    private Integer tamanio;

    public LibroDigital(Integer id, Integer tamanio, Integer tipo, Integer anio_publica, String autor, String descripcion, Integer edicion, String[] palabraClave, String[] temas, String titulo) {
        super(tipo, anio_publica, autor, descripcion, edicion, palabraClave, temas, titulo);
        this.tamanio = tamanio;
        this.id= id;
    }
    
    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }
   
    
}
