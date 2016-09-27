package br.univel;

public class CrudWS {
	
	public static void main(String[] args) {
		CadastroProdutoWSService service = new CadastroProdutoJaxWSService();
		CadastroProdutoJaxWS ews = service.getCadastroProdutoJaxWSPort();

		Produto produto = new Produto();
		produto.setCodigoBarra("0123-4567-8900");
		produto.setDescricao("PS4");
		produto.setPreco(2000);

		ews.criarProduto(produto);

		List<Produto> listaProduto = ews.listaProduto();

		for (Produto p : listaProduto) {
			System.out.println(p.getDescricao());
		}

		produto.setCodigoBarra("0123-4567-8900");
		produto.setDescricao("PS4");
		produto.setPreco(3000);

		ews.alterarProduto(produto);

		ews.deletarProduto(1L);

	}

}
