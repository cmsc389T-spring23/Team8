package pacman;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JComponent;

import pacman.Map.Type;

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
    ArrayList<Location> validLocations = new ArrayList<Location>();
    //left
    Location leftLoc = new Location ((myLoc.x - 1), myLoc.y);
    HashSet<Type> left = myMap.getLoc(leftLoc);
    if(!left.contains(Map.Type.WALL)){
      validLocations.add(leftLoc);
    }

    //right
    Location rightLoc = new Location ((myLoc.x + 1), myLoc.y);
    HashSet<Type> right = myMap.getLoc(rightLoc);
    if(!right.contains(Map.Type.WALL)){
      validLocations.add(rightLoc);
    }

    //up
    Location upLoc = new Location ((myLoc.x), myLoc.y - 1);
    HashSet<Type> up = myMap.getLoc(upLoc);
    if(!up.contains(Map.Type.WALL)){
      validLocations.add(upLoc);
    }

    //down
    Location downLoc = new Location ((myLoc.x), myLoc.y + 1);
    HashSet<Type> down = myMap.getLoc(downLoc);
    if(!down.contains(Map.Type.WALL)){
      validLocations.add(downLoc);
    }
    ArrayList<Location> validSLocations = new ArrayList<Location>();
    return validSLocations;
  }

    public boolean move(){
      return false;//sabotage!
      /*if (this.get_valid_moves().isEmpty()==false){
	  boolean x = myMap.move(myName,this.get_valid_moves().get(0),Map.Type.PACMAN);
	  if (x==false){return false;}else{ 
	  myLoc=this.get_valid_moves().get(0);
	  return true;
	   }
      } else {
	  return false;
	  }*/
  }

  public boolean is_ghost_in_range() {
    return false; // sabotage -- remove this line!
    // int x = this.myLoc.x;
    // int y = this.myLoc.y;

    // for(int i = -1; i < 2; i++) {
    //     for(int j = -1; j < 2; j++) {
    //         for(Map.Type type : myMap.getLoc(new Location(x + i, y + j))) {
    //             if (type == Map.Type.GHOST) {
    //                 if(i != 0 || j != 0) {
    //                     return true;
    //                 } 
    //             }
    //         }
    //     }
    // }

    // return false;
  }

  public JComponent consume() {
      return new CookieComponent(1,1,20);//sabotage!
      /* if (myMap.getLoc(myLoc).contains(Map.Type.COOKIE))
      return myMap.eatCookie(myName);

      return null;*/
  }
}
