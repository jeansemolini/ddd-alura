package br.com.alura.escola.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));

        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));

        assertThrows(IllegalArgumentException.class,
                () -> new Email("emailinvalido"));
    }

    @Test
    void deveCriarEmail() {
        String endereco = "teste@teste.com";
        Email email = new Email(endereco);
        assertEquals(endereco, email.getEndereco());
    }
}
