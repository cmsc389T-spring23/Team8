package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestPacManValidMoves extends TestCase {

  public void testPacManValidMoves() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(6, 1));
    assertTrue(pacman.get_valid_moves().size() == 2);
    return;
  }
}
