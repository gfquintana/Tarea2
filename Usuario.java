
import java.util.Objects;

public class Usuario{
    
   String nombre;
   String cédula;
   String contraseña;
   int edad;
   int cantidadDeHijos;
   int saldo=0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCédula() {
        return cédula;
    }

    public void setCédula(String cédula) {
        this.cédula = cédula;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidadDeHijos() {
        return cantidadDeHijos;
    }

    public void setCantidadDeHijos(int cantidadDeHijos) {
        this.cantidadDeHijos = cantidadDeHijos;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public Usuario (String name, String ci, String psw, int age, int cantHijos, int sal ){
        nombre= name;
        ci= cédula;
        psw= contraseña;
        cantHijos= cantidadDeHijos;
        sal=saldo;
        
    }

    
    @Override
    public boolean equals(Object obj) {
        
        Usuario u = (Usuario) obj;
        if (!Objects.equals(this.contraseña, u.contraseña)) {
            return false;
        }
        return true;
    }
    
    
    
    
}