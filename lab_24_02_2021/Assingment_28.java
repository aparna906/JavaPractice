/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_24_02_2021;

import java.util.Scanner;

/**
 *
 * @author gauri
 */
class matrix
{
	private double arr[][] ;
	int row, column;
	matrix()
	{
		row=0;
		column=0;
	}

	matrix(int r, int c)
	{
		row = r;
		column = c;
		arr = new double[row][column];
	}
	public void get_input()
	{
		Scanner s = new Scanner(System.in);
		int i=0,j=0;
		
		System.out.println("Enter the matrix elements(row-wise)");
		for (i=0; i < row; i++)
		{
			for(j=0; j<column; j++)
	        {
				arr[i][j] = s.nextDouble();
			}

		}
	}
	public void print_matrix()
	{
		int i = 0, j = 0;
		System.out.println("The matrix is:>>");
		for (i = 0; i < row; i++)
		{
			System.out.println("");
			for (j = 0; j < column; j++)
			{
				System.out.print("   "+arr[i][j]);
			}

		}
	}

	public matrix add(matrix m1)
	{
		matrix ans = new matrix(row,column);
		int i=0,j=0;
		if (this.row != m1.row || this.column != m1.column)
		{
			System.out.println("ERROR: The two matrices should have same no. of rows and columns for addition!");
		}
		else
		{
			for (i = 0; i < row; i++)
			{
				for (j = 0; j < column; j++)
				{
					ans.arr[i][j] = this.arr[i][j] + m1.arr[i][j];
				}
			}
		}
		return ans;
	}
        
	public matrix sub(matrix m1)
	{
		matrix ans = new matrix(row,column);
		int i=0,j=0;
		if (this.row != m1.row || this.column != m1.column)
		{
			System.out.println("The two matrices should have same no. of rows and columns for subtraction!");
		}
		else
		{
			for (i = 0; i < row; i++)
			{
				for (j = 0; j < column; j++)
				{
					ans.arr[i][j] = this.arr[i][j] - m1.arr[i][j];
				}
			}
		}
		return ans;
	}

        public matrix mul(matrix m1)
	{
		matrix ans = new matrix(row,column);
		int i=0,j=0;
		if (this.row != m1.row || this.column != m1.column)
		{
			System.out.println("The two matrices should have same no. of rows and columns for addition!");
		}
		else
		{
			for (i = 0; i < row; i++)
			{
				for (j = 0; j < column; j++)
				{
					ans.arr[i][j] = this.arr[i][j] * m1.arr[i][j];
				}
			}
		}
		return ans;
	}
}

class arr_op
{

	private static matrix m1,m2,ans;
	public static void main(String args[])
	{
		int i = 0, j = 0,r=0,c=0;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter no. of rows:");
		r = s.nextInt();
		System.out.println("Enter no. of columns:");
		c = s.nextInt();

		System.out.println("Enter the first matrix:>>");
		m1 = new matrix(r,c);
		m1.get_input();

		System.out.println("Enter the second matrix:>>");
		m2 = new matrix(r,c);
		m2.get_input();

		ans = m1.add(m2);
		System.out.println("\nAddition of the two matrices is:>>");
		ans.print_matrix();
                
		ans = m1.sub(m2);
		System.out.println("\nSubtraction of the two matrices is:>>");
		ans.print_matrix();
                
		ans = m1.mul(m2);
		System.out.println("\nSubtraction of the two matrices is:>>");
		ans.print_matrix();
	}
}

