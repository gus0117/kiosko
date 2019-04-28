
package aplicacion.modelo.dominio;
import java.util.Calendar;


public class Venta {
    private int idVenta;
    private Calendar fecha;
    private DetalleVenta detalleVenta;
    
    public Venta(int idVenta, Calendar fecha, DetalleVenta detalleVenta){
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.detalleVenta = detalleVenta;
    }
    public Venta(){
        
    }
    public void mostrarVenta(){
        System.out.println("Id Venta: " + this.idVenta);
        System.out.println("------DETALLE------");
        this.detalleVenta.mostrarDetalle();
    }
    public void generarRecibo(){
        
    }

    /**
     * @return the idVenta
     */
    public int getIdVenta() {
        return idVenta;
    }

    /**
     * @param idVenta the idVenta to set
     */
    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
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
     * @return the detalleVenta
     */
    public DetalleVenta getDetalleVenta() {
        return detalleVenta;
    }

    /**
     * @param detalleVenta the detalleVenta to set
     */
    public void setDetalleVenta(DetalleVenta detalleVenta) {
        this.detalleVenta = detalleVenta;
    }
}
