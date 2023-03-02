package pacman;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JComponent;

public class PacMan {
  String myName;
  Location myLoc;
  Map myMap;
  Location shift;

  public PacMan(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {
    return null;
  }

  public boolean move() {
    return false;
  }

  public boolean is_ghost_in_range() {
    int x = this.myLoc.x;
    int y = this.myLoc.y;

    for(int i = -1; i < 2; i++) {
        for(int j = -1; j < 2; j++) {
            for(Map.Type type : myMap.getLoc(new Location(x + j, y + j))) {
                if (type == Map.Type.GHOST) {
                    if(i != 0 || j != 0) {
                        return true;
                    } 
                }
            }
        }
    }

    return false;
  }

  public JComponent consume() {
    if (myMap.getLoc(myLoc).contains(Map.Type.COOKIE))
      return myMap.eatCookie(myName);

    return null;
  }
}
