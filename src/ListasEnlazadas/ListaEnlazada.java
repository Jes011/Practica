
package ListasEnlazadas;

/**
 *
 * @author Jes011
 * @github https://github.com/Jes011
 */
public class ListaEnlazada {

        private Nodo cabeza;

        public ListaEnlazada() {
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
            while (temp != null) {

                if (temp.getSiguiente() == null) {
                    break;
                } else {

                    temp = temp.getSiguiente();
                }
            }
            return temp;
        }

        public int contarNodos() {
            int contador = 0;
            Nodo temp = cabeza;
            while (temp != null) {
                contador++;
                temp = temp.getSiguiente();
            }
            return contador;
        }

        public void agregar(Nodo nuevo) {
            if (cabeza == null) {
                setCabeza(nuevo);
            } else {
                ultimo().setSiguiente(nuevo);
            }
        }

        Nodo buscar(int cod) {
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

        public void eliminar(Nodo nd) {
            Nodo anterior;
            if (nd == cabeza) {
                cabeza = cabeza.getSiguiente();
            } else {
                anterior = cabeza;
                while (anterior.getSiguiente() != nd) {
                    anterior = anterior.getSiguiente();
                }

                anterior.setSiguiente(nd.getSiguiente());
            }
            nd.setSiguiente(null);
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
            float def, max;
            max = 0;
            Nodo temp = cabeza;
            while (temp != null) {
                def = temp.definitiva();
                if (def > max) {
                    max = def;
                }
                temp = temp.getSiguiente();
            }
            return max;
        }

        public void limpiar() {
            while (cabeza != null) {
                eliminar(cabeza);
            }
        }

        void agregarEntrenodos(Nodo nd, Nodo nuevo) {
            nuevo.setSiguiente(nd.getSiguiente());
            nd.setSiguiente(nuevo);
        }

        void agregarAcabeza(Nodo nuevo) {
            nuevo.setSiguiente(cabeza);
            setCabeza(nuevo);
        }
    
}