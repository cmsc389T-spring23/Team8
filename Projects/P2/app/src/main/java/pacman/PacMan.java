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
      if (this.get_valid_moves().size()!=0){
	  boolean x = myMap.move(myName,this.get_valid_moves().get(0),Map.Type.PACMAN);
	  if (x==false){return false;}else{ 
	  myLoc=this.get_valid_moves().get(0);
	  return true;
	  }
      } else {
	  return false;
      }
  }

  public boolean is_ghost_in_range() {
    return false;
  }

  public JComponent consume() {
    if (myMap.getLoc(myLoc).contains(Map.Type.COOKIE))
      return myMap.eatCookie(myName);

    return null;
  }
}
