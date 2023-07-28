
package Bean;

public class DetalleBean {
    private int id;
private int codigo_medicamento;
private int cantidad;
private double precio;
private int id_venta;

    public DetalleBean() {
    }

    public DetalleBean(int id, int codigo_medicamento, int cantidad, double precio, int id_venta) {
        this.id = id;
        this.codigo_medicamento = codigo_medicamento;
        this.cantidad = cantidad;
        this.precio = precio;
        this.id_venta = id_venta;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo_medicamento() {
        return codigo_medicamento;
    }

    public void setCodigo_medicamento(int codigo_medicamento) {
        this.codigo_medicamento = codigo_medicamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
