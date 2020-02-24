package com.generics;

import java.util.ArrayList;

import com.warmup.Training;

public class CompilerGimmick {

	public static void main(String[] args) {
		ArrayList<String> coll1 = new ArrayList<String>();
		ArrayList<Long> coll2 = new ArrayList<Long>();
		ArrayList<Boolean> coll3 = new ArrayList<Boolean>();
		ArrayList<Training> coll4 = new ArrayList<Training>();
		
		System.out.println(coll1.getClass().getName());
		System.out.println(coll2.getClass().getName());
		System.out.println(coll3.getClass().getName());
		System.out.println(coll4.getClass().getName());
	}

}
