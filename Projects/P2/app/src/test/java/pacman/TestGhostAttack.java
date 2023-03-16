package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostAttack extends TestCase {

  public void testGhostAttack() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Ghost ghost = frame.addGhost(new Location(1, 1), "blinky", Color.red);
    PacMan pacman = frame.addPacMan(new Location(1,2));
    assertTrue(ghost.attack());
  }
}
