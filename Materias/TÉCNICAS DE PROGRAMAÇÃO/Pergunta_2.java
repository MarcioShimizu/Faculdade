import javax.swing.JOptionPane;
public class Pergunta_2 {
  public static void main(String args[]){
    int valor;
    valor = Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade"));

    if(valor >= 18){
      JOptionPane.showMessageDialog(null, "Maior de idade");
    }else{
      JOptionPane.showMessageDialog(null, "Menor de idade");
    }
  }
}