class ArraySize
{
	public static void main(String args[])
	{
		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=25;
		arr[2]=35;
		arr[3]=40;
		arr[4]=45;
		//arr[5]=40;
		
		for(int index=0;index<arr.length;index++)
		{
			System.out.println(arr[index]);
		}
		System.out.println();
		int array[]=new int [10];
		array[0]=arr[0];
		array[1]=arr[1];
		array[2]=arr[2];
		array[3]=arr[3];
		array[4]=arr[4];
		//array[5]=arr[5];
		
		for(int index=0;index<array.length;index++)
		{
			System.out.println(array[array[index]]);
		}
	}
}