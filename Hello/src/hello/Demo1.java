package hello;

public class Demo1 {

	public static void main(String[] args) {
		int[] arr= new int[10];
		for (int i = 0; i <10; i++) {
			arr[i] = i;
			
		}for (int i = 0; i < arr.length; i++) {
			if (i==arr.length-1) {
				arr[arr.length-1] = 0;
			}else{
				arr[i] = arr[i+1];
			}System.out.print(arr[i]);
		}
	}

}
