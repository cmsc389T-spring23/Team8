package pacman;
import java.util.ArrayList;
import java.util.HashSet;

public class Ghost {
  String myName;
  Location myLoc;
  Map myMap;

  public Ghost(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {
    return null;
  }

  public boolean move() {
     if (this.get_valid_moves().size()!=0){
	  boolean x = myMap.move(myName,this.get_valid_moves().get(0),Map.Type.GHOST);
	  if (x==false){return false;}{else 
	  myLoc=this.get_valid_moves().get(0);
	  return true;
	  }
      } else {
	  return false;
      }
  }

  public boolean is_pacman_in_range() {
    return false;
  }

  public boolean attack() {
    return is_pacman_in_range() && myMap.attack(myName);
  }
}
