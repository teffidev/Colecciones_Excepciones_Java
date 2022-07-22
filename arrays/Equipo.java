package semana_6.arrays;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList <Jugador> plantel; //0 a 10: titulares - 11 a 17: suplentes - 18 a 22: reserva


    public Equipo(String nombre) {
        this.nombre = nombre;
        //this.plantel = new ArrayList<>(); -> Es más común instanciar la lista desde acá
    }

    public Integer cantJugadores(String posicion) throws PosicionInexistenteException {
        if (posicion != "ARQUERO" || posicion != "DEFENSOR" || posicion != "MEDIOCAMPISTA" || posicion != "DELANTERO"){
                throw new PosicionInexistenteException("La posición no existe");
        }
        Integer cantidadJugadsoresEnPosicion = 0;
        for (Jugador jugador : this.plantel){
            if(jugador.getPosición().equals(posicion)){
                cantidadJugadsoresEnPosicion ++;
            }
        }
        return cantidadJugadsoresEnPosicion;
    }

    public void addJugador(Jugador jugador){
        if(plantel == null){
            this.plantel = new ArrayList<>();
        }
        this.plantel.add(jugador);
    }

    public ArrayList<Jugador> obtenerReservas(){
        ArrayList<Jugador> reservas = new ArrayList<>();
        for (int i = 18; i < this.plantel.size(); i++) {
            //Jugador jugadorDeReservaActual = this.plantel.get(i);
            //reservas.add(jugadorDeReservaActual);
            reservas.add(this.plantel.get(i));
        }
        return reservas;
    }

}





















