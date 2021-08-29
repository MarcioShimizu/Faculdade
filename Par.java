import javax.swing.JOptionPane;
public class Par {
  public static void main(String args[]){
    int A, X, Y;
    A = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero A"));
    X = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero X"));
    Y = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero Y"));

    if(A > 15){
      X = X * 4;
      Y = Y + 3;
      A = 30;
    }else{
      if(A > 10){
        X = X * 3;
        Y = Y + 2;
        A = 12;
      }else{
        if(A > 5){
          X = X * 2;
          Y = Y + 1;
          A = 7;
        }else{
          X = X * 1;
          Y = Y * 3;
        };
      };
    };
    JOptionPane.showMessageDialog(null,"A:" + A + " X:" + X + " Y:" + Y);
    };
  };