
package aplicacion.modelo.dominio;


public class Producto {
    private int idProducto;
    private String nombre;
    private String categoria;
    private float precio;
    private int stock;
    
    public Producto(int idProducto, String nombre, String categoria, float precio, int stock){
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }
    public Producto(){
        
    }
    public void mostrarProducto(){
        System.out.println("-----------------");
        System.out.println("id producto: " + this.idProducto);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Stock: " + this.stock);
    }
    public void consultarStock(){

    }
    public void actualizarStock(){
        
    }
    public void consultarPrecio(){
        
    }
    public void actualizarPrecio(){
        
    }

    /**
     * @return the idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
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
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}
