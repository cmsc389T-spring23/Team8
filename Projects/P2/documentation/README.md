# Documentation

## Table of Contents

| [PacMan Class](#-pacman-class) | [Ghost Class](#-ghost-class)   | [Map Class](#-map-class) | [Location](#-location-class) |
| ------------- | ------------- | ------------ | ------------ |
| [get_valid_moves](#get_valid_moves)  | [get_valid_moves](#get_valid_moves-1)  | [move](#movestring-name-location-loc-type-type) | [Location](#locationint-x-int-y) |
|[move](#move) | [ghost-move](#move-1) |  [getLoc](#getloclocation-loc) | [shift](#shiftint-x-int-y) |
|[is_ghost_in_range](#is_ghost_in_range)| [is_pacman_in_range](#is_pacman_in_range)  | [attack](#attackstring-name)| [unshift](#unshiftlocation-other) |
| [consume](#consume)  | [attack](#attack)  | [eatCookie](#eatcookiestring-name) | [equals](#equalslocation-other) |

## <img src=1200px-Pac_Man.svg.png width="50" height="50"> PacMan Class 


### get_valid_moves()

- **Type**: `() -> ArrayList`
- **Description**: This method returns all the valid moves that PacMan can make given his current position. You must take into account the fact that PacMan cannot move into a wall, nor should he be able to exit the bounds of the game. Though it would end the game, moving into a spot a ghost exists is a valid move. Any other decisions regarding PacMan's movements is up to you.
- **Examples**:
  ```java
  //pacman at location (9,11)
  pacman.get_valid_moves() -> {(9,12), (10,11), (10,12)}
  ```

### move()

- **Type**: `() -> Bool`
- **Description**: This method uses the `get_valid_moves` method to find the possible locations that PacMan can move, given his current location. The method then chooses to move in one of those directions. You are free to apply an algorithm here if you would like, but the only requirement is that you move in a valid direction. To move successfully, make sure to call the map move function and update PacMan's location. If PacMan is able to move, this function returns true otherwise it returns false.
- **Examples**:
  ```java
  //pacman at location (9,11)
  pacman.move() -> true
  pacman.myLoc ∈ {(9,12), (10,11), (10,12)}
  ```

### is_ghost_in_range()

- **Type**: `() -> Bool`

- **Description**: This method checks its surroundings to see if any Ghosts are in attack range. The attack radius of a ghost is 1 which means that a ghost at location <img src="https://render.githubusercontent.com/render/math?math=(x, y)"> can attack PacMan as long as PacMan is located at <img src="https://render.githubusercontent.com/render/math?math=(x \pm 1, y \pm 1)">. If any Ghosts are in the attack range, this method returns true otherwise it returns false.

- **Examples**:

  ```java
  //ghost at location (9,11)
  //pacman at location (9,12)
  pacman.is_ghost_in_range() -> true
  ```

### consume()

- **Type**: `() -> JComponent`
- **Description**: This method checks to see if there is a 'power-cookie' located in Pacman's current <img src="https://render.githubusercontent.com/render/math?math=(x, y)"> coordinate. If there is, this method calls the `eatCookie` method from the Map Class, and returns the cookie component if the cookie a consumed, and null otherwise.
- **Examples**:

```java
//pacman at location (9,12)
//cookie NOT at location (9,12)
pacman.consume() -> null
```

## <img src=Ghosts_orange_right.webp width="80" height="80"> Ghost Class 

In this section, you must create a class for the ghosts that are moving around the map. The class and constructor are given to you in the Ghost.java file. Each team member should choose one of the following functions to complete and create a feature-item branch off of the FTR-ghost feature branch.

### get_valid_moves()

- **Type**: `() -> ArrayList<Location>`
- **Description**: This function returns an arraylist of possible locations that a ghost can move to from its current location. Ghosts cannot move through walls, but they can move through other ghosts or PacMan.
- **Examples**:
  ```java
  //ghost at location (9,11)
  ghost.get_valid_moves() -> {(9,12), (10,11), (10,12)}
  ```

### move()

- **Type**: `() -> Bool`

- **Description**: This function uses the `get_valid_moves` function to find the possible locations that a ghost can move to from its current location and chooses to move in one of those directions. You are free to apply an algorithm here if you would like, but the only requirement is that you move in a valid direction. To move successfully, make sure to call the map move function and update the ghost's location. If the ghost is able to move, this function returns true otherwise it returns false.

- **Examples**:

  ```java
  //ghost at location (9,11)
  ghost.move() -> true
  ghost.myLoc ∈ {(9,12), (10,11), (10,12)}
  ```

### is_pacman_in_range()

- **Type**: `() -> Bool`

- **Description**: This function checks its surroundings to see if PacMan is in attack range. The attack radius of a ghost is 1 which means that a ghost at location <img src="https://render.githubusercontent.com/render/math?math=(x, y)"> can attack PacMan as long as PacMan is located at <img src="https://render.githubusercontent.com/render/math?math=(x \pm 1, y \pm 1)">. If PacMan is in the attack range, this function returns true otherwise it returns false.

- **Examples**:

  ```java
  //ghost at location (9,11)
  //pacman at location (9,12)
  ghost.is_pacman_in_range() -> true
  ```

### attack()

- **Type**: `() -> Bool`

- **Description**: This function checks to see if PacMan is in the attack range by using the `is_pacman_in_range` method and attacks PacMan if it is in range by calling the `attack` function from the Map Class. This function returns true if the attack was successful and false otherwise.

- **Examples**:

  ```java
  //ghost at location (9,11)
  //pacman at location (9,12)
  ghost.attack() -> true
  ```

## <img src=cherries.png width="50" height="50"> Map Class

The Map Class uses Java GUI to create the visual represenation of our game. For this project, we have given you most the code for the GUI with the exception of 4 methods which you will have to write. The goal of this section is to develop the interaction between pacman and walls and cookies as well as attacking ghosts.

### move(String name, Location loc, Type type)

- **Type**: `(String name, Location loc, Type type) -> Bool`
- **Description**: The method takes a name, location, and type and put the object specified by the name at the location. If the function is able to successfull move the object it returns true, otherwise it returns false. If the move is successful, the `field`, `locations`, and JComponent of the object should all be updated (don't forget to update the old location in `field`!). 
- **Examples**:
  ```java
  //pacman at location (2,4)
  //location (2,5) is empty
  map.move("pacman", new Location (2,5), Map.Type.PACMAN) -> true
  ```

### getLoc(Location loc)

- **Type**: `(Location loc) -> HashSet<Type>`
- **Description**: For the given location argument `loc`, returns the set of types currently at the location (Empty, Pacman, Cookie, Ghost, Wall).

```java
 //pacman and cookie at location (2,4)
 map.getLoc(new Location (2,4) -> {Map.Type.PACMAN, Map.Type.COOKIE}
```

### attack(String name)

- **Type**: `(String name) -> Bool`
- **Description**: The method is called by a ghost's `attack` function. If the ghost was able to successfully attack pacman and return true, otherwise return false. Make sure to update `gameover` if the attack was successful. 

```java
 //ghost named clyde at location (9,11)
 //pacman at location (9,12)
 Map.attack("clyde") -> true
```

### eatCookie(String Name)

- **Type**: `(String name) -> JComponent`
- **Description**: The method updates the map when Pacman eating a cookie. If PacMan is able to successfully eat the cookie, the cookie should be removed from the dispaly. The `cookie` counter variable should be incremented, and return the Cookie component that has been eaten. If PacMan cannot eat the cookie return null and do not update anything.

```java
 //cookie NOT at location (4,6)
 //pacman at location (4,6)
 Map.eatCookie("pacman") -> null
```

## <img src=location.png width="50" height="50"> Location Class

### Location(int x, int y)

- **Type**: `(int x, int y) -> Location`
- **Description**: Creates a new location object at the provided x, y coordinates.
- **Examples**:
  ```java
  Location loc = new Location(1, 2) // creates a new location object that represents (1,2)
  ```

### shift(int x, int y)

- **Type**: `(int x, int y) -> Location`
- **Description**: Returns a new location that has been shifted in the given direction.
- **Examples**:
  ```java
  Location loc = new Location(1, 2)
  loc.shift(1, -1) -> Location(2, 1) // new location with x = 1 + 1 = 2, y = 2 + -1 = 1
  ```
### unshift(Location other)

- **Type**: `(Location other) -> Location`
- **Description**: Returns a vector that is the difference between two locations.
- **Examples**:
  ```java
  Location loc1 = new Location(1, 2)
  Location loc2 = new Location(8, 5)
  
  loc1.unshift(loc2) -> Location(7, 3)
  ```
  
### equals(Location other)

- **Type**: `(Location other) -> boolean`
- **Description**: Whether two locations are equal to each other.
- **Examples**:
  ```java
  Location loc1 = new Location(1, 2)
  Location loc2 = new Location(1, 2)
  
  loc1.equals(loc2) -> true
  ```

## Academic Integrity

Please **carefully read** the academic honesty section of the course syllabus. **Any evidence** of impermissible cooperation on projects, use of disallowed materials or resources, or unauthorized use of computer accounts, **will be** submitted to the Student Honor Council, which could result in an XF for the course, or suspension or expulsion from the University. Be sure you understand what you are and what you are not permitted to do in regards to academic integrity when it comes to project assignments. These policies apply to all students, and the Student Honor Council does not consider lack of knowledge of the policies to be a defense for violating them. Full information is found in the course syllabus, which you should review before starting.
