
package ex4herpol;

import javax.swing.JOptionPane;


public class Imov {
      public double valor;
    public String local;
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    public void imprime(){
        
        JOptionPane.showMessageDialog(null, "Casa"
                + "\nLocal: " + this.getLocal()
                + "\nValor: R$" + this.valor
                + "\nCondição: ");
              
        
    }
    
}
