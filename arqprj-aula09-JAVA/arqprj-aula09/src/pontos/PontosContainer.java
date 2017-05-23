package pontos;

import pontos.business.*;

public class PontosContainer {
	public static void main(String[] args) {
		IPontosBusiness negocios = new ParticipanteArq("pontos.txt");
		IPontosProcess processo = new PontosProcessFacade(negocios);
		PontosDesktop desktop = new PontosDesktop(processo);
		desktop.consultarPontos();
	}

}
