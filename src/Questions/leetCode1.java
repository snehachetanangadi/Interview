package questions;

public class leet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		leet lt = new leet();
		System.out.println("Hi " + lt.isHappy(205));
	}

	public boolean isHappy(int n) {
        char ar[] = String.valueOf(n).toCharArray();
        int eachNumber, newNumber = 0;
        for(int i = 0; i < ar.length; i++) {
            eachNumber = Character.getNumericValue(ar[i]);
            newNumber += eachNumber * eachNumber;
        }
        System.out.println(newNumber);
        
        if(newNumber == 1) return true; 
        else if(newNumber < 9) {
            return false;
        } else {
        	 return isHappy(newNumber);
        }
    }
}
