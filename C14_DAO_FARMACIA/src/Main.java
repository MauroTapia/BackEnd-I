import dao.BD;
import dao.MedicamentoDAOH2;
import model.Medicamento;
import service.MedicamentoService;

public class Main {
    public static void main(String[] args) {
       //necesito
        //crear la tabla
        BD.crearTabla();
        //necesito preparar el medicamento
        Medicamento medicamento= new Medicamento(1,12345,"ibuprofeno","bayer",10,500.0);
        //quien interviene para guardarlo?
        MedicamentoService medicamentoService= new MedicamentoService(new MedicamentoDAOH2());
        //service lo guarda
        medicamentoService.guardarMedicamento(medicamento);
    }
}