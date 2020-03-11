import javax.swing.JOptionPane;
class Read{
    public static void main(String [] args){
      String name ;
      String sur;
      name = JOptionPane.showInputDialog("enter your name");
      sur = JOptionPane.showInputDialog("enter surname");
      JOptionPane.showMessageDialog(null,name + " " + sur);
}
}
