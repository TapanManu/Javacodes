import java.awt.*;
class First {
    First(){
        Frame f = new Frame();
        Button b = new Button("click me");
        b.setBounds(30,50,80,30);
        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setBackground(Color.green);
        f.setForeground(Color.white);
        f.setTitle("New Frame");
    }
    public static void main(String args[]){
        First f = new First();
    }
}
