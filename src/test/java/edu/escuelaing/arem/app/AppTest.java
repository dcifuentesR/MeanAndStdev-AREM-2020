package edu.escuelaing.arem.app;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Test;
import edu.escuelaing.arem.app.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	private LinkedList<Float> proxySize;
	private LinkedList<Float> developmentHours;
	public void setup() {
		proxySize = new LinkedList<Float>();
		developmentHours = new LinkedList<Float>();
		
		try {
			App.readFile( proxySize, "./src/resources/ProxySize.txt");
			App.readFile( developmentHours, "./src/resources/DevelopmentHours.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
    @Test
    public void calcMeanTest(){
    	setup();
    	assertEquals("should calculate mean accurately with all integers", 550.6,App.calcMean(proxySize),0.1);
    	assertEquals("should calculate mean accurately with all floats", 60.32,App.calcMean(developmentHours),0.1);
    }
    
    @Test
    public void calcStdevTest() {
    	setup();
    	assertEquals("should calculate stdev accurately with all integers",572.03 ,App.calcStdev(proxySize) ,0.1);
    	assertEquals("should calculate stdev accurately with all floats",62.26 ,App.calcStdev(developmentHours) ,0.1);
    	
    }
}
