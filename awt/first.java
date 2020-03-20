import java.awt.*;
class First extends Frame{
    First(){
        Button b = new Button("click me");
        b.setBounds(30, 100, 80, 30);
        add(b);
        setSize(300, 300);
        setLayout(null);
        setTitle("first frame");
        setBackground(Color.green);
        setForeground(Color.white);
        setVisible(true);
    }
    public static void main(String[] args){
        First f = new First();
    }
}
