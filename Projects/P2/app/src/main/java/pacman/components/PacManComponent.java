package pacman;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class PacManComponent extends JComponent {
  private int scale;

  public PacManComponent(int x, int y, int scale) {
    setLocation(x, y);
    setSize(20, 40);
    this.scale = scale;
  }

  public void paintComponent(Graphics g) {
    // Image image=new ImageIcon("pacman.png").getImage();
    // g.drawImage(image,3,4,this);
    Graphics2D g2 = (Graphics2D) g;
    Ellipse2D.Double ball = new Ellipse2D.Double(0, 0, scale, scale);
    g2.setColor(Color.yellow);
    g2.fill(ball);
  }

  public void setLocation(int x, int y) {
    super.setLocation(scale * x, scale * y);
  }
}
