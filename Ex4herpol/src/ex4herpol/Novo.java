
package ex4herpol;

import javax.swing.JOptionPane;


public class Novo extends Imov {
  private double taxa;
    private String estado = "Novo";

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public double getTaxa() {
        return taxa;
    }
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    
    
    public double calculaTaxa(){
        this.valor = this.valor *this.taxa;
        return this.valor;
        
    }
    
    @Override
    public void imprime(){
        
        JOptionPane.showMessageDialog(null, "Barraco"
                + "\nLocal: " + this.getLocal()
                + "\nValor: R$" + this.valor
                + "\nEstado: " + this.getEstado());
        
    }

  
    
}