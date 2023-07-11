import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private static final Logger logger= Logger.getLogger(Lista.class);
    private List<Integer> listaEnteros;

    public Lista(){
        listaEnteros= new ArrayList<>();
    }
    public void agregarEnteros(Integer numero){
        listaEnteros.add(numero);
        if(listaEnteros.size()>5){
            //necesito logger, necesito guardarlo en mi vitacora
            logger.info("La lista de creada tiene :"+listaEnteros.size()+" de esta manera superamos los 5 elementos");
        }
    }
}
