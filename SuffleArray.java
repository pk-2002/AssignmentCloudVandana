import java.util.ArrayList;
import java.util.Collections;

public class SuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(5);
			list.add(6);
			list.add(7);
			
			//Shuffle the ArrayList
			
			Collections.shuffle(list);
			
			//Convert the shuffled ArrayList back to an array
			
			Integer[] shuffledArray = list.toArray(new Integer[0]);
			
			//print Shuffle Array
			for(int value: shuffledArray)
			{
				System.out.println(value+" ");
			}
			

	}

}
