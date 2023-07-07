package presencial;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CentroDeSaludTest {
    @Test
            public void vacunarJuanOkTest() {
        //dado
        Persona juan = new Persona("Juan", "Perez",
                "5711858", 0, "Pfizer",
                new Date(2023 - 1900, 5 - 1, 1));
        PersonalDeSaludProxy administrativo = new PersonalDeSaludProxy();
        String respEsperada = "Se ha registrado el documento 5711858 como persona" +
                " vacunada con la vacuna Pfizer";
        //cuando
        String respActual = administrativo.vacunar(juan);
        //entonces
        assertEquals(respEsperada, respActual);
    }
}