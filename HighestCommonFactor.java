
public class HighestCommonFactor {

	

  public static void main(String[] args) {

	  
	  int[] arr = {16, 8, 24};

	  
	  if(arr.length == 1){// array with one integer
		  System.out.println("HCF = "+arr[0]);
	  }
	  else if(arr.length == 2) {// array with two integers
		  System.out.println("HCF = "+highestCommonfactor(arr[0], arr[1]));
	  }
	  else {// array with more than 2 integers 
		  int HCF = arr[0];
		  for(int i = 1; i<arr.length; i++) {
			  HCF = highestCommonfactor(HCF,arr[i]);
		  }
		  
		  System.out.println("HCF = "+HCF); 
	  }
	  
  }
  
  //This function takes  two integers and finds highest common divisor
  public static int highestCommonfactor(int num1, int num2) {
	  
	  int returnVal = 1; 
	  
	  for(int i=1; i <= num1 && i <= num2; i++) {
		  
		  if(num1%i == 0 && num2%i == 0 ) {
			  returnVal = i;
		  }
	  }
	  return returnVal; 
  }
  
  
  
}