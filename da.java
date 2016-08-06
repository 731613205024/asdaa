/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sada;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class da {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        for(int j=1;j<=10;j++)
        {
            System.out.println("Table of "+a+"*"+j+"="+a*j);
        }

    }
}
