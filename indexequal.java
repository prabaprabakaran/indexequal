import java.util.Scanner;


public class indexequal {

	
	public static void main(String[] args) {
		Scanner se=new Scanner(System.in);
		System.out.println("enetr the number");
        int n=se.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
        	arr[i]=se.nextInt();
        }
        for(int i=0;i<n;i++){
        	if(arr[i]==i){
        		System.out.println("the number="+arr[i]+"is equals="+i);
        	}
        }
	}

}
