
package br.univel.wsclient.entrega;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EntregaWS", targetNamespace = "http://webservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EntregaWS {


    /**
     * 
     * @return
     *     returns br.univel.wsclient.entrega.Entrega
     * @throws ServletException_Exception
     * @throws IOException_Exception
     */
    @WebMethod
    @WebResult(name = "resultEntrega", targetNamespace = "")
    @RequestWrapper(localName = "opEntrega", targetNamespace = "http://webservices/", className = "br.univel.wsclient.entrega.OpEntrega")
    @ResponseWrapper(localName = "opEntregaResponse", targetNamespace = "http://webservices/", className = "br.univel.wsclient.entrega.OpEntregaResponse")
    public Entrega opEntrega()
        throws IOException_Exception, ServletException_Exception
    ;

}
