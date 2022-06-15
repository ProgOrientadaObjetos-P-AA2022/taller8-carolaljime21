package paquete1;

public class Docente {

    protected String nombres;
    protected String cedula;
    
    public void establecerNombresDocente(String x){
        nombres = x;
    }
    
    public void establecerCedulaDocente(String x){
        cedula =x;
    }
    
    public String obtenerNombresDocente(){
        return nombres;
    }
    
    public String obtenerCedulaDocente(){
        return cedula;
    }

}
