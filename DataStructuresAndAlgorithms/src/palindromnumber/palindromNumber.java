package palindromnumber;

public class palindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int checkPalindrom(int num){
		int rev=0;
		if(num==0) return 1;
		return checkPalindrom(num/10) + num%10;
		//rev = rev*10 + num%10;
	}

}
