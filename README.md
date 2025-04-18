# RubikCubeSimulator

This program is an Object Oriented Representation of 3 x 3 Rubik's cube. It has classes, RubikCube, RubikCubeRow, and RubikCubeCell that interacts with each other
in an interesting fashion as they are turned in different directions. For this program, I have implemented the most basic <b>Exhaustive Search</b> method to simulate a simple program. You may implement any
other algorithms in this basic Rubik's Cube framework.

# Installation
Clone this project, and simply run Player.java file 

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

# See player demo
![image](https://github.com/user-attachments/assets/e1ca6db9-5fc2-4cec-8aab-72f189fd9562)
![image](https://github.com/user-attachments/assets/7677fac1-2e14-48c8-9376-60e4bda2ac69)
![image](https://github.com/user-attachments/assets/60f3f634-6dac-4224-8fb8-8ce01484dae5)

after input t c => Top Clockwise rotation

![image](https://github.com/user-attachments/assets/5841ef06-1b59-4b42-9b33-6ff8f6e8546b)
![image](https://github.com/user-attachments/assets/748e40fd-f4a7-4bbf-82e4-8af4bf15f117)

After f c and r c commands -> Face C and Right Clockwise

![image](https://github.com/user-attachments/assets/8e5cfd41-581e-4dc4-adfd-1c3dc7a07a93)
![image](https://github.com/user-attachments/assets/d51cc9b5-a6a6-4f70-a325-5d9281fcf338)



                        
