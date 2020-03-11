import javax.swing.JOptionPane;
class Read{
    public static void main(String [] args){
    int a;
    int b; 
    String input;
    input = JOptionPane.showInputDialog("enter first num");
    a = Integer.parseInt(input);
    input = JOptionPane.showInputDialog("enter second num");
    b = Integer.parseInt(input);
    int sum = a+b;
    JOptionPane.showMessageDialog(null,"Sum="+sum);
}
}
