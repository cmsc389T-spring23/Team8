package pacman;
import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map {

  public enum Type {
    EMPTY,
    PACMAN,
    GHOST,
    WALL,
    COOKIE
  }

  private HashMap<Location, HashSet<Type>> field;
  private boolean gameOver;
  private int dim;

  private HashMap<String, Location> locations;
  private HashMap<String, JComponent> components;
  private HashSet<Type> emptySet;
  private HashSet<Type> wallSet;

  private int cookies = 0;

  public Map(int dim) {
    gameOver = false;
    locations = new HashMap<String, Location>();
    components = new HashMap<String, JComponent>();
    field = new HashMap<Location, HashSet<Type>>();

    emptySet = new HashSet<Type>();
    wallSet = new HashSet<Type>();
    emptySet.add(Type.EMPTY);
    wallSet.add(Type.WALL);
    this.dim = dim;
  }

  public void add(String name, Location loc, JComponent comp, Type type) {
    locations.put(name, loc);
    components.put(name, comp);
    if (!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
    field.get(loc).add(type);
  }

  public int getCookies() {
    return cookies;
  }

  public boolean isGameOver() {
    return gameOver;
  }

  public boolean move(String name, Location loc, Type type) {
    // update locations, components, and field
    Location oldLoc = locations.get(name);
    if(oldLoc == null){
      return false;
    }
    locations.remove(name);
    locations.put(name, loc);

    field.get(loc).add(type);
    field.get(oldLoc).remove(type);

    JComponent oldComp = components.get(name);
    components.remove(name);
    // use the setLocation method for the component to move it to the new location
    oldComp.setLocation(loc.x, loc.y);
    components.put(name, oldComp);

    return true;
  }

  public HashSet<Type> getLoc(Location loc) {
    // wallSet and emptySet will help you write this method
      if (!field.containsKey(loc)){
	  if (loc.x<0||loc.y<0||loc.x>dim||loc.y>dim){
	      return wallSet;
	  } else {
	      return emptySet;
	  }
      } else {
	  return field.get(loc);
      }
  }

  public boolean attack(String Name) {
    return false; // sabotage -- remove this line!
    // this.gameOver = true;
    // return true;
  }

  public JComponent eatCookie(String name) {
    // update locations, components, field, and cookies
    // the id for a cookie at (10, 1) is tok_x10_y1
    Location cookieLoc = locations.get(name);
    String cookieId = "tok_x" + cookieLoc.x + "_y" + cookieLoc.y;
    field.get(cookieLoc).remove(Map.Type.COOKIE);
    cookies++;
    return components.get(cookieId);
  }
}
