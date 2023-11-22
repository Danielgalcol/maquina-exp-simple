public class MaquinaExpendedoraSimple {
    
    // El precio del billete
    private int precioBillete;
    // La cantidad de dinero que lleva metida el cliente actual
    private int balanceClienteActual;
    // El total de dinero almacenado en la maquina desde su ultimo vaciado
    private int totalDineroAcumulado;
    // El origen del billete
    private String estacionOrigen;
    // El destino del billete
    private String estacionDestino;

    /**
     * Crea una maquina expendedora de billetes de tren con el 
     * precio del billete y el origen y destino dados. Se asume que el precio
     * del billete que se recibe es mayor que 0.
     */
    public MaquinaExpendedoraSimple() {
        precioBillete = 20;
        balanceClienteActual = 0;
        totalDineroAcumulado = 0;
        estacionOrigen = "León";
        estacionDestino = "Oviedo";
    }
    
    /**
     * Nuevo constructor de origen leon.
     */
    public MaquinaExpendedoraSimple(int precioDelBillete, String estacionDelDestino){
        estacionOrigen = "León";
        precioBillete = precioDelBillete;
        estacionDestino = estacionDelDestino;
        balanceClienteActual = 0;
        totalDineroAcumulado = 0;
    }

    /**
     * Devuelve el precio del billete
     */
    public int getPrecioBillete() {
        return precioBillete;
    }

    /**
     * Devuelve la cantidad de dinero que el cliente actual lleva introducida
     */
    public int getBalanceClienteActual() {
        return balanceClienteActual;
    }
    
    /**
     * Permita cambiar el precio del billete al valor introducido como parámetro.
     */
    public void setPrecioBillete(int nuevoPrecio){
        precioBillete = nuevoPrecio;
    }
    
    /**
     * Devuelva el total de dinero acumulado en la máquina desde su último vaciado.
     */
    public int getTotalDineroAcumulado(){
        return totalDineroAcumulado;
    }
    
    /**
     *  Permita reducir el valor del precio en una cantidad pasada como 
     *  parámetro (por ejemplo: si el billete vale 30 y la cantidad pasada 
     *  como parámetro es 7, el nuevo precio del billete debe ser 23). 
     */
    public void reducirPrecioBillete(int numeroReducir){
        precioBillete = precioBillete - numeroReducir;
    }
    
    
    
    /**
     * Simula la introduccion de dinero por parte del cliente actual
     */
    public void introducirDinero(int cantidadIntroducida) {
        balanceClienteActual = balanceClienteActual + cantidadIntroducida;
    }
    
    /**
     * Imprime un billete para el cliente actual
     */
    public void imprimirBillete() {
        // Simula la impresion de un billete
        System.out.println("##################");
        System.out.println("# Billete de tren:");
        System.out.println("# De " + estacionOrigen + " a " + estacionDestino);
        System.out.println("# " + precioBillete + " euros.");
        System.out.println("##################");
        System.out.println();

        // Actualiza el total de dinero acumulado en la maquina
        totalDineroAcumulado = totalDineroAcumulado + balanceClienteActual;
        // Queda preparada para el proximo cliente
        balanceClienteActual = 0;
    }
}
