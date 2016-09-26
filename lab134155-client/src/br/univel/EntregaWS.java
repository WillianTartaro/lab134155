package br.univel;

public class EntregaWS {


	public static void main(String[] args) {
		try {
			EntregaJaxWSService service = new EntregaJaxWSService();
			EntregaWS ews = service.getEntregaJaxWSPort();
			Entrega entrega = ews.operacaoEntrega();
			System.out.println(entrega);
		} catch (IOException_Exception e) {
			e.printStackTrace();
		} catch (ServletException_Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
