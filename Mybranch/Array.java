class  Array
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int data[] =new int[] {1,1,12,1,2,3,12,12,15,16};
		printArray(data);
	}
	public static void printArray(int temp[]){
		for	(int i=0;i<temp.length;i++){
			System.out.println(temp[i]);
		}
	}
}
