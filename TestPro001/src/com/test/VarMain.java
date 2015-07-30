package com.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class VarMain {

	public static void main(String[] args) {


		clc();



	}


	public static void clc() {
		int val = 0;
		Util ut = new Util();

		val = ut.Calculat(1, 2);

		try{
   		 // 書き込むファイルの名前
   	    String outputFileName = "f:/tmp/test.txt";

   	    // ファイルオブジェクトの生成
   	    File outputFile = new File(outputFileName);
   		// 出力ストリームの生成
   	    FileOutputStream fos = new FileOutputStream(outputFile);
   	    OutputStreamWriter osw = new OutputStreamWriter(fos);
   	    PrintWriter pw = new PrintWriter(osw);

   	    // ファイルへの書き込み
   	    pw.println("Javaサンプルプログラム");
   	    pw.println("ファイル入出力");

   	    // 後始末
   	    pw.close();


   	    }catch(IOException e){
   	    //System.out.println(e);
   	    }

	}

	public static void clc2() {
		int val = 0;
		Util ut = new Util();

		val = ut.Calculat(2, 3);

		//System.out.println("val = " + val);

	}


	public static void clc3() {
		int val = 0;
		Util ut = new Util();

		val = ut.Calculat(4, 5);

		//System.out.println("val = " + val);

	}

}
