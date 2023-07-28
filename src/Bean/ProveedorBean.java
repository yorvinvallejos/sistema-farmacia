
package Bean;

public class ProveedorBean {
    
        private int id;
private int ruc;
private String nombres;
private int telefono;
private String direccion;
private String razon;

    public ProveedorBean(int id, int ruc, String nombres, 
            int telefono, String direccion, String razon) {
        this.id = id;
        this.ruc = ruc;
        this.nombres = nombres;
        this.telefono = telefono;
        this.direccion = direccion;
        this.razon = razon;
    }

    public ProveedorBean() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }
}
