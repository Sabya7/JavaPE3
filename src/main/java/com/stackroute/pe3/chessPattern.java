package com.stackroute.pe3;

public class chessPattern {
    String[][] matrix1;
    int rows,columns;

    public void matrixInitialisation(int rows)
    {
        this.rows=rows;
        this.columns=rows;
        matrix1=new String[rows][columns];

    }
    public String setMatrices()
    {    int k=0; String s="";
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                matrix1[i][j]=(k++%2==0)?"BB":"WW";
                s= s.concat(matrix1[i][j]).concat(" ");
            }
            s=s.concat("\n");
        }return s;
    }
}
