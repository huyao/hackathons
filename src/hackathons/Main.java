package hackathons;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class Main {



	static ArrayList<List> data = new ArrayList<List>(); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		data.add(Arrays.asList("Tom Cruise",136,6,4,10,10,4));
		data.add(Arrays.asList("Sponge Bob",110,5,4,12,12,5));
		data.add(Arrays.asList("James Earl Jones",175,8,3,2,8,3));
		data.add(Arrays.asList("Bob Barker",112,2,8,4,16,2));
		data.add(Arrays.asList("Tonya Harding",108,7,4,12,18,4));
		data.add(Arrays.asList("Charles Barkley",220,12,2,4,10,2));
		data.add(Arrays.asList("Peter Piper",116,4,6,14,14,6));
		data.add(Arrays.asList("Harry Potter",96,16,2,16,15,6));
		data.add(Arrays.asList("Shamu",280,24,1,1,1,1));
		data.add(Arrays.asList("Bill Gates",124,6,4,8,12,4));
		
		Championship c = new Championship(data);
		c.start();
		c.printInfo();
	
	}

}
