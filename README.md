# Team 8 Pacman Project cmsc389T-spring23


Aditya Krishnamoorthy, 





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