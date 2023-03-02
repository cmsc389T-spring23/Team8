package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestPacManInRange extends TestCase {

  public void testPacManInRange() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Ghost ghost = frame.addGhost(new Location(9, 11), "Brian", Color.YELLOW);
    PacMan pacman = frame.addPacMan(new Location(9, 12));
    assertTrue(ghost.is_pacman_in_range());
  }
}
