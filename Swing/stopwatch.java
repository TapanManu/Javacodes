import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.lang.Thread;
//digital stopwatch using awt
class StopWatch extends JFrame{
	JLabel l,m,s,ms;
	JButton start,reset,stop;
	boolean flag = true;
	int counts = 0,countm=0;
	StopWatch(){
	 setLayout(null);
     l = new JLabel();
     m = new JLabel();
     s = new JLabel();
     start = new JButton("start");
     stop = new JButton("stop");
     reset = new JButton("reset");
     setSize(400,400);
     setVisible(true);
     
     /*addWindowListener(new WindowAdapter(){
     	public void windowClosing(WindowEvent w){
     		flag = false;
     	}
     });*/
     //add(l,BorderLayout.CENTER);
     add(m);
     add(s);
     add(l);
     add(reset);
     add(start);
     add(stop);

     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     m.setBounds(175,175,20,50);
     l.setBounds(195,175,10,50);
     s.setBounds(205,175,30,50);
     reset.setBounds(30,250,100,50);
     start.setBounds(160,250,100,50);
     stop.setBounds(290,250,100,50);

     m.setText("00");
     l.setText(":");
     s.setText("00");
     
     reset.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e){
              	m.setText("00");
                s.setText("00");   
                countm=0;
                counts=0;   	
              }
	});
     start.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e){
              	flag=true; 
              	//addstart command
              }
	});

     stop.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e){
              	flag=false;  	

              }
	});
}
	public void incrClock() throws InterruptedException{
		while(flag){
		Thread.sleep(1000);
		counts++;
        s.setText(counts>=10?String.valueOf(counts):"0"+String.valueOf(counts)); //incrementing in each second
        if(counts ==60){
        	counts=0;
        	countm++;
            m.setText(countm>=10?String.valueOf(countm):"0"+String.valueOf(countm));
            s.setText("00");
        }
    }
}

	public static void main(String[] args) {
		try{
		new StopWatch().incrClock();
	    }
	    catch(InterruptedException e){
	    	System.out.println("exception");
	    }
	}

}
