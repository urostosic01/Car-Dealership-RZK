package com.pmf.rzk.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ProizvodjacNijePronadjenError extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private String vrednost;

	public ProizvodjacNijePronadjenError(String msg, String vrednost) {
		super(msg);
		this.vrednost = vrednost;
	}
	
	public ProizvodjacNijePronadjenError() {
		
	}

	public String getVrednost() {
		return vrednost;
	}

	public void setVrednost(String vrednost) {
		this.vrednost = vrednost;
	}
}
