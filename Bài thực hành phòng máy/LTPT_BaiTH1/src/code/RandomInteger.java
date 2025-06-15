package code;

import java.util.ArrayList;

public class RandomInteger {
	public static ArrayList<Integer> randomArray;
	
	public static ArrayList<Integer> getRandom(int N) {
		randomArray = new ArrayList();
		for (int i=0; i< N; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            int randomInt = (int) randomDouble;
            randomArray.add(randomInt);
        }
		return randomArray;
	}

}
