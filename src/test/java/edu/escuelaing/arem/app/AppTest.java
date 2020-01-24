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
    @Test
    public void calcMeanTest(){
    	LinkedList<Float> l = new LinkedList<Float>();
    	try {
			App.readFile( l, "./src/resources/ProxySize.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    	assertEquals("should calculate mean", 550.6,App.calcMean(l),0.1);
    	
    	l = new LinkedList<Float>();
    	try {
			App.readFile( l, "./src/resources/DevelopmentHours.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	assertEquals("should calculate mean", 60.32,App.calcMean(l),0.1);
    }
}
