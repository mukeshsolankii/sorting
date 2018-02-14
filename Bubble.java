import java.util.Scanner;

class Bubble{
	public static void bubble(int arr[]){
		int temp = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<((arr.length-i)-1);j++){
				if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String...s){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the "+size+" elements of the array:");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		bubble(arr);
		for(int j=0;j<size;j++){
			System.out.print(" "+arr[j]);
		}
	}
}