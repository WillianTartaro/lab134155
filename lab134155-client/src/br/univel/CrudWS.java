package br.univel;

import java.util.List;

import br.univel.wsclient.crudproduto.CadastroProdutoWS;
import br.univel.wsclient.crudproduto.CadastroProdutoWSService;
import br.univel.wsclient.crudproduto.Produto;

public class CrudWS {
	
	public static void main(String[] args) {
		CadastroProdutoWSService service = new CadastroProdutoWSService();
		CadastroProdutoWS ews = service.getCadastroProdutoWSPort();

		Produto produto = new Produto();
		produto.setCodigoBarra("8765-9876-1234");
		produto.setDescricao("PAIS DA EUROPA");
		produto.setPreco(8000);

		ews.criarProduto(produto);

		List<Produto> listaProduto = ews.listaProduto();

		for (Produto p : listaProduto) {
			System.out.println(p.getDescricao());
		}

		produto.setCodigoBarra("8765-9876-1234");
		produto.setDescricao("PAIS DA EUROPA");
		produto.setPreco(8000);

		ews.alterarProduto(produto);

		ews.deletarProduto(1L);

	}

}
