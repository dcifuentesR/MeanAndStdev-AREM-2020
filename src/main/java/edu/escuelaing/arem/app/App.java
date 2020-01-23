package edu.escuelaing.arem.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import edu.escuelaing.arem.app.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException
    {
    	File f = new File("src\\resources\\numbers");
    	LinkedList<Integer> l = new LinkedList<Integer>();
    	Scanner scanner = new Scanner(f);
    	while(scanner.hasNext()) {
        	int myInt = scanner.nextInt();
        	l.add(myInt);
    	}

    	for(int i:l)
    		System.out.print(i);
    	scanner.close();
    	
    }
}
