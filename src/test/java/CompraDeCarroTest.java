import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompraDeCarroTest {

    @Test
    void deveRetornarPrecoCarroBasico(){
        CompraDeCarro compraDeCarro = new CarroBasico(100000);
        assertEquals( 100000, compraDeCarro.getPreco() );
    }

    @Test
    void deveRetornarPrecoCarroComArCondicionado(){
        CompraDeCarro compraDeCarro = new ArCondicionado(new CarroBasico(100000));
        assertEquals(110000, compraDeCarro.getPreco());
    }

    @Test
    void deveRetornarPrecoCarroComMultimidia(){
        CompraDeCarro compraDeCarro = new MultiMidia(new CarroBasico(100000));
        assertEquals(115000f, compraDeCarro.getPreco());
    }

    @Test
    void deveRetornarPrecoCarroComVidroEletrico(){
        CompraDeCarro compraDeCarro = new VidroEletrico(new CarroBasico(100000));
        assertEquals(120000f, Math.floor(compraDeCarro.getPreco()));
    }

    @Test
    void deveRetornarPrecoComArCondicionadoEMultimidia(){
        CompraDeCarro compraDeCarro = new ArCondicionado(new MultiMidia(new CarroBasico(100000)));
        assertEquals(126500f, compraDeCarro.getPreco());
    }

    @Test
    void deveRetornarPrecoComArCondicionadoEVidroEletrico(){
        CompraDeCarro compraDeCarro = new ArCondicionado(new VidroEletrico(new CarroBasico(100000)));
        assertEquals(132000f, Math.floor(compraDeCarro.getPreco()));
    }

    @Test
    void deveRetornarPrecoComMultimidiaEVidroEletrico(){
        CompraDeCarro compraDeCarro = new MultiMidia(new VidroEletrico(new CarroBasico(100000)));
        assertEquals(138000f, Math.floor(compraDeCarro.getPreco()));
    }

    @Test
    void deveRetornarPrecoComArCondicionadoEMultimidiaEVidroEletrico(){
        CompraDeCarro compraDeCarro = new MultiMidia(new ArCondicionado(new VidroEletrico(new CarroBasico(100000))));
        assertEquals(151800f, Math.floor(compraDeCarro.getPreco()));
    }
}
