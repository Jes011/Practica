
package PracticaParcial;

/**
 *
 * @author Jes011
 * @github https://github.com/Jes011
 */
public class Process {
    
    public static final byte estadoDeEsperaParaEjecutarse = 0, Listo = 1, Interrumpido = 2, Ejecutandose = 3;
    private int id;
    private byte prioridad,estado;
    private String nombre;

    public Process(){
        this.id = 0;
        this.prioridad = 0;
        this.nombre = "";
        this.estado = 0;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(byte prioridad) {
        this.prioridad = prioridad;
    }

    public byte getEstado() {
        return estado;
    }
    public void setEstado(byte estado) {
        this.estado = estado;
    }
    
    
}
