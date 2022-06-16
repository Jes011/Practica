/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosOB;

/**
 *
 * @author joyolaa
 */
public class MetodosOrdenamineto extends MetodosManipuladores {

    public MetodosOrdenamineto(int[] listaAOrdenar) {
        super(listaAOrdenar);
    }

    public void burbuja() {
        for (int i = 0; i < super.lista.length - 1; i++) {
            for (int j = 0; j < super.lista.length - 1; j++) {
                if (super.lista[j] > super.lista[j + 1]) {
                    super.cambiar(j, j + 1);
                }
            }
        }
    }

    public void quicksort(int izq, int der) {
        
        int iz = izq,de = der,pivote = super.lista[izq];
        
        while(iz<de){
            
            while(super.lista[iz]<=pivote && iz<de){
                iz++;
            }
            while(super.lista[de]>pivote){
                de--;
            }
            
            if(iz<de){
                super.cambiar(iz, de);
            }
        }
        
        super.lista[izq] = super.lista[de];
        super.lista[de] = pivote;
        
        if(de-1>izq){
            this.quicksort(izq, de-1);
        }
        if(de+1<der){
            this.quicksort(de+1, der);
        }
    }
}

/*Primer intento
    public int buscarEspacioDisponibleEnLista() {
        for (int i = 0; i < listaAOrdenar.length; i++) {
            if (listaAOrdenar[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    
    public void metodoBurbuja() {

        if (buscarEspacioDisponibleEnLista() == -1) {

            if (listaAOrdenar.length > 1) {

                int indice = 0;
                int numeroActual = listaAOrdenar[indice], numeroSiguiente = listaAOrdenar[indice + 1];
                
                while (true) {
                    
                    

                    if (indice < listaAOrdenar.length - 1) {
                        
                        numeroActual = listaAOrdenar[indice];
                        numeroSiguiente = listaAOrdenar[indice + 1];
                        
                        if (numeroActual > numeroSiguiente) {
                            listaAOrdenar[indice] = numeroSiguiente;
                            listaAOrdenar[indice + 1] = numeroActual;
                        }
                        indice++;
                    }else{
                        indice = 0;
                    }

                    if (verificarOrden()) {
                        break;
                    }
                }

            }

        } else {
            System.out.println("Agrege mas numeros hasta que la lista este llena para proceder con el algoritmo de la burbuja.");
        }
    }

    private boolean verificarOrden() {
        for (int i = 0; i < listaAOrdenar.length; i++) {
            if (i < listaAOrdenar.length - 1) {
                if (listaAOrdenar[i] > listaAOrdenar[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }*/

