
package classepoo_cachorro;

import javax.swing.JOptionPane;

public class ClassePOO_Cachorro {

    public static void main(String[] args) {
   Cachorro dog = new Cachorro();
   dog.setNome  (JOptionPane.showInputDialog("Digite o nome do cachorro"));
   dog.setTamanho (Double.parseDouble(JOptionPane.showInputDialog("Digite a altura")));
   dog.setCor ("Marron");
   dog.setPeso (1);
   dog.mostrar();
   
   
   Cachorro dog1 =new Cachorro();
    dog.setNome  (JOptionPane.showInputDialog("Digite o nome do cachorro"));
   dog.setTamanho (Double.parseDouble(JOptionPane.showInputDialog("Digite a altura")));
   dog.setCor ("Marron");
   dog.setPeso (1);
   dog.mostrar();
   
    }
    
}
