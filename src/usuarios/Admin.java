package usuarios;

import usuarios.enums.Categoria;
import usuarios.enums.Clase;

public class Admin extends Datos {

    public Admin(String nombre, String apellido, String email, int telefono, int dni) {
        super(nombre, apellido, email, telefono, dni);
    }

    @Override
    public Clase getClase() {
        return Clase.A;
    }

    @Override
    public Categoria getCategoria() {
        return Categoria.A;
    }

    

}
