package br.com.alura.escola.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CPFTest {

    @Test
    void naoDeveCriarCPFinvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> new CPF("11122233344"));
    }

    @Test
    void deveCriarCPF() {
        String numero = "378.025.658-47";
        CPF cpf = new CPF(numero);
        assertEquals(numero, cpf.getNumero());
    }
}
