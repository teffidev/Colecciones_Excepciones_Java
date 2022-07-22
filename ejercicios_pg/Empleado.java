package semana_6.ejercicios_pg;

public class Empleado {

    private String nombre;
    private String apellido;
    private int sueldo;

    public Empleado(String nombre, String apellido, int sueldo) throws Exception {
        if(nombre == null)
            try {
                throw new Exception("Nombre no puede estar vacío");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        if(apellido == null)
            try {
                throw new Exception("Apellido no puede estar vacío" );
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        if(sueldo <= 0)
            try {
                throw new Exception("Sueldo no puede ser menor o igual a cero" );
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        this.nombre=nombre;
        this.apellido=apellido;
        this.sueldo=sueldo;
    }

    //No modificar
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getSueldo() {
        return sueldo;
    }
}

