# Team 8 Pacman Project cmsc389T-spring23


Aditya Krishnamoorthy, Nicholas Perry, Rakrish Dhakal


![image](https://user-images.githubusercontent.com/70607267/222319965-4ec40f45-78c5-448b-a566-b03366a5d7f3.png)



## Running the project
<br />
To run the project, from the P2 directory, call
<br /> `gradle build' <br /> 'gradle run' <br />


### Map.getLoc() - Aditya Krishnamoorthy<br />
This method returns what is currently stored in the given Location. This could be any of the enumerated types.
This implementation relies on the fact that if a given Location loc is not empty, field contains the HashSet of what is in that location.
The implementation checks if the location is out of bounds, and returns a WallSet if so (walls are infinite). If field does not have the location as a key,
it is an empty location, so emptySet is returned. Otherwise, what is in field is returned.
The test checks the out of bounds conditional; it should return wallSet, as the walls are infinite.

### ghost.move() - Aditya Krishnamoorthy<br />
This moves the ghost in question to a valid location. If it is unable to do so, false is returned.
This implementation moves the ghost to the first element of the set of valid locations, returning false if the set is empty. It uses map move to move the ghost on the map, and updates the location var of the ghost. The test puts the ghost in a location on the map where it can move, and checks that ghost move returns true.

### pacman.move() - Aditya Krishnamoorthy<br />
Similar to map implementation - moves to first valid location in set of valid location. Returns false with same cases.
Test puts pacman in a location on map where it can move, and checks if map.move is true.


### Map.move() - Nicholas Perry<br />
The method takes a name, location, and type and put the object specified by the name at the location. If the function is able to successfull move the object it returns true, otherwise it returns false. If the move is successful, the `field`, `locations`, and JComponent of the object are all be updated. The test verifies that the function returns true on a possible move. 

### ghost.get_valid_moves() - Nicholas Perry<br />
 This function returns an arraylist of possible locations that a ghost can move to from its current location. A ghost cannot move through walls, but they can move through other ghosts or a PacMan. The test verifies the number of available moves around a specified location.

### pacman.get_valid_moves() - Nicholas Perry<br />
 This function returns an arraylist of possible locations that a pacman can move to from its current location. A pacman cannot move through walls, but they can move through ghosts or another PacMan. The test verifies the number of available moves around a specified location.
 
 

### Map.attack() - Rakrish Dhakal<br />
This method updates the `gameOver` variable, so that when a ghost attacks PacMan, the game is finished.

### ghost.is_pacman_in_range() - Rakrish Dhakal<br />
This function checks for a ghost if PacMan is within a 1-unit radius of the ghost.

### pacman.is_ghost_in_range() - Rakrish Dhakal<br />
This function checks for PacMan if there is a ghost within a 1-unit radius of PacMan.
