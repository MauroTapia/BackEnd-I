package presencial;

public class EmpleadoInfantil  extends Empleado{

    @Override
    protected String indicacionesDeArmado(Menu menu) {
        return "Preparando el almuerzo";
    }

    @Override
    protected String indicacionesDeArmado() {
        return "Agregar ingrendientes y juguetes necesarios";
    }

    @Override
    protected Double calcularPrecio(Menu menu) {
        Double respuesta= menu.getPrecioBase();
        if(menu instanceof MenuInfantil){
            MenuInfantil menuInfantil= (MenuInfantil) menu;
            respuesta= respuesta+(3*menuInfantil.getCantDeJuguetes());
        }
        return respuesta;
    }
}
