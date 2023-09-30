package comSno5.harsha.textHandling;

public class HandleTextFileNotes {
	/*
	 * Agenda
	 * ******
	 * 
	 * 1.What is text file?
	 * Ans: text file--> Only plane text we can store can't be format like bold, italic, underScre
	 * 
	 * 		Alphabet's, Numeric, special character is called text
	 * 
	 * InputStreamFile
	 * ***************
	 * 1.FileInputStream
	 * 2.FileReader
	 * 3.Scanner
	 * 4.BufferedReader
	 * 
	 * Read     ->every iteration Only Single character get 
	 * ReadLine ->every iteration entire word get
	 * 
	 * Reader
	 * *******
	 * 
	 * Different ways of reading the data from text files
	 * 
	 * Use any one of these as per your requirement
	 * 
	 * character by character reading
	 * 1.FileInputStream
	 * 2.FileReader
	 * 
	 * Line by line Reading
	 * 3.Scanner
	 * 
	 * highPerformance because of internal mechanism
	 * 4.BufferedReader
	 * it's a combination of Scanner & FileInputStream or FileReader
	 * it means
	 * it can read in 2 ways
	 * --> character by character & Line by Line
	 * 
	 * Inside BufferReader they have Special method in-it (i.e, readline). it's gain internally character read one by one and keep aSide 
	 * 
	 * 
	 * OutputStreamFile
	 * ****************
	 * 1.FileOutputStream
	 * 2.FileWriter
	 * 3.BufferWriter
	 * 
	 * writer
	 * ******
	 * 
	 * Different ways of writing the data into text files
	 * 
	 * Use any one of these as per your requirement
	 * 
	 * 1.using character ASCII number
	 * or
	 * 2.Direct String passing to writer (or) existing text reference to writer 
	 *   (with logic using input character s variable )
	 *   EX: fw.write(s.toCharArray());
	 *   
	 *   Special Method for writer -> flush(); is a closer
	 * 
	 */
}
