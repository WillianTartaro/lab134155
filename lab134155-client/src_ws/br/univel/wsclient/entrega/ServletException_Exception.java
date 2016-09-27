
package br.univel.wsclient.entrega;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ServletException", targetNamespace = "http://webservices/")
public class ServletException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ServletException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ServletException_Exception(String message, ServletException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ServletException_Exception(String message, ServletException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: br.univel.wsclient.entrega.ServletException
     */
    public ServletException getFaultInfo() {
        return faultInfo;
    }

}
