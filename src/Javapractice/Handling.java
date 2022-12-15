package Javapractice;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			FileWriter F = new FileWriter("C:\\Users\\pc\\Desktop\\Filehandleee.txt");
			F.write("Hello my name is Shrikant");

			F.close();

			FileReader G = new FileReader("C:\\Users\\pc\\Desktop\\Filehandleee.txt");

			try {
				int i;
				while ((i = G.read()) != -1) {
					System.out.print((char) i);
				}

			} finally {

				G.close();
			}
			// System.out.println("We written data");

		} catch (Exception I) {
			System.out.println(I);
		}
	}

}
