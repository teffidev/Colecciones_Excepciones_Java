package semana_6.arrays;

import java.sql.SQLOutput;

public class Jugador {
    private String posición;
    private String apellido;
    private Integer nroCamiseta;

    public Jugador(String posición, String apellido, Integer nroCamiseta) {
        this.posición = posición;
        this.apellido = apellido;
        this.nroCamiseta = nroCamiseta;
    }



    public String getPosición() {
        return posición;
    }

    public void setPosición(String posición) {
        this.posición = posición;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(Integer nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

}
