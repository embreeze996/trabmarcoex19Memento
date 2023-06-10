package MementoMethodTest;

import MementoMethod.Maquina;
import MementoMethod.MaquinaEstadoManutencao;
import MementoMethod.MaquinaEstadoOperacao;
import MementoMethod.MaquinaEstadoResfriamento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class MaquinaTest {

    @Test
    void deveArmazenarEstados() {
        Maquina maquina = new Maquina();
        maquina.setEstado(MaquinaEstadoOperacao.getInstance());
        maquina.setEstado(MaquinaEstadoResfriamento.getInstance());
        assertEquals(2, maquina.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Maquina maquina = new Maquina();
        maquina.setEstado(MaquinaEstadoOperacao.getInstance());
        maquina.setEstado(MaquinaEstadoResfriamento.getInstance());
        maquina.restauraEstado(0);
        assertEquals(MaquinaEstadoOperacao.getInstance(), maquina.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Maquina  maquina = new  Maquina();
        maquina.setEstado(MaquinaEstadoOperacao.getInstance());
        maquina.setEstado(MaquinaEstadoManutencao.getInstance());
        maquina.setEstado(MaquinaEstadoOperacao.getInstance());
        maquina.setEstado(MaquinaEstadoResfriamento.getInstance());
        maquina.restauraEstado(2);
        assertEquals(MaquinaEstadoOperacao.getInstance(), maquina.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Maquina  maquina = new  Maquina();
            maquina.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}