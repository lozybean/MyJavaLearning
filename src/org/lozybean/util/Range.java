//: org/lozybean/util/Range.java
// Array creation methods that can be used without
// qualifiers, using Jave SE5 static imports: 
// package org.lozybean.util

package org.lozybean.util;

public class Range{
	int [] values;
	// Produce a sequence [0..n)
	public Range(int n){
		int[] result = new int[n];
		for(int i=0;i<n;i++){
			result[i] = i;
		}
		values = result;
	}
	// Produce a sequence [start..end)
	public Range(int start, int end){
		int sz = end - start;
		int[] result = new int[sz];
		for(int i=0;i<sz;i++){
			result[i] = start + i;
		}
		values = result;
	}
	//Produce a sequence [start..end) incrementing by step
	public Range(int start, int end, int step){
		int sz = (end - start) / step;
		int[] result = new int[sz];
		for(int i=0;i<sz;i++){
			result[i] = start + (i * step);
		}
		values = result;
	}
	public String toString(String sep){
		String result = "";
		for (int i:this.values){
			result += i;
			result += sep;
		}
		result.substring(0, result.length()-sep.length());
		return result;
	}
	public String toString(){
		String sep = " ";
		String result = "";
		for (int i:this.values){
			result += i;
			result += sep;
		}
		result.substring(0, result.length()-1);
		return result;
	}
}
