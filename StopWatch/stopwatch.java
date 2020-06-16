import java.awt.*;
import java.awt.event.*;
import java.time.LocalTime;
import java.lang.Thread;
//digital stopwatch using awt
class StopWatch extends Frame{
	Label l,m,s,ms;
	boolean flag = true;
	int counts = 0,countm=0;
	StopWatch(){
	 setLayout(null);
     l = new Label();
     m = new Label();
    // ms = new Label();
     s = new Label();
     //LocalTime t = LocalTime.now();
     //l.setText(t.toString());
     setSize(400,400);
     setVisible(true);
     setBackground(Color.YELLOW);
     addWindowListener(new WindowAdapter(){
     	public void windowClosing(WindowEvent w){
     		flag = false;
     		dispose();
     	}
     });
     //add(l,BorderLayout.CENTER);
     add(m);
     add(s);
     add(l);
     m.setBounds(175,175,20,50);
     l.setBounds(195,175,10,50);
     s.setBounds(205,175,30,50);
     //ms.setBounds(275,175,50,50);
     m.setText("00");
     l.setText(":");
     s.setText("00");
     //ms.setText("00");
     
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
