package usuarios.interfaces;

public interface Contacto {

    public String getMail();
    public int getTelefono();
    
    default public void perfilStatus(){
        System.out.println("Tenemos métodos de nombre y apellido");
    }
}
