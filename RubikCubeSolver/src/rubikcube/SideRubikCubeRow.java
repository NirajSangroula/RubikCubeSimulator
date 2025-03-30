/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubikcube;

/**
 *
 * @author Niraj Sangroula
 */
public class SideRubikCubeRow extends RubikCubeRow implements Cloneable{
    public SideRubikCubeRow(SideRubikCubeCell s1, MidRubikCubeCell m1, SideRubikCubeCell s2){
        topCell = s1;
        midCell = m1;
        bottomCell = s2;
    }
    @Override
    public String toString() {
        String top = topCell.cell1.side2.getColor().charAt(0) + " "
                + topCell.cell2.side2.getColor().charAt(0) + " "
                + topCell.cell3.side2.getColor().charAt(0) + "\n";
        String mid = midCell.cell1.side2.getColor().charAt(0) + " "
                + midCell.cell2.side2.getColor().charAt(0) + " "
                + midCell.cell3.side2.getColor().charAt(0) + "\n";
        String bottom = bottomCell.cell1.side2.getColor().charAt(0) + " "
                + bottomCell.cell2.side2.getColor().charAt(0) + " "
                + bottomCell.cell3.side2.getColor().charAt(0) + "\n";

        return top + mid + bottom;
    }
}