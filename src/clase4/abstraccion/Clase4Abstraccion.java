package clase4.abstraccion;

import java.util.HashSet;
import java.util.LinkedList;
import usuarios.Admin;
import usuarios.Usuario;
import usuarios.enums.Categoria;
import usuarios.enums.Clase;

public class Clase4Abstraccion {

    public static void main(String[] args) {

        // LinkedList
        
        LinkedList enlazado = new LinkedList();
        
        enlazado.add("Pedro");
        enlazado.add(23);
        enlazado.add(true);
        enlazado.add(null);
        enlazado.add(true);
        enlazado.add(null);
        
        System.out.println(enlazado);
        System.out.println(enlazado.getFirst());
        System.out.println(enlazado.getLast());
        System.out.println(enlazado.get(2));
        
        enlazado.remove();
        System.out.println(enlazado);
        
        enlazado.remove(1);
        System.out.println(enlazado);
        
        
        
        // HashSet
        
        HashSet set1 = new HashSet();
        
        set1.add("Hola");
        set1.add(1);
        set1.add(2.35);
        set1.add(true);
        set1.add(2.35);
        set1.add(true);

        System.out.println(set1 + " " + set1.size());
        
        for(Object item: set1)
            System.out.println("For: " + item);
        
        set1.remove(2.35);
        System.out.println(set1);
        
        System.out.println(set1.contains(1));
        
        
        
        
        // Abstraccion
        
        Usuario user1 = new Usuario("Juan", "Mendez", "juan@mail.com", 1511111234, 123123123, Clase.Intermedio, Categoria.B);
        System.out.println(user1.getAll());
        System.out.println(user1.getClase());
        
        Admin admin1 = new Admin("admin", "admin", "", 0, 0);
        System.out.println(admin1.getClase());
        
        user1.perfilStatus();
        System.out.println(user1.getAll().get(2));
        
        

        



    }

}
