
package ex4herpol;

import javax.swing.JOptionPane;

public class Velho extends Imov {
 private double desconto;
    private String estado = "Velho";
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
        
    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public double MetDesconto(){
    
        this.valor = this.valor * this.desconto;
        return this.valor;
    }
        
    @Override
    public void imprime(){
        
        JOptionPane.showMessageDialog(null, "Mansão"
                + "\nLocal: " + this.getLocal()+ 
                "\nValor: R$" + this.valor
                + "\nCondição: " + this.getEstado());
        
    }
        
}
