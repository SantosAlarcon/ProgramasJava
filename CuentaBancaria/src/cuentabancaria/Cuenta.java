package cuentabancaria;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Clase que gestiona los datos de una cuenta bancaria.
 * @author FutuzorMekkla
 * Fecha @date
 */
public class Cuenta {

    private String titular;
    private String NCC;
    private float saldo;

    /**
     * Crea una nueva Cuenta Corriente al que sólo se pide el nombre del
     * titular.
     * @param titular Nombre del titular de la Cuenta Corriente
     */
    public Cuenta(String titular) {
        this.titular = (titular != null ? titular : null);
        this.NCC = null;
        this.saldo = 0.0f;
    }

    @Override
    public String toString() {
        StringBuilder cadena = new StringBuilder();
        NumberFormat dec = DecimalFormat.getCurrencyInstance(Locale.getDefault());
        cadena.append("Cuenta Corriente de <");
        cadena.append(titular);
        cadena.append(">\n----------------------------------------------------------\n");
        cadena.append(String.format("%-30s %-20s","Número de Cuenta Corriente: ",NCC));
        cadena.append(String.format("%-31s %-15s","\nSaldo disponible: ",dec.format(saldo)));
        return cadena.toString();
    }
    
    /**
     * Devuelve el número de Cuenta Corriente
     * @return Número de Cuenta Corriente
     */
    public String getNCC() {
        return NCC;
    }

    /**
     * Establece el número de Cuenta Corriente al objeto actual.
     * @param NCC Número de Cuenta Corriente
     */
    public void setNCC(String NCC) {
        this.NCC = NCC;
    }

    /**
     * Devuelve el saldo disponible de la cuenta bancaria.
     * @return Saldo disponible de la cuenta
     */
    public float getSaldo() {
        return this.saldo;
    }

    /**
     * Establece el saldo disponible de la cuenta.
     * @param saldo Cantidad que se pasa por parámetro.
     */
    public void setSaldo(float saldo) {
        this.saldo = (saldo > 0.0f ? saldo : 0.0f);
    }

    /**
     * Devuelve el titular de la Cuenta Corriente
     * @return Titular de la Cuenta Corriente
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Establece el nombre del titular de la Cuenta Corriente
     * @param titular Titular de la Cuenta Corriente
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * Añade una cantidad de pasta a la cuenta bancaria.
     * @param pasta Cantidad de pasta a ingresar a la cuenta.
     */
    public void ingresarPasta(float pasta) {
        if (pasta > 0.0f) {
            this.saldo += pasta;
        }
    }

    /**
     * Retira una cantidad de pasta a la cuenta bancaria.
     * @param pasta Cantidad de pasta a ingresar a la cuenta.
     */
    public void retirarPasta(float pasta) {
        if (pasta <= this.getSaldo()) {
            this.saldo -= pasta;
        }
    }
}
