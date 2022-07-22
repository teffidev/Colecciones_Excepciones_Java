package semana_6.arrays;

public class Program {

    public static void main(String[] args) {

        try{
            Equipo seleccion = new Equipo("Seleccion Persa");

            Jugador Pepe = new Jugador("ARQUERO", "Pepe", 7);
            Jugador Lilo = new Jugador("ARQUERO", "Lilo", 8);
            Jugador Arce = new Jugador("DEFENSOR", "Arce", 14);
            Jugador Jul = new Jugador("TITULAR", "Jul", 10);

            seleccion.addJugador(Pepe);
            seleccion.addJugador(Lilo);
            seleccion.addJugador(Arce);
            seleccion.addJugador(Jul);

            Integer cantidadArqueros = seleccion.cantJugadores("ARQUERO");
            System.out.println(cantidadArqueros);
        } catch (PosicionInexistenteException exception){
            System.out.println("error");
        }
    }
}
