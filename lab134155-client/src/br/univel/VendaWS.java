package br.univel;

import br.univel.wsclient.venda.IOException_Exception;
import br.univel.wsclient.venda.ServletException_Exception;
import br.univel.wsclient.venda.Venda;
import br.univel.wsclient.venda.VendaWSService;

public class VendaWS {
	
	public static void main(String[] args) {
		try {
			VendaWSService service = new VendaWSService();
			br.univel.wsclient.venda.VendaWS ews = service.getVendaWSPort();
			Venda venda = ews.opVenda();
			System.out.println(venda);
		} catch (IOException_Exception e) {
			e.printStackTrace();
		} catch (ServletException_Exception e) {
			e.printStackTrace();
		}
	}

}
