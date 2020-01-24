package edu.escuelaing.arem.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
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
    	Scanner scanner = new Scanner(System.in);
    	int option;
    	do {
    		System.out.println("This program calculates the mean and standard deviation of set of values");
    		System.out.println("Options:");
    		System.out.println("1. insert values");
    		System.out.println("2. delete a value");
    		System.out.println("3. view the current set of values");
    		System.out.println("4. calculate mean");
    		System.out.println("5. calculate standard deviation");
    		System.out.println("6. exit.");
    		LinkedList<Float> l = new LinkedList<Float>();
    		option=scanner.nextInt();
    		switch(option) {
    		case 1:
    			System.out.println("Please type the route of the file to read from");
    			String filePath = scanner.next();
    			readFile(l,filePath);
    			break;
    		case 2:
    			System.out.println("Please enter the number you wish to remove from the list");
    			float numToRemove = scanner.nextFloat();
    			l.remove(numToRemove);
    			break;
    		case 3:
    			break;
    		}
    	}while(option!=3);
    	scanner.close();
    	
    }
    
    /**
     * Reads a file of reals and stores it in a list 
     * @param l - the list to store the decimals in
     * @param path - the path of the file
     * @throws FileNotFoundException if the file is not found
     */
    public static void readFile(List<Float> l,String path) throws FileNotFoundException {
    	File f = new File(path);
    	Scanner scanner = new Scanner(f);
    	while(scanner.hasNext()) {
        	Float myInt = scanner.nextFloat();
        	l.add(myInt);
    	}
    	scanner.close();
    }
    
    /**
     * given a list of reals, this method calculates the sum of its elements
     * @param l - the list of reals
     * @return the sum of the elements in the list
     */
    private static float sum(List<Float> l) {
    	float sum=0;
    	for(Float d:l)
    		sum+=d;
    	return sum;
    }
    
    /**
     * given a list of reals, this method calculates the mean
     * @param l - the list of reals
     * @return the sum of the elements in the list
     */
    public static float calcMean(List<Float> l) {
    	return sum(l)/l.size();
    }
    
    /**
     * given a list of reals, this method calculates the standard deviation 
     * @param l - the list of reals
     * @return the sum of the elements in the list
     */
    public static float calcStdev(List<Float> l) {
    	float mean=calcMean(l);
    	float sum=0;
    	for(Float d:l) {
    		float term=(float) (d-mean);
    		sum+=term*term;
    	}
    	return (float)Math.sqrt(sum/(l.size()-1));
    	
    }
}
