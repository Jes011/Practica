
package PracticaParcial;

/**
 *
 * @author Jes011
 * @github https://github.com/Jes011
 */
public class Nodo {

    private Process proceso;
    private Nodo siguiente,anterior; 
    
    public Nodo(Process proceso) {
        this.proceso = proceso;
        siguiente = null;
        anterior = null;
    }

    public void setProcess(Process proceso) {
        this.proceso = proceso;
    }
    
    public Process getProcess(){
        return this.proceso;
    }


    public void setSiguiente(Nodo sig) {
        siguiente = sig;
    }

    public void setAnterior(Nodo ant) {
        anterior = ant;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }
}

