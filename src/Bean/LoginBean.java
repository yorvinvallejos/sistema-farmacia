
package Bean;

public class LoginBean {
    private int id;
    private String nombres;
    private String correo;
    private String Contraseña;
    private String rol;

    public LoginBean() {
    }

    public LoginBean(int id, String nombres, String correo, String Contraseña,String rol) {
        this.id = id;
        this.nombres = nombres;
        this.correo = correo;
        this.Contraseña = Contraseña;
        this.rol=rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
