package semana_6.puerto_mesa_C16;

public class Contenedor {
    /*Atributos*/
    private int numeroIdentificador;
    private String textoDescribePais;
    private Boolean marcaMaterial;


    /*Constructor*/
    public Contenedor(int numeroIdentificador, String textoDescribePais, Boolean marcaMaterial) {
        this.numeroIdentificador = numeroIdentificador;
        this.textoDescribePais = textoDescribePais;
        this.marcaMaterial = marcaMaterial;
    }


    /*Métodos*/
    public int getNumeroIdentificador() {
        return numeroIdentificador;
    }

    public void setNumeroIdentificador(int numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }

    public String getTextoDescribePais() {
        return textoDescribePais;
    }

    public void setTextoDescribePais(String textoDescribePais) {
        this.textoDescribePais = textoDescribePais;
    }

    public Boolean getMarcaMaterial() {
        return marcaMaterial;
    }

    public void setMarcaMaterial(Boolean marcaMaterial) {
        this.marcaMaterial = marcaMaterial;
    }
}
