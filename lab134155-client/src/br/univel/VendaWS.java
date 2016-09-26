package br.univel;

public class VendaWS {
	
	public static void main(String[] args) {
		try {
			VendaJaxWSService service = new VendaJaxWSService();
			VendaWS ews = service.getVendaJaxWSPort();
			Venda venda = ews.operacaoVenda();
			System.out.println(venda);
		} catch (IOException_Exception e) {
			e.printStackTrace();
		} catch (ServletException_Exception e) {
			e.printStackTrace();
		}
	}

}
