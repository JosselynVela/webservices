
package webservicescliente1;


public class WebServicesCliente1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println(suma(4,6));
        
    }

    private static double suma(double a, double b) {
        uddi.Operaciones_Service service = new uddi.Operaciones_Service();
        uddi.Operaciones port = service.getOperacionesPort();
        return port.suma(a, b);
    }
    
    
    
    
    
}
