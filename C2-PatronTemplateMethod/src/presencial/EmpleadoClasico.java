package presencial;

public class EmpleadoClasico  extends Empleado{

    @Override
    protected String indicacionesDeArmado(Menu menu) {
        return "Agregar indicaciones del menu clasico";
    }

    @Override
    protected String indicacionesDeArmado() {
        return "Agregar indicaciones del menu clasico";
    }

    @Override
    protected Double calcularPrecio(Menu menu) {
        return menu.getPrecioBase();
    }
}
