package com.iaewtpi.ModeloRest;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Facundo on 25/05/2017.
 */
@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name="idCliente")
    private Cliente cliente;
    @OneToOne
    @JoinColumn(name="idVendedor")
    private Vendedor vendedor;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fechaDeReserva;
    private int costo;
    private int precioVenta;
    private String estado;
    private int codigoDeReserva;

    public Reserva() {
    }

    public Reserva(int codigoDeReserva, Cliente cliente, Vendedor vendedor, Date fechaDeReserva, int costo, int precioVenta, String estado) {
        this.codigoDeReserva = codigoDeReserva;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.fechaDeReserva = fechaDeReserva;
        this.costo = costo;
        this.precioVenta = precioVenta;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
