package br.com.cvc.config.exceptions;

public class DataIntegrityException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	
	public DataIntegrityException(String mensagem) {
		super(mensagem);
	}
	
	public DataIntegrityException(String mensagem, Throwable causa) {
		super(mensagem,causa);
	}

}
