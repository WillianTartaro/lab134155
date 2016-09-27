
package br.univel.wsclient.entrega;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.univel.wsclient.entrega package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OpEntrega_QNAME = new QName("http://webservices/", "opEntrega");
    private final static QName _IOException_QNAME = new QName("http://webservices/", "IOException");
    private final static QName _OpEntregaResponse_QNAME = new QName("http://webservices/", "opEntregaResponse");
    private final static QName _ServletException_QNAME = new QName("http://webservices/", "ServletException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.univel.wsclient.entrega
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServletException }
     * 
     */
    public ServletException createServletException() {
        return new ServletException();
    }

    /**
     * Create an instance of {@link OpEntregaResponse }
     * 
     */
    public OpEntregaResponse createOpEntregaResponse() {
        return new OpEntregaResponse();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link OpEntrega }
     * 
     */
    public OpEntrega createOpEntrega() {
        return new OpEntrega();
    }

    /**
     * Create an instance of {@link Entrega }
     * 
     */
    public Entrega createEntrega() {
        return new Entrega();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpEntrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "opEntrega")
    public JAXBElement<OpEntrega> createOpEntrega(OpEntrega value) {
        return new JAXBElement<OpEntrega>(_OpEntrega_QNAME, OpEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpEntregaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "opEntregaResponse")
    public JAXBElement<OpEntregaResponse> createOpEntregaResponse(OpEntregaResponse value) {
        return new JAXBElement<OpEntregaResponse>(_OpEntregaResponse_QNAME, OpEntregaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServletException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "ServletException")
    public JAXBElement<ServletException> createServletException(ServletException value) {
        return new JAXBElement<ServletException>(_ServletException_QNAME, ServletException.class, null, value);
    }

}
