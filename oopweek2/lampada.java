package oopweek2;

public class lampada {
    private String cor;
    private String marca;
    private boolean ligada;

   
    public lampada() {
        this.cor = "vermelho";
        this.marca = "branco";
        this.ligada = false;
    }

    
    public lampada(String cor, String marca) {
        this.cor = cor;
        this.marca = marca;
        this.ligada = false;
    }

    
    public lampada(String cor) {
        this(cor, "philips");
    }

    
    public void ligar() {
        if (!this.ligada) {
            this.ligada = true;
            mostrarStatus();
        }
    }

    public void desligar() {
        if (this.ligada) {
            this.ligada = false;
            mostrarStatus();
        }
    }

   
    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isLigada() {
        return this.ligada;
    }

   
    private void mostrarStatus() {
        if (this.ligada) {
            System.out.println("A lâmpada está ligada.");
        } else {
            System.out.println("A lâmpada está desligada.");
        }
    }
}
