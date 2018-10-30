package palindromnumber;

public class palindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(11 == palindromNumber.checkPalindrom(11, 0)) {
			System.out.print("IS A PAL");
		} else {
			System.out.print("NOT A PAL");
		}

	}
	
	public static int checkPalindrom(int num, int rev){
		if(num/10==0) return (rev*10 + num%10);
		rev = rev*10 + num%10;
		return checkPalindrom(num/10, rev);
		//rev = rev*10 + num%10;
	}

}
