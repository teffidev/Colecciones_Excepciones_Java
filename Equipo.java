package semana_6;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    //atributos
    private String nombre;
    private ArrayList<Jugador> jugadores;



    //constructor
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<Jugador>();
    }

    //Depende de lo que pida el cliente...
    //public Equipo(String nombre, , ArrayList jugadores) {
        //this.nombre = nombre;
        //this.jugadores = jugadores;
    //}



    //metodos
    public void addJugador(Jugador jugador){
        this.jugadores.add(jugador); //Estoy guardando un unico jugador de tipo jugador

    }

    public ArrayList getJugadores(){
        return this.jugadores;
    }

    public void mostrarJugadoresTitulares(){
        for(int i = 0; i < this.jugadores.size(); i++){
            System.out.println("Esta lesionado: " + jugadores.get(i).isTitulares());
        }
    }

    public int getCantidadJugadoresLesionados(){
        return 0;
    }

}
