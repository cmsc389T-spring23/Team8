package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostValidMoves extends TestCase {

  public void testGhostValidMoves() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Ghost ghost = frame.addPacMan(new Location(6, 1));
    assertTrue(ghost.get_valid_moves().size() == 2);
    return;
  }
}
