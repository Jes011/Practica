
package listasenlazadasdobles;

/**
 *
 * @author Jes011
 * @github https://github.com/Jes011
 */
public class main {
    
    public static void main(String... args){
    ListaEnlazadaDoble aa = new ListaEnlazadaDoble();
    
    aa.agregar(new Nodo("pepe"));
    aa.agregar(new Nodo("pepe2"));
    aa.agregar(new Nodo("pepe3"));
    
    aa.agregarAcabeza(new Nodo("Lorenzo"));
    
    
    Nodo a = aa.getCabeza();
    
    while(a!=null){
        System.out.println(a.getNombre());
        a= a.getSiguiente();
    }
    
    }
}
