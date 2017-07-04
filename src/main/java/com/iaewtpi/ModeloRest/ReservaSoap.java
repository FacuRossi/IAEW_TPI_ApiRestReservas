package com.iaewtpi.ModeloRest;

/**
 * Created by Facundo on 03/07/2017.
 */
public class ReservaSoap {
    private int IdVehiculoCiudad;
    private String apellidoNombreCliente;
    private String nroDocumentoCliente;

    public ReservaSoap(int idVehiculoCiudad, String apellidoNombreCliente, String nroDocumentoCliente) {
        IdVehiculoCiudad = idVehiculoCiudad;
        this.apellidoNombreCliente = apellidoNombreCliente;
        this.nroDocumentoCliente = nroDocumentoCliente;
    }

    public int getIdVehiculoCiudad() {
        return IdVehiculoCiudad;
    }

    public void setIdVehiculoCiudad(int idVehiculoCiudad) {
        IdVehiculoCiudad = idVehiculoCiudad;
    }

    public String getApellidoNombreCliente() {
        return apellidoNombreCliente;
    }

    public void setApellidoNombreCliente(String apellidoNombreCliente) {
        this.apellidoNombreCliente = apellidoNombreCliente;
    }

    public String getNroDocumentoCliente() {
        return nroDocumentoCliente;
    }

    public void setNroDocumentoCliente(String nroDocumentoCliente) {
        this.nroDocumentoCliente = nroDocumentoCliente;
    }
}
