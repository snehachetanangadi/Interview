package questions;

import java.util.HashMap;

public class WordPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "abcb";
		String word = "dog cat dog cat";
		WordPattern lt = new WordPattern();
		System.out.println("Hi " + lt.wordPattern(pattern, word));
	}

	private boolean wordPattern(String pattern, String word) {
		// TODO Auto-generated method stub
		HashMap<Character, String> patternWordMap = new HashMap<Character, String>();
		String [] wordArray = word.split(" ");
		char [] patternCharArray = pattern.toCharArray();
		for(int i = 0; i < patternCharArray.length; i++) {
			if(patternWordMap.containsKey(patternCharArray[i])) {
				if(!patternWordMap.get(patternCharArray[i]).equals(wordArray[i])) {
					return false;
				}
			} else {
				if(patternWordMap.containsValue(wordArray[i])) {
					return false;
				} else 
					patternWordMap.put(patternCharArray[i], wordArray[i]);
			}
		}
		return true;
	}
}
