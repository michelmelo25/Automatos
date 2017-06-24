package dfamin;

import java.util.Map;

public class Automato {

	Map<Integer, Map<String, Estado>> automato;
	
	public Automato(Map<Integer, Map<String, Estado>> nome) {
		this.automato = nome;
	}
}
