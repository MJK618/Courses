import java.util.Scanner;
public class Exercise1_3 {
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	  int sum=0;
    //Use for or while loop do the operation.
		for(int i = 0; i < n; i++){
          if((2 * i) % 3 == 0){
            sum = sum + 2*i;
          }
	}
System.out.print(sum);

 }
}
