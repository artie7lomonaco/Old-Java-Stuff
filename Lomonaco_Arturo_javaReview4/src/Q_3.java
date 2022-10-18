
import java.util.Scanner;
import java.util.ArrayList;
public class Q_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Doing more with arrays
		 * November 1st, 2012
		 * YOUR NAME 
		 * This CountLetters class handles user inputed word and will apply certain operation to the String such as find vowels and determine frequency 
		 */
				
				Scanner input=new Scanner(System.in);
				
				String word;
				char [] wordLetters;  // arrays are non dynamic 
				char [] wordVowels = new char[6]; 
				String vowels = "AEIOUY";
				
				/* Prompt user for word */
				System.out.print("Enter a word: ");
				word=input.nextLine();
				
				/* Reminder and how to use String.contains(String) with a character */
				System.out.println(word.contains('p'+""));

				/* Convert word to char array */
				word = word.toUpperCase();
				wordLetters=word.toCharArray();
				/* cheap String method to create an array given a delimiter */
				String [] wordSplit = word.split("");
				// iterator
				for(String v : wordSplit)
				{
				    System.out.println(v);
				}
					//1. Display the number of characters found in the word using wordLetters.
					System.out.println("The number of charecters: " + wordLetters.length);
					//2. Store the vowels in wordVowels found in the word using wordLetters.
					int g = 0;
					for(int i = 0; i < wordLetters.length; i++) {
						if(wordLetters[i] == 'A' || wordLetters[i] == 'E'|| wordLetters[i] == 'I' || wordLetters[i] == 'O' || wordLetters[i] == 'U' || wordLetters[i] == 'Y') {
							wordVowels[g] = wordLetters[i];
							g++;
						}
					}
					System.out.print("The vowels are: ");
					for(int e = 0; e < wordVowels.length; e++) {
						System.out.print(" " + wordVowels[e]);
					}
					System.out.println("");
					//3. Display the number of letters only in the word using wordLetters.
					// Care must be taken to ignore other non alphanumeric characters. (hint: you will need to use ASCII values)
					int c = 0;
					for(int i =  0; i < wordLetters.length; i++) {
						if (((int)wordLetters[i] >= 97 && (int)wordLetters[i] <= 122) || ((int)wordLetters[i] >= 65 && (int)wordLetters[i] <= 90)) {
							c++;
						}
						
					}
					System.out.println("The number of alphnumeric Chars: " + c);
					//4. *challenging* Display the frequency of characters in wordLetters.
					// frequency: the number of times a character appears in the word
					ArrayList<Character> chars = new ArrayList<Character>();
					ArrayList<Integer> freq = new ArrayList<Integer>();
					boolean add = true;
					for(int j = 0; j < wordLetters.length; j++) {
						for(int k = 0; k < chars.size(); k++) {
							if(wordLetters[j] == chars.get(k)) {
								add = false;
								freq.set(k, freq.get(k)+1);
							}
						}
						if (add == true) {
							freq.add(1);
							chars.add(wordLetters[j]);
						}
						else {
							add = false;
						}
					}
					for(int l = 0; l < chars.size(); l++) {
						if (freq.get(l) >1) {
							System.out.println(chars.get(l) + " apears " + freq.get(l) + " times");
						}
						else {
							System.out.println(chars.get(l) + " apears " + freq.get(l) + " time");
						}
					}
				
			}

	}