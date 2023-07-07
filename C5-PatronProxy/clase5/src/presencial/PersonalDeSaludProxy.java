package presencial;

import java.util.Date;

public class PersonalDeSaludProxy implements CentroDeSalud{
    private Enfermero enfermero;

    public PersonalDeSaludProxy() {
        this.enfermero = new Enfermero();
    }

    @Override
    public String vacunar(Persona persona) {
        //ver la fecha
        //¿qué día es hoy?
        Date hoy= new Date();
        String mensaje="Vuelva cuando sea su turno :D";
        //el FILTRO
        if (hoy.after(persona.getFechaAsignada())){
            //paso el filtro
            mensaje=enfermero.vacunar(persona);
        }
        return mensaje;
    }
}
