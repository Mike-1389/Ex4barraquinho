
package ex4herpol;

import javax.swing.JOptionPane;


public class Ex4herpol {

    public static void main(String[] args) {
     int operacao;
        
        Novo novo = new Novo();
        Velho velho = new Velho();
                
        velho.setValor(300);
        velho.setLocal("Mauá");        
        novo.setValor(2000);
        novo.setLocal("Diadema");
        novo.setTaxa(1.8);
        velho.setDesconto(0.8);
        
        operacao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 Para Imóvel novo\nDigite 2 para Imóvel Velho"));
        switch(operacao){
            
            case 1:
                novo.calculaTaxa();
                novo.imprime();
                break;
            case 2:
                velho.MetDesconto();
                velho.imprime();
                break;
            default:
                JOptionPane.showMessageDialog(null,"erro!");
                break;
            
        }
        
        
    }
    
}