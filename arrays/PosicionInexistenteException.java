package semana_6.arrays;

public class PosicionInexistenteException extends Exception{

    public PosicionInexistenteException(){
        super();
    }

    public PosicionInexistenteException(String la_posicion_no_existe){
        super(la_posicion_no_existe);
    }

}
