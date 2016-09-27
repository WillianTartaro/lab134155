
package br.univel.wsclient.venda;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "VendaWSService", targetNamespace = "http://webservices/", wsdlLocation = "http://localhost:8080/lab134155/VendaWS?wsdl")
public class VendaWSService
    extends Service
{

    private final static URL VENDAWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException VENDAWSSERVICE_EXCEPTION;
    private final static QName VENDAWSSERVICE_QNAME = new QName("http://webservices/", "VendaWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/lab134155/VendaWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VENDAWSSERVICE_WSDL_LOCATION = url;
        VENDAWSSERVICE_EXCEPTION = e;
    }

    public VendaWSService() {
        super(__getWsdlLocation(), VENDAWSSERVICE_QNAME);
    }

    public VendaWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), VENDAWSSERVICE_QNAME, features);
    }

    public VendaWSService(URL wsdlLocation) {
        super(wsdlLocation, VENDAWSSERVICE_QNAME);
    }

    public VendaWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VENDAWSSERVICE_QNAME, features);
    }

    public VendaWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VendaWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns VendaWS
     */
    @WebEndpoint(name = "VendaWSPort")
    public VendaWS getVendaWSPort() {
        return super.getPort(new QName("http://webservices/", "VendaWSPort"), VendaWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VendaWS
     */
    @WebEndpoint(name = "VendaWSPort")
    public VendaWS getVendaWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices/", "VendaWSPort"), VendaWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VENDAWSSERVICE_EXCEPTION!= null) {
            throw VENDAWSSERVICE_EXCEPTION;
        }
        return VENDAWSSERVICE_WSDL_LOCATION;
    }

}
