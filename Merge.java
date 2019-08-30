import java.util.Scanner;
//
class Merge{
	public static int size;
	
	public static void mergeSort(int arr[],int f,int l){
		int m;
		if(f<l){
			m = (f+l)/2;
			mergeSort(arr,f,m);
			mergeSort(arr,m+1,l);
			merge(arr,f,m,l);
		}
	}
	
	public static void merge(int arr[],int f,int m,int l){
		int b[] = new int[size];
		int i=f;
		int j=m+1;
		int k=0;
		while((i <= m)&&(j <= l)){
			if(arr[i] < arr[j]){
				b[k++] = arr[i++];
			}
			else{
				b[k++] = arr[j++];
			}
		}
		while(i<=m){
			b[k++] = arr[i++];
		}
		while(j<=l){
			b[k++] = arr[j++];
		}
		for(i=l;i>=f;i--){
			arr[i] = b[--k];
		}	
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
		mergeSort(arr,0,(size-1));
		for(int j=0;j<size;j++){
			System.out.print(" "+arr[j]);
		}
	}
}
