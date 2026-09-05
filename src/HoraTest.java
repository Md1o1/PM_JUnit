import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class HoraTest {
    private Hora h1;
    @BeforeEach
    void setUp(){
        h1 = new Hora(24, 0, 0);
    }
    @Test 
    @DisplayName("Testa se a hora é inválida")
    public void testeInvalido(){  
        setUp();  
        assertEquals("00:00:00", h1.horaFormatada());
    }

    @Test 
    public void testeIncrementoHora(){
        Hora h1 = new Hora(12,0,0);
        h1 = h1.incrementar(70);
        assertEquals("13:10:00", h1.horaFormatada());
    }

    @Test 
    public void testeCompararHoras(){
        Hora h1 = new Hora(10, 10, 10);
        Hora h2 = new Hora(12,10,10);
        h1.estahNaFrenteDe(h2);
        assertEquals(false, h1.estahNaFrenteDe(h2));
    }

    @Test 
    public void testeFormatacao(){
        Hora h1 = new Hora(12, 0, 0);
        h1.horaFormatada();
        assertEquals("12:00:00", h1.horaFormatada());
    }
}
