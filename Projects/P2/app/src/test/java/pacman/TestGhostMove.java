package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostMove extends TestCase {

  public void testGhostMove() throws FileNotFoundException {
       NoFrame frame = new NoFrame();
       Ghost ghost = frame.addGhost(new Location(1,1), "name", Color.red);
    assertTrue(ghost.move()==true);
    return;
  }
}
