public class prime{
  static boolean isPrime(int n){
    if (n<=1){
	    return false;
	}
	for(int i=2;i<n;i++){
	   if(n%i==0){
	       return false;
	   }
	   
	}
	return true;
	
  }
  public static void main(String[] args){
     if( isPrime(11)){
	     System.out.println("True");
	 }
	 else{
	     System.out.println("false");
	 }
	 
	 
  }
  
}
