package semana_6.puerto_mesa_C16;

import java.util.ArrayList;

public class Puerto {
    //atributos
    private ArrayList<Contenedor> contenedor;


    //constructor
    public Puerto(ArrayList<Contenedor> contenedor) {
        this.contenedor = contenedor;
    }


    //metodos
    public Contenedor mostrarPorNumeroIdentificador(ArrayList<Contenedor> contenedores, int numerorequerido){
        int i = 0;
        boolean encontrado = false;
        Contenedor contenedorAux = null;
        while (i < contenedores.size() && !encontrado){
            if (contenedores.get(i).getNumeroIdentificador() == numerorequerido){
                encontrado = true;
                contenedorAux = contenedores.get(i);
            }
            i++;
        }
        return contenedorAux;
    }

    public void permitirIngresarNuevosContenedores(Contenedor nuevoContenedor){
        this.contenedor.add(nuevoContenedor);
    }

    public int calcularContenedoresPeligrososDesconocidos (ArrayList<Contenedor> contenedores){
        int contador = 0;
        for (int i = 0; i < contenedores.size(); i++){
            if (contenedores.get(i).getTextoDescribePais() == "Desconocido"){
                contador ++;
            }
        }
        return contador;
    }
}
