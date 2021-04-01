package br.com.alura.escola.dominio.aluno;

public class RegraDeNegocioException extends RuntimeException{

    public RegraDeNegocioException(String mensagem) {
        super(mensagem);
    }
}
