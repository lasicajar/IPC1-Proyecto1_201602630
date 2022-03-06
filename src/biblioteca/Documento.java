
package biblioteca;


public abstract class Documento {
    
    private Integer tipo;
    private Integer anio_publica;
    private String autor;
    private String descripcion;
    private Integer edicion;
    private String[] palabraClave;
    private String[] temas;
    private String titulo;

    public Documento(Integer tipo, Integer anio_publica, String autor, String descripcion, Integer edicion, String[] palabraClave, String[] temas, String titulo) {
        this.tipo = tipo;
        this.anio_publica = anio_publica;
        this.autor = autor;
        this.descripcion = descripcion;
        this.edicion = edicion;
        this.palabraClave = palabraClave;
        this.temas = temas;
        this.titulo = titulo;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }
    
    public Integer getAnio_publica() {
        return anio_publica;
    }

    public void setAnio_publica(Integer anio_publica) {
        this.anio_publica = anio_publica;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getEdicion() {
        return edicion;
    }

    public void setEdicion(Integer edicion) {
        this.edicion = edicion;
    }

    public String[] getPalabraClave() {
        return palabraClave;
    }

    public void setPalabraClave(String[] palabraClave) {
        this.palabraClave = palabraClave;
    }

    public String[] getTemas() {
        return temas;
    }

    public void setTemas(String[] temas) {
        this.temas = temas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    
    
    
}

