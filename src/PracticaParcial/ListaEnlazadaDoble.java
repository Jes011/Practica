
package PracticaParcial;

/**
 *
 * @author Jes011
 * @github https://github.com/Jes011
 */
public class ListaEnlazadaDoble {

    private Nodo cabeza; 

    public ListaEnlazadaDoble() {
        cabeza = null; 
    }

    public void setCabeza(Nodo cab) {
        cabeza = cab;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public Nodo ultimo() {
        Nodo temp = cabeza;
        if (temp != null) {
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }
    public int contarNodos() {
        int cantidad = 0;
        Nodo temp = cabeza;
        while (temp != null) {
            cantidad++;
            temp = temp.getSiguiente();
        }
        return cantidad;
    }
    public void agregar(Nodo nuevo) {
        Nodo temp = ultimo();
        if (temp != null) {
            temp.setSiguiente(nuevo); 
            nuevo.setAnterior(temp); 
            nuevo.setSiguiente(null); 
        } else {
            nuevo.setAnterior(null);
            cabeza = nuevo;
        }
    }
    public void agregarAcabeza(Nodo nuevo) {
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            nuevo.setAnterior(null);
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza = nuevo;
        }
    }

    public Nodo anterior(Nodo nd) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.getSiguiente() == nd) {
                break;
            } else {
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }
    public void eliminar(Nodo nd) {
        Nodo ante;
        if (nd == cabeza) { 
            cabeza = cabeza.getSiguiente();
            if (cabeza != null) {
                cabeza.setAnterior(null);
            }
        } else { 
            ante = anterior(nd);
            ante.setSiguiente(nd.getSiguiente());
            if (nd.getSiguiente() != null) {
                nd.getSiguiente().setAnterior(ante);
            }
        }
        nd.setAnterior(null);
        nd.setSiguiente(null);
    }

    public void limpiar() {
        while (cabeza != null) {
            eliminar(cabeza);
        }
        cabeza = null;
    }
    
    public void mostrarProcesosConMayorPrioridad(){
        
        String output = "";
        Nodo temporal = this.getCabeza();
        
        while(temporal!=null){
            
            if(temporal.getProcess().getPrioridad()==0){
                output += "\n"+temporal.getProcess().getNombre()+" | "+temporal.getProcess().getId()+" | "+temporal.getProcess().getPrioridad()+" | "+temporal.getProcess().getEstado();
            }
            temporal = temporal.getSiguiente();
        }
        
        System.out.println(output);
                
    }
    
    public void ordenarSegunPrioridad(){
        
        Nodo temporal = this.getCabeza();
        Process procesoTemporal = null;
        
        while(temporal.getSiguiente()!=null){
            if(temporal.getProcess().getPrioridad()<temporal.getSiguiente().getProcess().getPrioridad()){
                
                procesoTemporal = temporal.getProcess();
                
                temporal.setProcess(temporal.getSiguiente().getProcess());
                temporal.getSiguiente().setProcess(procesoTemporal);
            }
            temporal = temporal.getSiguiente();
        }
    }
    
    public void mostrarProcesosEnEjecucionYProcesosListosParaEjecutar(){
        
        Nodo temporal = this.getCabeza();
        int[] output = new int[2];
        
        while(temporal!=null){
            
            if(temporal.getProcess().getEstado()==Process.Ejecutandose)output[0]++;
            else if(temporal.getProcess().getEstado()==Process.estadoDeEsperaParaEjecutarse)output[1]++;
            
            temporal = temporal.getSiguiente();
        }
        
        System.out.println("Ejecutandose: "+output[0]+"\nListosParaEjecutar: "+output[1]);
    }
    
    public void mostrarLista(){
        Nodo temporal = this.getCabeza();
        
        String output = "";
        System.out.println("NOMBRE | ID | PRIORIDAD | ESTADO");
        while(temporal!=null){
            output += "\n"+temporal.getProcess().getNombre()+" | "+temporal.getProcess().getId()+" | "+temporal.getProcess().getPrioridad()+" | "+temporal.getProcess().getEstado();
            temporal = temporal.getSiguiente();
        }
        System.out.println(output);
        
    }

}
