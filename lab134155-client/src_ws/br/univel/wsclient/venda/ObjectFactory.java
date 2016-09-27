
package br.univel.wsclient.venda;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.univel.wsclient.venda package. 
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

    private final static QName _IOException_QNAME = new QName("http://webservices/", "IOException");
    private final static QName _OpVenda_QNAME = new QName("http://webservices/", "opVenda");
    private final static QName _OpVendaResponse_QNAME = new QName("http://webservices/", "opVendaResponse");
    private final static QName _ServletException_QNAME = new QName("http://webservices/", "ServletException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.univel.wsclient.venda
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
     * Create an instance of {@link OpVenda }
     * 
     */
    public OpVenda createOpVenda() {
        return new OpVenda();
    }

    /**
     * Create an instance of {@link OpVendaResponse }
     * 
     */
    public OpVendaResponse createOpVendaResponse() {
        return new OpVendaResponse();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link Venda }
     * 
     */
    public Venda createVenda() {
        return new Venda();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link OpVenda }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "opVenda")
    public JAXBElement<OpVenda> createOpVenda(OpVenda value) {
        return new JAXBElement<OpVenda>(_OpVenda_QNAME, OpVenda.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpVendaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "opVendaResponse")
    public JAXBElement<OpVendaResponse> createOpVendaResponse(OpVendaResponse value) {
        return new JAXBElement<OpVendaResponse>(_OpVendaResponse_QNAME, OpVendaResponse.class, null, value);
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
