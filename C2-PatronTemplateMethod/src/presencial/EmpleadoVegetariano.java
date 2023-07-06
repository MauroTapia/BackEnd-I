package presencial;

public class EmpleadoVegetariano extends Empleado{
    @Override
    protected String indicacionesDeArmado(Menu menu) {
        return "Estamos armando su menu veggie";
    }

    @Override
    protected String indicacionesDeArmado() {
        return "incorpore los vegetales";
    }

    @Override
    protected Double calcularPrecio(Menu menu) {
        Double respuesta= menu.getPrecioBase();
        Double recargo= menu.getPrecioBase()*0.01;
        if(menu instanceof MenuVegetariano){
            MenuVegetariano vegetariano= (MenuVegetariano) menu;
            if(vegetariano.isTieneEspecias()){
                respuesta= respuesta+recargo;
            }
            else {
                respuesta= menu.getPrecioBase();
            }
            if(vegetariano.isTieneSalsas()){
                respuesta= menu.getPrecioBase()+(2* vegetariano.getCantDeSalsas());
            }
            else{
                respuesta= menu.getPrecioBase();
            }
            if(vegetariano.isTieneEspecias()&& vegetariano.isTieneSalsas()){
                respuesta= vegetariano.getPrecioBase()*0.01+(2* vegetariano.getCantDeSalsas());
            }
        }
        return respuesta;
    }
}
