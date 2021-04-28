/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.controlador.los3cerditos;

import edu.sena.modelo.los3cerditos.Casa;
import java.io.Serializable;
import java.util.ArrayList;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Josarta
 */
@Named(value = "gestionCasaView")
@ViewScoped
public class GestionCasaView implements Serializable {

    private Casa casaNueva = new Casa();
    private ArrayList<Casa> listaCasas = new ArrayList<>();

    /**
     * Creates a new instance of GestionCasaView
     */
    public GestionCasaView() {
    }

    public void adicionarCasa() {
        listaCasas.add(casaNueva);
        casaNueva = new Casa();
    }

    public void removerCasa(int pos) {
        listaCasas.remove(pos);
    }

    public Casa getCasaNueva() {
        return casaNueva;
    }

    public void setCasaNueva(Casa casaNueva) {
        this.casaNueva = casaNueva;
    }

    public ArrayList<Casa> getListaCasas() {
        return listaCasas;
    }

    public void setListaCasas(ArrayList<Casa> listaCasas) {
        this.listaCasas = listaCasas;
    }

}
