package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestMapGetLoc extends TestCase {

  public void testMapGetLoc() throws FileNotFoundException {
      NoFrame frame = new NoFrame();
      Location z = new Location(70,70);
      assertTrue(frame.getMap().getLoc(z).contains(Map.Type.WALL)==true);
      return;
  }
}
