
package gestionDeReservas.entidad;

import java.util.List;


public class Usuario {
    
    private String nombre;
    private String apellido;
    private String nick;
    private String email;
    private String password;
    private List<Rol> roles;

    public Usuario() {
    }

    
    public Usuario(String nombre, String apellido,
            String nick, String email, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nick = nick;
        this.email = email;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Rol> getRoles() {
        return roles;
    }
    
    public void agregarRol(Rol unRol){
        roles.add(unRol);
    }
    
  
    
    @Override
    public String toString(){
        return "Nick: " + nick;
    }
    
    
    
}
