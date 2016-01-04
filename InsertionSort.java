import java.util.Scanner;

//This is the code for insertion sort
//Insertion sort is an in-place algorithm
 class InsertionSort {

	public static void main(String[] args) {
		int i,j,key,n;
		//Enter the number of elements in the array
		Scanner input= new Scanner(System.in);
		n=input.nextInt();
		int[] A= new int[n];
		//Scanning the input--- enter the array elements
		for(i=0;i<n;i++)
			A[i]= input.nextInt();
		//Loop from 2nd element to the last
		for(j=1;j<n;j++)
		{
			//Copying the j-th element at some intermediate location named key
			key= A[j];
			i=j-1;
			//Shifting the elements are bigger than the key
			while(i>=0 && key<A[i])
			{
				A[i+1]=A[i];
				i--;
			}
			//putting the key at the correct place
			A[i+1]=key;
		}
		//printing the output
		for(i=0;i<n;i++)
		System.out.print(A[i]+ " ");
		
	}

}
