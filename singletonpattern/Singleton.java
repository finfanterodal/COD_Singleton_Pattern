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
public class Singleton {
    
    //
    private String nome;
    private String apellido;
    private String dni;
    private static Singleton INSTANCE =null; 
    //
    private Singleton() {}

    /*private Singleton(String nome, String apellido, String dni) {
        this.nome = nome;
        this.apellido = apellido;
        this.dni = dni;

    }*/

    //        
    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    //
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Singleton{" + "nome=" + nome + ", apellido=" + apellido + ", dni=" + dni + '}';
    }
    
    
}
