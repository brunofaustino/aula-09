package pontos.interfaces;

public interface IPontosBusiness {
	 Participante find(int identificador);

	Mapeamento getMapeamento();

	int getPontos(int identificador, String letrasDigitadas, Mapeamento mapeamento);

}
