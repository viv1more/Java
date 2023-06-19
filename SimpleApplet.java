import java.applet.*;
import java.awt.*;

/*
<applet code="SimpleApplet.class" 
         height="250" width="250">
</applet>
*/
public class SimpleApplet extends Applet {
  public void init() {
  }

  public void start() {
  }

  public void stop() {
  }

  public void destroy() {
  }

  public void paint(Graphics g) {
    g.setColor(Color.RED);
    g.drawString("Welcome to Hubberspot!", 50, 100);
  }
}