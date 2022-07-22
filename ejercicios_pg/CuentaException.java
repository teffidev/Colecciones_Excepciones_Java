package semana_6.ejercicios_pg;

public class CuentaException extends Throwable {

    public CuentaException(){
        super();
    }

    public CuentaException(String mensaje){
        super(mensaje);
    }

    public String toString()
    {
        return "Se produjo el siguiente Excepción " + this.getClass().getName() +"\n" +
                " Mensaje: " + this.getMessage() + "\n" ;
    }

}
