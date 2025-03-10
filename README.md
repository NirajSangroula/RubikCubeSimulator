# RubikCubeSimulator

This program is an Object Oriented Representation of 3 x 3 Rubik's cube. It has classes, RubikCube, RubikCubeRow, and RubikCubeCell that interacts with each other
in an interesting fashion as they are turned in different directions. For this program, I have implemented the most basic <b>Exhaustive Search</b> method to simulate a simple program. You may implement any
other algorithms in this basic Rubik's Cube framework.

![image](https://github.com/user-attachments/assets/50de106f-b932-4512-ad46-2dbfaec17280)

# Rubik Cube
It is an entity, a whole, that consists of:
1. Rows
  For Examples -> The Face 1 -> That we see as we solve rubik's cube
  We also have, Face 2 and Face 3
  
  If we consider 3 faces, rubik's cube is complete
  
  But we can also represent it by Sides 1 to 3, or Top 1 to 3.
  
  Row => It means the flat face/side with 9 (Unit Cells) inside it (Colors)

2. Cells
Each row consists of 3 cells, which each have (3 **Colors** that we can see)

Top, mid and bottom cells  
(_____)
(_____)
(_____)

Each of above is cell.

3. Unit cell
|| || ||
One of above are unit cell -> Which are different, depending on type of cell they are of

So, 3 types of Unit Cell exists -> Each with 3 color, 2 color or 1 color (Middle unchangeable color)


                        
