
package uddi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Operaciones", targetNamespace = "http://UDDI/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Operaciones {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://UDDI/", className = "uddi.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://UDDI/", className = "uddi.HelloResponse")
    @Action(input = "http://UDDI/Operaciones/helloRequest", output = "http://UDDI/Operaciones/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "suma", targetNamespace = "http://UDDI/", className = "uddi.Suma")
    @ResponseWrapper(localName = "sumaResponse", targetNamespace = "http://UDDI/", className = "uddi.SumaResponse")
    @Action(input = "http://UDDI/Operaciones/sumaRequest", output = "http://UDDI/Operaciones/sumaResponse")
    public double suma(
        @WebParam(name = "a", targetNamespace = "")
        double a,
        @WebParam(name = "b", targetNamespace = "")
        double b);

}
