package paquete1;

public class DocenteFactura extends Docente {

    double valorFactura;
    double valorIvaDescuento;
    double valorCancelar;

    public void establecerValorFactura(double x) {
        valorFactura = x;
    }

    public void establecerValorIvaDescuento(double x) {
        valorIvaDescuento = x;
    }

    public void establecerValorCancelar() {
        valorCancelar = valorFactura - ((valorFactura * valorIvaDescuento));
    }

    public double obtenerValorFactura() {
        return valorFactura;
    }

    public double obtenerIvaDescuento() {
        return valorIvaDescuento;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    @Override
    public String toString() {
        String reporte = String.format("FACTURA DOCENTE\n"
                + "Nombre: %s\n"
                + "Cedula: %s\n"
                + "Valor de la Factura: %.2f\n"
                + "Iva Descuento: %.2f\n"
                + "Valor a Cancelar: %.2f\n",
                obtenerNombresDocente(),
                obtenerCedulaDocente(),
                obtenerValorFactura(),
                obtenerIvaDescuento(),
                obtenerValorCancelar());
        return reporte;
    }
}
