package semana_6;

public class Jugador implements Comparable<Jugador> {
    private int numeroCamiseta;
    private String nombre;
    private Boolean lesionado;
    private Boolean titular;


    //constructor
    public Jugador(int numeroCamiseta, String nombre, Boolean lesionado, Boolean titular) {

        if(numeroCamiseta < 1 || numeroCamiseta >= 100){
            throw new RuntimeException("La Camiseta no puede ser 0 ni numero negativo, ni mayor a 100");
        }

        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.titular = titular;
    }


    //metodos
    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public Boolean getLesionado() {
        return lesionado;
    }

    public void setLesionado(Boolean lesionado) {
        this.lesionado = lesionado;
    }

    public Boolean getTitular() {
        return titular;
    }

    public void setTitular(Boolean titular) {
        this.titular = titular;
    }

    @Override
    public String toString(){
        return ("nombre: " + this.nombre + "numero: " + this.numeroCamiseta);
    }

    @Override
    public int compareTo(Jugador jugador) {

        if(this.numeroCamiseta == jugador.getNumeroCamiseta()){
            return 0;
        }
        if (this.numeroCamiseta > jugador.getNumeroCamiseta()){
            return 1;
        }else {
            return 2;
        }
    }

    public String isTitulares() {
        return null;
    }
}



