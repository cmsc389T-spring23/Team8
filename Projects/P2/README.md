
# Project 1: PacMan

Due: 03/01/23, 11:59pm

Late: 03/08/23, 11:59pm

## Before You Start

1. Make sure you have completed Project 0 and set up your local environment.
2. Make sure you are working within your Team specific repository it will say `CMSC389T-Spring23/Team#` at the top left.

## Introduction

Each part has been created to be evenly distributed among your team. This means that we also will be grading most of your project score based on individual contribution. You will be responsible for:

1. Implementing functions and writing tests
2. Writing a README 

Throughout the process you will be using the features of git and github to do so.

### Submitting On Gradescope

![](https://placehold.co/1000x40/gold/red?text=Each+member+must+submit+individually)

Once you complete each feature, you will submit a pull request from your feature to the `main` branch.
*Make sure to assign any pull requests from FTR-item to FTR branches, cards, and issues to yourself.* We will use this to grade your individual contributions.

For your submission please have each team member submit to Gradescope with a submission.txt file: 

```
GitHub_Username
Team_Name
```

For example,

```
sagars729
Team0
```
_You may submit to gradescope as many times as you want prior to the deadline to recieve autograder feedback._

## Implementation

In this part of the project, you will develop code collaboratively with your team. There are 3 classes that you will be working on corresponding to 3 features:

1. `FTR-pacman` &rarr; for the [PacMan class](./documentation/README.md#pacman-class)
2. `FTR-ghost` &rarr; for the [Ghost class](./documentation/README.md#ghost-class)
3. `FTR-map` &rarr; for the [Map class](./documentation.md/README.md#map-class)

For each feature, a template java file has been provided that you will be filling out with your team.

**Before you Begin Coding** Each member must do the following:
1. Pick 1 function **from each class** you will be responsible for coding `(total 3 = 1 Pacman + 1 Ghost + 1 Map)`
2. Create a Kanban Board card **for each function** following the template on the project board `(total 3 = 1 Pacman + 1 Ghost + 1 Map)`
3. Decide who will be your reviewer **for each function** `(total 3 = 1 Pacman + 1 Ghost + 1 Map)`
4. Decide who's code you will review **for each class** `(total 3 = 1 Pacman + 1 Ghost + 1 Map)`

Once this part is completed you can begin working on the code for the functions you are responsible for. For the Pacman class you will do the following:

5. Checkout `FTR-Pacman`
6. Create your feature-item branch naming it pacman-function_name <br> <t> Ex: `pacman-move` </t> </br>
7. Modify the `Pacman.java` file to insert the code for your function
8. Add, commit, and push changes as you work on this
9. Modify the corresponding test file to create a test for your function  <br> <t> Ex: for `pacman-move` modify `TestPacManMove.java` See [Testing Notes](#testing-notes)  </t> </br>
10. Add, commit, and push changes as you work on this
11. Push all final changes to the remote repository
12. Create a Pull Request to merge pacman-function_name to `FTR-Pacman`  <br> <t> Ex: `pacman-move` to `FTR-Pacman` </t> </br>
13. Assign the pre-determined group member as a reviewer to the Pull Request
14. Assign yourself as the assginee for the review
15. Link the pull request to your Kanban Card

Repeat steps **5-15** for `FTR-Ghost` and `FTR-Map` to complete the Ghost and Map class.

Each team member **must** also review another team member's pull requests for each class and

- Read through the changes and leave comments or request changes if needed
- **Approve a pull request on GitHub Correctly** 
- Complete the pull request by merging changes


Once this part has been completed, you should be able to see a JFrame appear that allows you to play Automonous PacMan by compiling and running your files. If you don't have Gradle installed, follow the instructions [here](https://gradle.org/install/). We will be using Gradle to build, run, and test code in this class:

```bash
gradle build
gradle run
```

- **build** - compiles all source and test code
- **run** - runs the StartMenu

Make sure to run these commands from inside the project directory.

## Writing a README

For this section you will be creating your own project README with your group. Each member of the group is expected to contribute to the README for the functions they were responsible for. All work for the README must be done on GitHub and will only consider contributions made to the file.

Your README MUST have

- A Title
- All team members' names
- An image of your code playing PacMan
- A section on how to run the code from the command line
- Code block for command to compile and run the game
- A list of the functions you wrote with:
  - a description of the **implementation** for each function
  - a description of the test you wrote

The descriptions don't have to be long - a sentence or two would suffice.
Feel free to be creative and add any other elements. _Please see [README Notes](#readme-notes) for rules on what not to do._

### Testing Notes

When writing the tests, you may find some of the following commands useful:

```java
//Creating A Map
Mainframe frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

//Creating Players
Ghost ghost = frame.addGhost(new Location(x, y), "name", Color.red); //Creates a red ghost named "name" at location x,y
PacMan pacman = frame.addPacMan(new Location(x, y)); //Creates PacMan at location x, y
```
To compile and run all tests, run the following lines from the project directory in your command line:

```bash
gradle build
gradle test --parallel
```

To compile and run onlt 1 test run the following lines from the project directory in your command line:
```bash
gradle build
gradle test --parallel --tests YourTestClass
ex: gradle test --parallel --tests TestGhostAttack
```

### README Notes

The following items will receive **0 points** for README contributions:
- **USING GOOGLE DOCS TO CREATE THE README**. This is a class on git and GitHub; it wouldn't make sense for us to support making your README on an external platform.
- **USING ONLY 1 MEMBER's GITHUB ACCOUNT TO CREATE THE README**. You should learn how to collaborate and solve merge conflicts using git and GitHub.
- **COPYING FUNCTION DESCRIPTIONS FROM THE PROJECT INSTRUCTIONS**. Do not copy the descriptions we provided for functions into your README you should be instead describing how your code for the function works based on your implementation.

Please do not do the above items, you will lose points for them.

## Academic Integrity

Please **carefully read** the academic honesty section of the course syllabus. **Any evidence** of impermissible cooperation on projects, use of disallowed materials or resources, or unauthorized use of computer accounts, **will be** submitted to the Student Honor Council, which could result in an XF for the course, or suspension or expulsion from the University. Be sure you understand what you are and what you are not permitted to do in regards to academic integrity when it comes to project assignments. These policies apply to all students, and the Student Honor Council does not consider lack of knowledge of the policies to be a defense for violating them. Full information is found in the course syllabus, which you should review before starting.
