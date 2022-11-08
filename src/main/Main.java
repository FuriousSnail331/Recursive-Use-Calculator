package main;
import java.util.Scanner;

public class Main {
	public static double equate(String line) {
		if(line.contains("+")) {
			String[] array = line.split("\\+",2);
			return Double.valueOf(equate(array[0]))+Double.valueOf(equate(array[1]));
		}else if(line.contains("/")) {
			String[] array = line.split("/",2);
			return Double.valueOf(equate(array[0]))/Double.valueOf(equate(array[1]));
		}else if(line.contains("*")) {
			String[] array = line.split("\\*",2);// this"\\" is there because it will throw exeption its not a normal stirng
			return Double.valueOf(equate(array[0]))*Double.valueOf(equate(array[1]));
		}else if(line.contains("-")) {
			String[] array = line.split("-",2);
			return Double.valueOf(equate(array[0]))-Double.valueOf(equate(array[1]));
		}else {
			return Double.valueOf(line);
		}

	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			System.out.println("Answer: "+equate(line));
		}
		scan.close();
	}
}
