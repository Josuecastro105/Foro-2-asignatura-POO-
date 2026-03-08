package modelo;

public class Laptop extends Equipo {

    private String memoria;
    private String tamanoPantalla;
    private String discoDuro;

    public Laptop(String fabricante, String modelo, String microprocesador,
                  String memoria, String tamanoPantalla,
                  String discoDuro) {

        super(fabricante, modelo, microprocesador);
        this.memoria = memoria;
        this.tamanoPantalla = tamanoPantalla;
        this.discoDuro = discoDuro;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() +
               "\nMemoria: " + memoria +
               "\nTamaño pantalla: " + tamanoPantalla +
               "\nCapacidad disco duro: " + discoDuro;
    }
}