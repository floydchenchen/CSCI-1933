package generics;

import java.util.ArrayList;
import java.util.Collections;

public class PairApp {

	public static void main(String[] args){
		ArrayList<Pair<Integer,String>> list = new ArrayList<Pair<Integer,String>>();
		list.add(new Pair<Integer,String>(12,"twelve"));
		list.add(new Pair<Integer,String>(2,"two"));
		list.add(new Pair<Integer,String>(6,"six"));
		list.add(new Pair<Integer,String>(1,"one"));
		Collections.sort(list);
		System.out.println(list.toString());
		Pair<Pair<Integer,String>,String> test = new Pair<Pair<Integer,String>,String>(list.get(0),"test");
		System.out.println(test.toString());
	}
}
