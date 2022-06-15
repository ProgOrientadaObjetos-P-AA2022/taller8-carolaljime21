package paquete1;

public class DocenteNombramiento extends Docente {

    double valorSueldo;
    double valorHorasExtra;
    int numeroHorasExtra;
    double totalSueldo;

    public void establecerValorSueldo(double x) {
        valorSueldo = x;
    }

    public void establecerValorHorasExtra(double x) {
        valorHorasExtra = x;
    }

    public void establecerNumeroHorasExtra(int x) {
        numeroHorasExtra = x;
    }

    public void establecerTotalSueldo() {
        totalSueldo = (valorHorasExtra * numeroHorasExtra) + valorSueldo;
    }

    public double obtenerValorSueldo() {
        return valorSueldo;
    }

    public double obtenerValorHorasExtra() {
        return valorHorasExtra;
    }

    public int obtenerNumeroHorasExtra() {
        return numeroHorasExtra;
    }

    public double obtenerTotalSueldo() {
        return totalSueldo;
    }

    @Override
    public String toString() {
        String reporte = String.format("DATOS DOCENTE\n"
                + "Nombre: %s\n"
                + "Cedula: %s\n"
                + "Sueldo del docente: %.2f\n"
                + "Valor de horas extra: %.2f\n"
                + "Número de horas extra: %d\n"
                + "Sueldo total: %.2f\n",
                obtenerNombresDocente(),
                obtenerCedulaDocente(),
                obtenerValorSueldo(),
                obtenerValorHorasExtra(),
                obtenerNumeroHorasExtra(),
                obtenerTotalSueldo());
        return reporte;
    }

}
