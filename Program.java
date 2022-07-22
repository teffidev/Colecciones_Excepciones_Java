package semana_6;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        Equipo losAguiluchos = new Equipo("Los Aguiluchos");

        Jugador gonzalez = new Jugador(-3, "Gonzalo Gonzalez", false, true);
        losAguiluchos.addJugador(gonzalez); //Estamos adicionando un jugador


        Jugador mendez = new Jugador(5, "Lucio Mendez", false, true);
        losAguiluchos.addJugador(mendez); //Estamos adicionando un jugador

        //Quiero mostrar todos los jugadores ¿Como lo hariamos?
        ArrayList<Jugador> jugadores = losAguiluchos.getJugadores();

        //miremoslo con un for each: donde itero directamente
        //con el objeto=
        for (Jugador j : jugadores){
            System.out.println("nombre jugador: " + j.getNombre());
        }

        //¿Como hago para mostrar esos jugadores?
        //Donde itero con indices=
        /*for(int i = 0; i < jugadores.size(); i++){
            //System.out.println("Nombre del jugador " + (i+1) + ": " + jugadores.get(i).getNombre());
            System.out.println("Nombre del jugador " + (i+1) + ": " + jugadores.get(i).toString());
        }*/

    }
}
