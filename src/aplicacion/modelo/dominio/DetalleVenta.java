
package aplicacion.modelo.dominio;
import java.util.List;


public class DetalleVenta {
    private int idDetalle;
    private float montoTotal;
    private Producto[] listaProductos;
    private int indice;
    
    public DetalleVenta(){
        
    }
    public DetalleVenta(int idDetalle, float montoTotal, int cantidadProductos){
        System.out.println("ID Detalle: " + this.idDetalle);
        System.out.println("Monto Total: " + this.montoTotal);
        listaProductos = new Producto[cantidadProductos];
        indice = 0;
    }
    public DetalleVenta(int cantidadProductos){
        listaProductos = new Producto[cantidadProductos];
        indice = 0;
    }
    
    public void mostrarDetalle(){
        System.out.println("ID Detalle: " + this.getIdDetalle());
        System.out.println("Monto Total: " + this.getMontoTotal());
        System.out.println("----PRODUCTOS-----");
        for(int i = 0; i < this.listaProductos.length; i++){
            this.listaProductos[i].mostrarProducto();
        }
        System.out.println("Total de articulos: " + this.listaProductos.length);
    }
    public void agregarProductoLista(Producto p){
        if(indice < this.listaProductos.length){
            this.listaProductos[indice] = p;
            indice++;
        }
        else{
            System.out.println("Lista LLena");
        }
    }
    public void quitarProductoLista(){
        
    }
    public void generarMontoTotal(){
        float monto = 0;
        if(this.listaProductos != null){
            for(int i = 0; i < this.listaProductos.length; i++){
                monto += this.listaProductos[i].getPrecio();
            }
        }
        this.setMontoTotal(monto);
    }

    /**
     * @return the idDetalle
     */
    public int getIdDetalle() {
        return idDetalle;
    }

    /**
     * @param idDetalle the idDetalle to set
     */
    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    /**
     * @return the montoTotal
     */
    public float getMontoTotal() {
        return montoTotal;
    }

    /**
     * @param montoTotal the montoTotal to set
     */
    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }
}
