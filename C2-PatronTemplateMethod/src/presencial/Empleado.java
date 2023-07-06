package presencial;

public abstract class Empleado {

    public String preparar(Menu menu){
        String respuesta= iniciandoPreparacion();
        respuesta= respuesta+indicacionesDeArmado();
        respuesta= respuesta+calcularPrecio(menu);
        return respuesta;
    }
    private String iniciandoPreparacion(){
        return "Encenciendo las hornallas y reunir todos lo necesario para la cocción";
    }
    protected abstract String indicacionesDeArmado(Menu menu);
    protected  abstract String indicacionesDeArmado();
    protected  abstract Double calcularPrecio(Menu menu);
}
