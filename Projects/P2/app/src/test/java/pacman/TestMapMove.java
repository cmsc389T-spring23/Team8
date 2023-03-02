package pacman;
import java.io.*;
import junit.framework.*;
import pacman.Map.Type;

import java.awt.Color;

public class TestMapMove extends TestCase {

  public void testMapMove() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(9, 11));
    
    assertTrue(frame.getMap().move("pacman", new Location(8, 11), Type.PACMAN));
    return;
  }
}
