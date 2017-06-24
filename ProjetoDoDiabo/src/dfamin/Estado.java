package dfamin;

import java.util.Map;

public class Estado {

	private Map<String, Estado> transicoes;
	private  boolean inicial;
	private  boolean fim;
	
	public Estado(Map<String, Estado> nome, boolean inicio, boolean fim) {
		this.transicoes = nome;
		this.inicial = inicio;
		this.fim = fim;
	}

	public Map<String, Estado> getTransicoes() {
		return transicoes;
	}

	public void setTransicoes(Map<String, Estado> transicoes) {
		this.transicoes = transicoes;
	}

	public boolean isInicial() {
		return inicial;
	}

	public boolean isFim() {
		return fim;
	}

	@Override
	public String toString() {
		if(this.isInicial())
			return  "estado inicial \n" + "transições posiveis do estado: \n" + transicoes;
		else if(this.isFim())
			return "estado final \n" + "transições posiveis do estado: \n" + transicoes;
		else
			return "transições posiveis do estado: \n" + transicoes;
	}
}
