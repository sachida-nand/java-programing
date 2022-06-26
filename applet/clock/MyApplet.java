import java.applet.*;
import java.util.*;
import java.awt.*;
/*<applet code = "MyApplet" width=400 height=400></applet>*/
public class MyApplet extends Applet implements Runnable {
    Thread t,t1;
    public void start() {
        t=new Thread(this);
        t.start();
    }
    public void run() {
        t1 = Thread.currentThread();
        while(t1==t){
            repaint();
            try{
                t1.sleep(1000);
            }
            catch(InterruptedException e){}
        }
    }
    public void paint(Graphics g){
        Calendar cal = new GregorianCalendar();
        String Hour = String.valueOf(cal.get(Calendar.HOUR));
        String Minute = String.valueOf(cal.get(Calendar.MINUTE));
        String Second = String.valueOf(cal.get(Calendar.SECOND));
        g.drawString(Hour +":" + Minute + ":" + Second,150,200);
    }
}