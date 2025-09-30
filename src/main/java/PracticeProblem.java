public class PracticeProblem {

	public static void main(String args[]) {
		int[][] intArray2D1 = {
			{1,2,3,4,5},
			{2,4,6,8,10},
			{11,22,33,44,55}
		};

		int[][] intArray2D2 = {
			{101239,2,100,4,5},
			{8,10},
			{440203,552222, 129192}
		};

		int[][] intArray2D3 = {
			{9,2,0,4,5},
			{8,10, 4, 5, 1},
			{1,5, 2, 3, 4}
		};

		sum2D(intArray2D1);

		int sumRowResult = sumRow(intArray2D2, 0);
		System.out.println(sumRowResult);

		int sumColumnResult = sumColumn(intArray2D3, 1);
		System.out.println(sumColumnResult);
	}

	public static void sum2D(int[][] _array2D) {
		int sum = 0;
		for (int i = 0; i < _array2D.length; i++){
			for (int j = 0; j < _array2D[i].length; j++){
				int currentValue = _array2D[i][j];
				sum += currentValue;
			}
		}
		System.out.println(sum);
	}

	public static int sumRow(int[][] _array2D2, int rowIndex) {
		int sum = 0;
		for (int i = 0; i < _array2D2[rowIndex].length; i++){
			int currentValue = _array2D2[rowIndex][i];
			sum += currentValue;
		}
		return sum;
	}

	public static int sumColumn(int[][] _array2D3, int columnIndex) {
		int sum = 0;
		for (int i = 0; i < _array2D3.length; ++i){
			if (columnIndex < _array2D3[i].length) {
				int currentValue = _array2D3[i][columnIndex];
				sum+=currentValue;
			}
		}

		return sum;
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

}
