package com.iaewtpi.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.Date;

/**
 * Created by Facundo on 25/05/2017.
 */
@Entity
public class Reserva {

    @Id
    private int codigoDeReserva;
    @OneToOne
    @JoinColumn(name="idCliente")
    private Cliente cliente;
    @OneToOne
    @JoinColumn(name="idVendedor")
    private Vendedor vendedor;

    private Date fechaDeReserva;
    private double costo;
    private double precioVenta;

    public Reserva() {
    }

    public Reserva(int codigoDeReserva, Cliente cliente, Vendedor vendedor, Date fechaDeReserva, double costo, double precioVenta) {
        this.codigoDeReserva = codigoDeReserva;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.fechaDeReserva = fechaDeReserva;
        this.costo = costo;
        this.precioVenta = precioVenta;
    }

    public int getCodigoDeReserva() {
        return codigoDeReserva;
    }

    public void setCodigoDeReserva(int codigoDeReserva) {
        this.codigoDeReserva = codigoDeReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Date getFechaDeReserva() {
        return fechaDeReserva;
    }

    public void setFechaDeReserva(Date fechaDeReserva) {
        this.fechaDeReserva = fechaDeReserva;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
}
