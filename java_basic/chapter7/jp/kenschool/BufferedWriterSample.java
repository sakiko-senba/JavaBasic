package jp.kenschool;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterSample {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;

		FileReader fr = null;
		BufferedReader br = null;

		File file = new File("Ken2.txt");
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write("おはようございます");
			bw.newLine();
			bw.write("こんにちは");
			bw.newLine();
			bw.write("こんばんは");
			bw.flush();
			System.out.println("ken2.txtに書き出し完了");

			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
				if (bw != null) {
					bw.close();
				}
				if (fr != null) {
					fr.close();
				}
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}
}
