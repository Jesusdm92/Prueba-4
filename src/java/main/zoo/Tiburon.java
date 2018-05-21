package zoo;

/** Clase para crear tiburones
 * 
 *  Esta clase se ha diseñado específicamente para crear tiburobnnes
 *
 * @author Jesus Delgado Marín - 2018
 * @version v1.0
 */
public class Tiburon extends Pez {
    private String especie;
    private boolean peligroso;
    private static int numTiburones = 0;

    
    /** Constructor sin parámetros
     *
     */
    public Tiburon () {
        super(20, Tipo.CARTILAGINOSO, Animal.Habitat.ARTICO, "focas", 100);
        this.especie = "Tiburón blanco";
        this.peligroso = true;
        this.numTiburones ++;
    }
    
    
    /** Constructor con los datos básicos.
     *
     * @param especie Especie registrada en listado de especie oficial
     * @param peligroso Variable booleana true o false
     * @param velocidadMaxNatacion Velocidad expresada en km/h
     * @param tipo  Oseo o Cartilaginoso
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo) {
        super(velocidadMaxNatacion, tipo);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }

     /**
     *
     * @param especie Especie registrada en listado de especie oficial
     * @param peligroso Variable booleana true o false
     * @param velocidadMaxNatacion Velocidad expresada en km/h
     * @param tipo Oseo o Cartilaginoso
     * @param habitat
     * @param comida
     * @param longevidad
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo, Habitat habitat, String comida, int longevidad) {
        super(velocidadMaxNatacion, tipo, habitat, comida, longevidad);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }
    
    /**
     * Método que desplza al tiburón segun su velocidad
     */
    public void desplazar() {
        System.out.println("Estoy nadando a " + this.getVelocidadMaxNatacion() + " km/h.");
    }
    
    /**
    * Método que muestra por pantalla que el tiburón esta comiendo
    */
    public void comer() {
        System.out.println("Estoy comiendo " + this.comida);    
    }
    
    /**
     * Método que elimina un tiburón.
     */
    @Override
    protected void finalize() throws Throwable {
        numTiburones--;
        super.finalize();
    }
}
