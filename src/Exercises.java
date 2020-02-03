import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Exercises {

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
			return false;
		}
		return a.get(0) == b.get(0) || a.get(a.size() - 1) == b.get(b.size() - 1);
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
		ArrayList<String> middle = new ArrayList<String>();
		if (values == null || values.size() < 3 || values.size() % 2 == 0) {
			return middle;
		}
		for (String word : values) {
			if (word.isEmpty()) {
				return middle;
			}
		}
		 middle = new ArrayList<String>(Arrays.asList(values.get(values.size() / 2 - 1), values.get(values.size() / 2), values.get(values.size() / 2 + 1)));
		return middle;
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 3) {
			return false;
		}
		for (int i = 0; i < numbers.size() - 2; i++) {
			if (numbers.get(i) < numbers.get(i + 1) && numbers.get(i + 1) < numbers.get(i + 2)) {
				return true;
			}
		}
		return false;
	}

	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		if (numbers == null || numbers.size() < 1) {
			return false;
		}
		for (int i = 1; i < numbers.size() - 1; i++) {
		    if (numbers.get(i - 1) != x && numbers.get(i + 1) != x && numbers.get(i) != x) {
		        return false;
		    }
		}
		return true;
	}

	public boolean consecutive(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 1) {
			return false;
		}
		for (int i = 0; i < numbers.size() - 2; i++) {
			int sum = numbers.get(i) % 2 + numbers.get(i + 1) % 2 + numbers.get(i + 2) % 2;
			if (sum == 0 || sum == 3) {
				return true;
			}
		}
		return false;
	}

	public boolean balance(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 2) {
			return false;
		}
		for (int i = 0; i < numbers.size(); i++) {
			int left = 0;
			int right = 0;

			for (int u = 0; u < i; u++) {
				left += numbers.get(u);
			}
			for (int u = i; u < numbers.size(); u++) {
				right += numbers.get(u);
			}
			if (left == right) {
				return true;
			}
		}
		return false;
	}

	public int clumps(ArrayList<String> values) {
		int clumps = 0;
		if (values == null) {
			return -1;
		}
		for (String word : values) {
			if (word.isEmpty()) {
				return -1;
			}
		}
		for (int i = 0; i < values.size() - 1; i++) {
			if (values.get(i).equals(values.get(i + 1)) && i == 0) {
				clumps++;

			} else if (values.get(i).equals(values.get(i + 1)) && !(values.get(i).equals(values.get(i - 1)))) {
						clumps++;
			}
		}
		return clumps;
	}
}
