
package aplicacion.modelo.dominio;
import java.util.Calendar;

public class CargaSube {
    private int idCarga;
    private float carga;
    private Calendar fecha;
    
    public CargaSube(int idCarga, float carga){
        this.idCarga = idCarga;
        this.carga = carga;
    }
    public CargaSube(){
        
    }
    public void mostrarCargaSube(){
        System.out.println("idCarga: " + this.idCarga);
        System.out.println("Carga: " + this.carga);
        System.out.println("Fecha: " + this.fecha);
    }
    public void realizarCarga(){
        
    }

    /**
     * @return the idCarga
     */
    public int getIdCarga() {
        return idCarga;
    }

    /**
     * @param idCarga the idCarga to set
     */
    public void setIdCarga(int idCarga) {
        this.idCarga = idCarga;
    }

    /**
     * @return the carga
     */
    public float getCarga() {
        return carga;
    }

    /**
     * @param carga the carga to set
     */
    public void setCarga(float carga) {
        this.carga = carga;
    }

    /**
     * @return the fecha
     */
    public Calendar getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }
}
