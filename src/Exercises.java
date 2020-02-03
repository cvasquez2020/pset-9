import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Exercises {

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
			return false;
		}
		return a.get(0) == b.get(0) || a.get(a.size() - 1) == b.get(b.size() - 1);	// default return value to ensure compilation
	}

	public ArrayList<String> endsMeet(ArrayList<String> values, int n) {
		ArrayList<String> endsMet = new ArrayList<String>();
		if (values == null || values.size() < n || n != (int) n || n <= 0) {
			return endsMet;
		}
		endsMet.addAll(values.subList(0, n));
		endsMet.addAll(values.subList(values.size() - n, values.size()));
		return endsMet;
	}

	public int difference(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 1) {
			return -1;
		}
		int min = numbers.get(0);

	    for (int number : numbers) {
	        if (number < min) {
	            min = number;
	        }
	    }
		int max = numbers.get(0);

		for (int number : numbers) {
		    if (number > max) {
		        max = number;
		    }
		}
		return max - min;
	}

	public double biggest(ArrayList<Double> numbers) {
		double max = 0;
		if (numbers == null || numbers.size() < 3 || numbers.size() % 2 == 0) {
			return -1.0;
		}
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) == 0.0 || numbers.get(i) < 0) {
				return -1.0;
			}
		}

		ArrayList<Double> biggest = new ArrayList<Double>(Arrays.asList(numbers.get(0), numbers.get(numbers.size() / 2), numbers.get(numbers.size() - 1)));

		for (double number : biggest) {
		    if (number > max) {
		        max = number;
		    }
		}

		return max;
	}

	public ArrayList<String> middle(ArrayList<String> values) {
		// write your code here

		return null;	// default return value to ensure compilation
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean consecutive(ArrayList<Integer> numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean balance(ArrayList<Integer> numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public int clumps(ArrayList<String> values) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}
}
