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
    		LinkedList<Double> l = new LinkedList<Double>();
    		option=scanner.nextInt();
    		switch(option) {
    		case 1:
    			System.out.println("por favor ingrese la ruta del archivo a cargar");
    			String filePath = scanner.next();
    			readFile((List<Double>) l,filePath);
    			break;
    		case 2:
    			break;
    		case 3:
    			break;
    		}
    	}while(option!=3);
    	scanner.close();
    	
    }
    
    private static void readFile(List<Double> l,String path) throws FileNotFoundException {
    	File f = new File(path);
    	Scanner scanner = new Scanner(f);
    	while(scanner.hasNext()) {
        	Double myInt = scanner.nextDouble();
        	l.add(myInt);
    	}
    	scanner.close();
    }
    
    private static float sum(LinkedList<Double> l) {
    	float sum=0;
    	for(Double d:l)
    		sum+=d;
    	return sum;
    }
    
    public static float calcMean(LinkedList<Double> l) {
    	return sum(l)/l.getSize();
    }
    
    public static float calcStdev(LinkedList<Double> l) {
    	float mean=calcMean(l);
    	float sum=0;
    	for(Double d:l) {
    		float term=(float) (d-mean);
    		sum+=term*term;
    	}
    	return (float)Math.sqrt(sum/(l.getSize()-1));
    	
    }
}
