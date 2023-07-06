package presencial;

public class MenuInfantil extends Menu {
    private Integer cantDeJuguetes;

    public MenuInfantil(Double precioBase, Integer cantDeJuguetes) {
        super(precioBase);
        this.cantDeJuguetes = cantDeJuguetes;
    }

    public Integer getCantDeJuguetes() {
        return cantDeJuguetes;
    }

    public void setCantDeJuguetes(Integer cantDeJuguetes) {
        this.cantDeJuguetes = cantDeJuguetes;
    }
}
