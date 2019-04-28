
package aplicacion.modelo.dominio;
import java.util.Calendar;

public class Caja {
    private Calendar fecha;
    private double dineroEnCaja;
    
    public Caja(double dineroEnCaja){
        this.dineroEnCaja = dineroEnCaja;
    }
    public Caja(){
        
    }
    public void mostrarCaja(){
        System.out.println("Fecha: "+this.fecha);
        System.out.println("Dinero: " + this.dineroEnCaja);
    }
    public void agregarDinero(){
        
    }
    public void retirarDinero(){
        
    }
    public void consultarDineroEnCaja(){
        
    }
    public void vaciarCaja(){
        
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

    /**
     * @return the dineroEnCaja
     */
    public double getDineroEnCaja() {
        return dineroEnCaja;
    }

    /**
     * @param dineroEnCaja the dineroEnCaja to set
     */
    public void setDineroEnCaja(double dineroEnCaja) {
        this.dineroEnCaja = dineroEnCaja;
    }
}
