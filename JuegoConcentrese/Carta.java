/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoConcentrese;


public class Carta {

    private String etiqueta;
    private String palo;
    public boolean revelada;

    public Carta(String etiqueta, String palo) {
        this.etiqueta = etiqueta;
        this.palo = palo;
        this.revelada = false;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public String getPalo() {
        return palo;
    }

    public boolean esIgual(Carta carta) {
        return carta.getEtiqueta().equals(etiqueta) && carta.getPalo().equals(palo);
    }

    public Carta darCopia() {
        Carta nuevaCarta = new Carta(this.etiqueta, this.palo);
        return nuevaCarta;
    }

    public void destapar() {
        revelada = true;
    }

    public void tapar() {
        revelada = false;
    }

   
