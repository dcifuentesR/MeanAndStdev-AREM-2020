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
    		System.out.println("Seleccione una opcion");
    		LinkedList<Integer> l = new LinkedList<Integer>();
    		option=scanner.nextInt();
    		switch(option) {
    		case 1:
    			System.out.println("por favor ingrese la ruta del archivo a cargar");
    			String filePath = scanner.next();
    			//readFile(l,filePath);
    			break;
    		case 2:
    			break;
    		case 3:
    			break;
    		}
    	}while(option!=3);
    	scanner.close();
    	
    }
    
    private void readFile(List<Integer> l,String path) throws FileNotFoundException {
    	File f = new File(path);
    	Scanner scanner = new Scanner(f);
    	while(scanner.hasNext()) {
        	int myInt = scanner.nextInt();
        	l.add(myInt);
    	}
    	scanner.close();
    }
    
    private static double getMean() {
    	return 0.0;
    }
    
    private static double getStdev() {
    	return 0.0;
    }
}
