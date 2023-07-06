package presencial;

public class MenuVegetariano extends Menu {
    private Integer cantDeSalsas;
    private boolean tieneSalsas;
    private boolean tieneEspecias;
    public boolean siTieneEspecias(){
        return tieneSalsas;
    }

    public MenuVegetariano(Double precioBase, Integer cantDeSalsas, boolean tieneSalsas, boolean tieneEspecias) {
        super(precioBase);
        this.cantDeSalsas = cantDeSalsas;
        this.tieneSalsas = tieneSalsas;
        this.tieneEspecias = tieneEspecias;
    }

    public Integer getCantDeSalsas() {
        return cantDeSalsas;
    }

    public void setCantDeSalsas(Integer cantDeSalsas) {
        this.cantDeSalsas = cantDeSalsas;
    }

    public boolean isTieneSalsas() {
        return tieneSalsas;
    }

    public void setTieneSalsas(boolean tieneSalsas) {
        this.tieneSalsas = tieneSalsas;
    }

    public boolean isTieneEspecias() {
        return tieneEspecias;
    }

    public void setTieneEspecias(boolean tieneEspecias) {
        this.tieneEspecias = tieneEspecias;
    }
}
