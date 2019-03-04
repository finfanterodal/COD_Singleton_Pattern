/*
*No tiene que dejar instanciar : private constructor.
*Método para obtener una instancia.
*Solo puede haber un número limitado de objetos(límite de un objeto).
*Podremos tener subclases.
*EJEMPLO:
*Instanciar un singleton, y utilizarlo asignándole valores y mostrándolos.
 */
package singletonpattern;

/**
 *
 * @author finfanterodal
 */
public class SingletonPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instantiating Singleton class with variable x 
        Singleton x = Singleton.getInstance();

        // instantiating Singleton class with variable y 
        Singleton y = Singleton.getInstance();

        x.setNome("Fran");
        x.setApellido("Infante");
        x.setDni("4355");

        System.out.println(x.toString());

        y.setNome("Paco");
        y.setApellido("Orifante");
        y.setDni("4435");
        
        System.out.println(x.toString());
        System.out.println(y.toString());

    }

}
