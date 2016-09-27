package webservices;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.univel.model.Produto;
import rest.CadastroProduto;

@WebService
public class CadastroProdutoWS {
	
	@EJB
	private CadastroProduto em;
	
	@WebMethod(operationName = "criarProduto")
	@WebResult(name = "resultCriar")
	public void create(@WebParam(name = "produto") Produto produto){
		em.create(produto);
	}
	
	@WebMethod(operationName = "listaProduto")
	@WebResult(name = "resultListar")
	public List<Produto> read() {
		List<Produto> findAllQuery = em.read();
		return findAllQuery;
	}

	@WebMethod(operationName = "alterarProduto")
	@WebResult(name = "resultAlterar")
	public void update(@WebParam(name = "produto") Produto produto) {
		em.update(produto);
	}

	@WebMethod(operationName = "deletarProduto")
	@WebResult(name = "resultDeletar")
	public void delete(@WebParam(name = "produtoId") Long id) {
		em.delete(id);
	}


}
