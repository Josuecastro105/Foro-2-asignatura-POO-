package modelo;

public class Tablet extends Equipo {

    private String tamanoPantalla;
    private String tipoPantalla;
    private String memoriaNAND;
    private String sistemaOperativo;

    public Tablet(String fabricante, String modelo, String microprocesador,
                  String tamanoPantalla, String tipoPantalla,
                  String memoriaNAND, String sistemaOperativo) {

        super(fabricante, modelo, microprocesador);
        this.tamanoPantalla = tamanoPantalla;
        this.tipoPantalla = tipoPantalla;
        this.memoriaNAND = memoriaNAND;
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() +
               "\nTamaño pantalla: " + tamanoPantalla +
               "\nTipo pantalla: " + tipoPantalla +
               "\nMemoria NAND: " + memoriaNAND +
               "\nSistema Operativo: " + sistemaOperativo;
    }
}
