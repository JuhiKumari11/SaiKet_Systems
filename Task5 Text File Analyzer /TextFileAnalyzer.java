package TextFile.com;
import java.io.*;
import java.util.*;

public class TextFileAnalyzer {
	    public static void analyzeFile(String fileName) {
	        int lineCount = 0;
	        int wordCount = 0;
	        int charCount = 0;

	        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                lineCount++;
	                charCount += line.length();
	                wordCount += countWordsInLine(line);
	            }

	            System.out.println("File Analysis:");
	            System.out.println("Lines: " + lineCount);
	            System.out.println("Words: " + wordCount);
	            System.out.println("Characters: " + charCount);
	        } catch (IOException e) {
	            System.out.println("An error occurred while reading the file.");
	            e.printStackTrace();
	        }
	    }
	    private static int countWordsInLine(String line) {
	        String[] words = line.trim().split("\\s+");
	        return words.length;
	    }
	    public static void searchWordInFile(String fileName, String searchWord) {
	        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
	            String line;
	            int lineNumber = 0;
	            boolean found = false;
	            while ((line = br.readLine()) != null) {
	                lineNumber++;
	                if (line.toLowerCase().contains(searchWord)) {
	                    System.out.println("Found \"" + searchWord + "\" in line " + lineNumber + ": " + line);
	                    found = true;
	                }
	            }

	            if (!found) {
	                System.out.println("The word \"" + searchWord + "\" was not found in the file.");
	            }
	        } catch (IOException e) {
	            System.out.println("An error occurred while reading the file.");
	            e.printStackTrace();
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the name of the file to analyze: ");
	        String fileName = "{{file-path}}\sample_text_file.txt";
	        analyzeFile(fileName);
	        System.out.print("\nEnter a word to search for in the file: ");
	        String searchWord = scanner.nextLine();
	        searchWordInFile(fileName, searchWord);

	        scanner.close();
	    }
	}
