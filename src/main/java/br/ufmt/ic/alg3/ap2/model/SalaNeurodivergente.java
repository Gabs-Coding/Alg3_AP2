/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufmt.ic.alg3.ap2.model;

/**
 *
 * @author Gabriel
 */


public class SalaNeurodivergente extends Sala {
    private boolean fonesDeOuvir;
    private String iluminacaoSuave;
    private String areaDeSensoryFriendly;

    public SalaNeurodivergente(String cadeiras, String luzes, String som, boolean fonesDeOuvir, String iluminacaoSuave, String areaDeSensoryFriendly) {
        super(cadeiras, luzes, som);
        this.fonesDeOuvir = fonesDeOuvir;
        this.iluminacaoSuave = iluminacaoSuave;
        this.areaDeSensoryFriendly = areaDeSensoryFriendly;
    }
    
    public SalaNeurodivergente() {
        
    }

    public boolean isFonesDeOuvir() {
        return fonesDeOuvir;
    }

    public void setFonesDeOuvir(boolean fonesDeOuvir) {
        this.fonesDeOuvir = fonesDeOuvir;
    }

    public String getIluminacaoSuave() {
        return iluminacaoSuave;
    }

    public void setIluminacaoSuave(String iluminacaoSuave) {
        this.iluminacaoSuave = iluminacaoSuave;
    }

    public String getAreaDeSensoryFriendly() {
        return areaDeSensoryFriendly;
    }

    public void setAreaDeSensoryFriendly(String areaDeSensoryFriendly) {
        this.areaDeSensoryFriendly = areaDeSensoryFriendly;
    }
    
    @Override
    public double calcularPrecoDoIngresso(){
        return (189.0);
    }
    
    @Override
    public void exibirDetalhesSala(){
        System.out.println("""
                           Projetada  com  a ideia de ser utilizada por pessoas  Neurodivergente,  possui 
                           fones para supress\u00e3o de ruídos, confort\u00e1vel para todos os espectadores.""");
        apresentarValorIngresso();
    }
    
    @Override
    public String retNomeSala() {
        return "Sala Neurodv.";
    }
}
