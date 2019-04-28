
package aplicacion.modelo.dominio;
import java.util.Calendar;
import java.util.List;

public class Empleado {
    private int idEmpleado;
    private String nombre;
    private String apellido;
    private Venta[] listaVentas;
    private int indice;
    
    public Empleado(int idEmpleado, String nombre, String apellido, int cantVentas){
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.listaVentas = new Venta[cantVentas];
        indice = 0;
    }
    public Empleado(){
        
    }
    public void mostrarEmpleado(){
        System.out.println("Id Empleado: " + this.idEmpleado);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }
    public void guardarVenta(Venta v){
        if(indice < this.listaVentas.length){
            this.listaVentas[indice] = v;
            indice++;
        }
        else{
            System.out.println("No es posible agregar mas ventas");
        }
    }
    public void mostrarVentaEntreFechas(Calendar fechaMin, Calendar fechaMax){
        int cantVentas = 0;
        float totalRecaudado = 0;
        System.out.println("----VENTAS REALIZADAS-----");
        for(int i = 0; i < this.listaVentas.length; i++){
            Calendar fechaVenta = this.listaVentas[i].getFecha();            
            if(fechaVenta.before(fechaMax) && fechaVenta.after(fechaMin)){
                System.out.println("****** VENTA "+(cantVentas + 1)+" ******");
                this.listaVentas[i].mostrarVenta();
                cantVentas++;
                totalRecaudado += this.listaVentas[i].getDetalleVenta().getMontoTotal();
            }
        }
        System.out.println("_________________________________");
        System.out.println("Total de ventas: " + cantVentas);
        System.out.println("Total recaudado: " + totalRecaudado);
    }
    public void realizarPedido(){
        
    }
    public void cerrarCaja(){
        
    }

    /**
     * @return the idEmpleado
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
