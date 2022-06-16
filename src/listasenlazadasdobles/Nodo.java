package listasenlazadasdobles;

/**
 *
 * @author Jes011
 * @github https://github.com/Jes011
 */
public class Nodo {

    private int codigo;
    private String nombre;
    private float nota1,nota2,nota3;
    private Nodo siguiente,anterior; 

    public Nodo() {
        codigo = 0;
        nombre = "";
        nota1 = 0;
        nota2 = 0;
        nota3 = 0;
        siguiente = null;
        anterior = null;
    }
    
    public Nodo(String nombre) {
        codigo = 0;
        this.nombre = nombre;
        nota1 = 0;
        nota2 = 0;
        nota3 = 0;
        siguiente = null;
        anterior = null;
    }

    public void setCodigo(int cod) {
        codigo = cod;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public void setNota1(float n1) {
        nota1 = n1;
    }

    public void setNota2(float n2) {
        nota2 = n2;
    }

    public void setNota3(float n3) {
        nota3 = n3;
    }

    public void setSiguiente(Nodo sig) {
        siguiente = sig;
    }

    public void setAnterior(Nodo ant) {
        anterior = ant;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getNota1() {
        return nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public float definitiva() {
        return (getNota1() + getNota2() + getNota3()) / 3;
    }
}
