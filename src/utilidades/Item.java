package utilidades;

/**
 *
 * @author Federico
 */
public class Item {

    private String descripcion;

    public Item() {
        this.descripcion = "";
    }

    public Item(String x) {
        this.descripcion = x;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void visualizar() {
        System.out.println(this.descripcion);
    }
}
