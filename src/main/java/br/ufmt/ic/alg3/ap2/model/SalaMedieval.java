package br.ufmt.ic.alg3.ap2.model;

public class SalaMedieval extends Sala {
    private boolean luzDeTochas;
    private boolean chaoDeMadeira;
    private boolean PortasDeMetalPesadas;
    
    public SalaMedieval(String cadeiras, String luzes, String som, boolean luzDeTochas, boolean chaoDeMadeira, boolean PortasDeMetalPesadas) {
        super(cadeiras, luzes, som);
        this.luzDeTochas = luzDeTochas;
        this.chaoDeMadeira = chaoDeMadeira;
        this.PortasDeMetalPesadas = PortasDeMetalPesadas;
    }
        public SalaMedieval() {
        
    }
     public boolean hasLuzDeTochas() {
        return luzDeTochas;
    }

    public void setLuzDeTochas(boolean luzDeTochas) {
        this.luzDeTochas = luzDeTochas;
    }

    public boolean hasChaoDeMadeira() {
        return chaoDeMadeira;
    }

    public void setChaoDeMadeira(boolean chaoDeMadeira) {
        this.chaoDeMadeira = chaoDeMadeira;
    }
    
    @Override
    public double calcularPrecoDoIngresso(){
        return (178.0);
    }
    
    @Override
    public void exibirDetalhesSala(){
        System.out.println("""
                           Essa  sala  possui a premissa de ser um ambiente medieval, possui  o  ch\u00e3o  de 
                           madeira,  e  tochas  de fogo como luzes, afim de passar  algumas  sessoes  que 
                           que remetem a esse estilo, como senhor dos an\u00e9is.""");
        apresentarValorIngresso();
    }
    
    @Override
    public String retNomeSala() {
        return "Sala Medieval";
    }
}