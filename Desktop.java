package modelo;

public class Desktop extends Equipo {

    private String memoria;
    private String tarjetaGrafica;
    private String tamanoTorre;
    private String discoDuro;

    public Desktop(String fabricante, String modelo, String microprocesador,
                   String memoria, String tarjetaGrafica,
                   String tamanoTorre, String discoDuro) {

        super(fabricante, modelo, microprocesador);
        this.memoria = memoria;
        this.tarjetaGrafica = tarjetaGrafica;
        this.tamanoTorre = tamanoTorre;
        this.discoDuro = discoDuro;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() +
               "\nMemoria: " + memoria +
               "\nTarjeta gráfica: " + tarjetaGrafica +
               "\nTamaño torre: " + tamanoTorre +
               "\nCapacidad disco duro: " + discoDuro;
    }
}