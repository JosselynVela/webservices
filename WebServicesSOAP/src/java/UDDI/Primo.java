
package UDDI;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "Primo")
public class Primo {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Primo")
    public String primo(@WebParam(name = "primo") int a) {
        if(Verificar.primo(a)==true){
            return "El numero es primo ";
        }
        else{
            return "El numero no es primo ";
            
        }
    }
}
