package br.univel;

import br.univel.wsclient.entrega.Entrega;
import br.univel.wsclient.entrega.EntregaWSService;
import br.univel.wsclient.entrega.IOException_Exception;
import br.univel.wsclient.entrega.ServletException_Exception;

public class EntregaWS {


	public static void main(String[] args) {
		try {
			EntregaWSService service = new EntregaWSService();
			br.univel.wsclient.entrega.EntregaWS ews = service.getEntregaWSPort();
			Entrega entrega = ews.opEntrega();
			System.out.println(entrega);
		} catch (IOException_Exception e) {
			e.printStackTrace();
		} catch (ServletException_Exception e) {
			e.printStackTrace();
		}
		
	}

	private Entrega operacaoEntrega() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
