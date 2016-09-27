
package br.univel.wsclient.crudproduto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.univel.wsclient.crudproduto package. 
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

    private final static QName _AlterarProdutoResponse_QNAME = new QName("http://webservices/", "alterarProdutoResponse");
    private final static QName _CriarProdutoResponse_QNAME = new QName("http://webservices/", "criarProdutoResponse");
    private final static QName _DeletarProduto_QNAME = new QName("http://webservices/", "deletarProduto");
    private final static QName _AlterarProduto_QNAME = new QName("http://webservices/", "alterarProduto");
    private final static QName _CriarProduto_QNAME = new QName("http://webservices/", "criarProduto");
    private final static QName _DeletarProdutoResponse_QNAME = new QName("http://webservices/", "deletarProdutoResponse");
    private final static QName _ListaProdutoResponse_QNAME = new QName("http://webservices/", "listaProdutoResponse");
    private final static QName _ListaProduto_QNAME = new QName("http://webservices/", "listaProduto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.univel.wsclient.crudproduto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListaProduto }
     * 
     */
    public ListaProduto createListaProduto() {
        return new ListaProduto();
    }

    /**
     * Create an instance of {@link ListaProdutoResponse }
     * 
     */
    public ListaProdutoResponse createListaProdutoResponse() {
        return new ListaProdutoResponse();
    }

    /**
     * Create an instance of {@link AlterarProduto }
     * 
     */
    public AlterarProduto createAlterarProduto() {
        return new AlterarProduto();
    }

    /**
     * Create an instance of {@link CriarProduto }
     * 
     */
    public CriarProduto createCriarProduto() {
        return new CriarProduto();
    }

    /**
     * Create an instance of {@link DeletarProdutoResponse }
     * 
     */
    public DeletarProdutoResponse createDeletarProdutoResponse() {
        return new DeletarProdutoResponse();
    }

    /**
     * Create an instance of {@link DeletarProduto }
     * 
     */
    public DeletarProduto createDeletarProduto() {
        return new DeletarProduto();
    }

    /**
     * Create an instance of {@link AlterarProdutoResponse }
     * 
     */
    public AlterarProdutoResponse createAlterarProdutoResponse() {
        return new AlterarProdutoResponse();
    }

    /**
     * Create an instance of {@link CriarProdutoResponse }
     * 
     */
    public CriarProdutoResponse createCriarProdutoResponse() {
        return new CriarProdutoResponse();
    }

    /**
     * Create an instance of {@link Produto }
     * 
     */
    public Produto createProduto() {
        return new Produto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarProdutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "alterarProdutoResponse")
    public JAXBElement<AlterarProdutoResponse> createAlterarProdutoResponse(AlterarProdutoResponse value) {
        return new JAXBElement<AlterarProdutoResponse>(_AlterarProdutoResponse_QNAME, AlterarProdutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriarProdutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "criarProdutoResponse")
    public JAXBElement<CriarProdutoResponse> createCriarProdutoResponse(CriarProdutoResponse value) {
        return new JAXBElement<CriarProdutoResponse>(_CriarProdutoResponse_QNAME, CriarProdutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarProduto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "deletarProduto")
    public JAXBElement<DeletarProduto> createDeletarProduto(DeletarProduto value) {
        return new JAXBElement<DeletarProduto>(_DeletarProduto_QNAME, DeletarProduto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarProduto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "alterarProduto")
    public JAXBElement<AlterarProduto> createAlterarProduto(AlterarProduto value) {
        return new JAXBElement<AlterarProduto>(_AlterarProduto_QNAME, AlterarProduto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriarProduto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "criarProduto")
    public JAXBElement<CriarProduto> createCriarProduto(CriarProduto value) {
        return new JAXBElement<CriarProduto>(_CriarProduto_QNAME, CriarProduto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarProdutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "deletarProdutoResponse")
    public JAXBElement<DeletarProdutoResponse> createDeletarProdutoResponse(DeletarProdutoResponse value) {
        return new JAXBElement<DeletarProdutoResponse>(_DeletarProdutoResponse_QNAME, DeletarProdutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaProdutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "listaProdutoResponse")
    public JAXBElement<ListaProdutoResponse> createListaProdutoResponse(ListaProdutoResponse value) {
        return new JAXBElement<ListaProdutoResponse>(_ListaProdutoResponse_QNAME, ListaProdutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaProduto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "listaProduto")
    public JAXBElement<ListaProduto> createListaProduto(ListaProduto value) {
        return new JAXBElement<ListaProduto>(_ListaProduto_QNAME, ListaProduto.class, null, value);
    }

}
