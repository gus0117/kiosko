
package aplicacion.principal;
import aplicacion.modelo.dominio.Venta;
import aplicacion.modelo.dominio.Empleado;
import aplicacion.modelo.dominio.DetalleVenta;
import aplicacion.modelo.dominio.Producto;
import java.util.Calendar;

public class KioscoPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Caja caja1 = new Caja(4000);
//        Caja caja2 = new Caja(2000);
//        Caja caja3 = new Caja();
//        
//        CargaSube cSube1 = new CargaSube(1, 100);
//        CargaSube cSube2 = new CargaSube(2, 150);
//        CargaSube cSube3 = new CargaSube();
        
        Producto producto1 = new Producto(1, "Galleta","Golosina", 25, 30);
        Producto producto2 = new Producto(2, "Gaseosa","Bebida", 30, 50);
        Producto producto3 = new Producto(3, "Cigarrillos", "Cigarrillo", 80, 50);
        Producto producto4 = new Producto(4, "Caramelo", "Golosina",12, 100);
        
        DetalleVenta detalle1 = new DetalleVenta(1, 45.20f, 3);
        DetalleVenta detalle2 = new DetalleVenta(2, 23.50f, 2);
        DetalleVenta detalle3 = new DetalleVenta();
        
        detalle1.agregarProductoLista(producto1);
        detalle1.agregarProductoLista(producto2);
        detalle1.agregarProductoLista(producto3);
        detalle1.generarMontoTotal();
        
        detalle2.agregarProductoLista(producto4);
        detalle2.agregarProductoLista(producto3);
        detalle2.generarMontoTotal();
        
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(2019, 4, 1, 14, 56, 30);
        Calendar fecha2 = Calendar.getInstance();
        fecha2.set(2019, 6, 23, 12, 9, 2);
        
        Venta venta1 = new Venta(1, fecha1, detalle1);
        Venta venta2 = new Venta(2, fecha2, detalle2);

        
        
        Empleado empleado1 = new Empleado(1, "Diego", "Vega", 2);
        empleado1.guardarVenta(venta1);
        empleado1.guardarVenta(venta2);
        
        
        Calendar fechaMin = Calendar.getInstance();
        Calendar fechaMax = Calendar.getInstance();
        
        fechaMin.set(2017, 12, 23);
        fechaMax.set(2019, 6, 25);
        empleado1.mostrarVentaEntreFechas(fechaMin, fechaMax);
//        Empleado empleado2 = new Empleado(2, "Pepe", "Romero");
//        Empleado empleado3 = new Empleado();
        
        
        
//        Sube sube1 = new Sube(1000);
//        Sube sube2 = new Sube(1500);
//        Sube sube3 = new Sube();
//        
//        
//        
//        caja1.mostrarCaja();
//        caja2.mostrarCaja();
//        caja3.mostrarCaja();
//        
//        cSube1.mostrarCargaSube();
//        cSube2.mostrarCargaSube();
//        cSube3.mostrarCargaSube();
//        
//        detalle1.mostrarDetalle();
//        detalle2.mostrarDetalle();
//        detalle3.mostrarDetalle();
        
//        empleado1.mostrarEmpleado();
//        empleado2.mostrarEmpleado();
//        empleado3.mostrarEmpleado();
        
//        producto1.mostrarProducto();
//        producto2.mostrarProducto();
//        producto3.mostrarProducto();
//        
//        sube1.mostrarSube();
//        sube2.mostrarSube();
//        sube3.mostrarSube();
//        
    }
    
}
