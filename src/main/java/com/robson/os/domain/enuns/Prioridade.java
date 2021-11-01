package com.robson.os.domain.enuns;

public enum Prioridade {

	BAIXA(0, "BAIXA"),
	MEDIA(1, "MEDIA"),
	ALTA(2, "ALTA");
	
	private Integer cod;
	private String descrição;
	private Prioridade(Integer cod, String descrição) {
		this.cod = cod;
		this.descrição = descrição;
	}
	
	public Integer getCod() {
		return cod;
	}
	public String getDescrição() {
		return descrição;
	}
	
	public static Prioridade toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(Prioridade x : Prioridade.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Prioridade inválida!" + cod);
	}
}
