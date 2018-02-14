import java.util.Scanner;

class Quick{
	public static int size;
	
	public static void quick(int arr[],int f,int l){
		if(f<l){
			int pi = partition(arr,f,l);
			quick(arr,f,pi-1);
			quick(arr,pi+1,l);
		}
	}
	
	public static int partition(int arr[],int f,int l){
	    int pivot = arr[l];
        int pi = f;
		int temp = 0;
        for(int i=f;i<l;i++){
			if(arr[i] <= pivot){
				temp = arr[i];
				arr[i] = arr[pi];
				arr[pi] = temp;
				pi++;
			}
		}
        temp = arr[pi];
        arr[pi]	= arr[l];
        arr[l] = temp;
        return pi;		
	}
	
	public static void main(String...s){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the "+size+" elements of the array:");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		quick(arr,0,(size-1));
		for(int j=0;j<size;j++){
			System.out.print(" "+arr[j]);
		}
	}
}