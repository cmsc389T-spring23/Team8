package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostAttack extends TestCase {

  public void testGhostAttack() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Ghost ghost = frame.addGhost(new Location(9, 11), "Brian", Color.YELLOW);
    PacMan pacman = frame.addPacMan(new Location(9, 12));
    assertTrue(pacman.is_ghost_in_range());
    return;
  }
}
