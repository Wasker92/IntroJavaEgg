package entidad;

public class Cuenta {
    private int numCuenta;
    private long dni;
    private int saldoActual;

    public Cuenta() {
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public long getDni() {
        return dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
}