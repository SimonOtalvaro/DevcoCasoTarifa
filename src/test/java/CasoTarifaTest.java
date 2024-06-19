import org.example.CasoTarifa;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class CasoTarifaTest {
    @Test
    public void calcularDescuento() {

        final Double valorEsperado = 9000.0;
        final Double actual = CasoTarifa.valorTotal(10, 10000.0);

        System.out.println(actual);

        assertEquals(valorEsperado, actual);

    }
}
