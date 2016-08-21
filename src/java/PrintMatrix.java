public class PrintMatrix{
	public void printMatrix(int[][] matrix){
		if(matrix.length<1)
			return;
		int rows=matrix.length;
		int columns=matrix[0].length;

		int start=0;
		while(start*2<rows && start*2<columns){
			printNum(matrix,rows,columns,start);
			start++;
		}
	}

	public void printNum(int[][] matrix,int rows,int columns,int start){
		int end=columns-start;

		for(int i=start;i<end;i++)
			System.out.println(matrix[start][i]);

		if(rows>start*2+1){
			for(int i=start+1;i<rows-start;i++)
				System.out.println(matrix[i][end-1]);
		}

		if(end>start){
			for(int i=end-2;i>=start;i--)
					System.out.println(matrix[rows-start-1][i]);
		}

		if(rows>(start+1)*2){
			for(int i=rows-start-2,i>start;i--)
					System.out.println(matrix[i][start]);
		}
	}
}