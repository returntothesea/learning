// Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

// Input Format:
// A single string containing a time in 12-hour clock format.

// Output Format:
// Convert and print the given time in 24-hour format.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String time = in.next();
		in.close();


		// Test string so I don't have to type it
		// every time I run the program
		// String time = "06:23:42PM";
		String hour = time.substring(0, 2);
		String middle = time.substring(2, 8);
		String ampm = time.substring(8, 10);

		// Tests
		// System.out.println(time);
		// System.out.println(hour);
		// System.out.println(middle);
		// System.out.println(ampm);

		int hr = Integer.parseInt(hour);

		if (ampm.equals("PM")) {
			if (hr != 12)
				hr += 12;
		} else {
			if (hr == 12)
				hr = 0;
		}


		// If the length of the string value of hr is only one,
		// it needs a 0 in front of it.
		// There has to be a better way of doing this but I 
		// can't think of one right now and this passes the test cases :)
		if (String.valueOf(hr).length() == 1) {
			System.out.println("0" + hr + middle);
		} else {
			System.out.println(hr + middle);
		}


	}

}
