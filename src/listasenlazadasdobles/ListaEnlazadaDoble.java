/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasenlazadasdobles;

/**
 *
 * @author Jes011
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
    public void agregarEntreNodos(Nodo nd, Nodo nuevo) {
        nuevo.setSiguiente(nd.getSiguiente());
        if (nd.getSiguiente() != null) {
            nd.getSiguiente().setAnterior(nuevo);
        }
        nd.setSiguiente(nuevo);
        nuevo.setAnterior(nd);
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
    public Nodo buscar(int cod) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.getCodigo() == cod) {
                break;
            } else {
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }
    public Nodo buscar(String nom) {
        Nodo temp = ultimo();
        while (temp != null) {
            if (temp.getNombre().equals(nom)) { 
                break;
            } else {
                temp = temp.getAnterior(); 
            }
        }
        return temp;
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
    public float promedioGeneral() {
        int cantidad = 0;
        float suma = 0;
        Nodo temp = cabeza;
        while (temp != null) {
            cantidad++;
            suma = suma + temp.definitiva();
            temp = temp.getSiguiente();
        }
        if (cantidad > 0) {
            return suma / cantidad;
        } else {
            return 0;
        }
    }
    public float maximaDefinitiva() {
        float max = 0;
        float def;
        Nodo temp = ultimo();
        while (temp != null) {
            def = temp.definitiva();
            if (def > max) {
                max = def;
            }
            temp = temp.getAnterior();
        }
        return max;
    }
}
