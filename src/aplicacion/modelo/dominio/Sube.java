
package aplicacion.modelo.dominio;


public class Sube {
    private float credito;
    
    public Sube(float credito){
        this.credito = credito;
    }
    public Sube(){
        
    }
    public void mostrarSube(){
        System.out.println("Credito: " + this.credito);
    }
    public void agregarCredito(){
        
    }
    public void descontarCredito(){
        
    }
    public void consultarCredito(){
        
    }

    /**
     * @return the credito
     */
    public float getCredito() {
        return credito;
    }

    /**
     * @param credito the credito to set
     */
    public void setCredito(float credito) {
        this.credito = credito;
    }
}
