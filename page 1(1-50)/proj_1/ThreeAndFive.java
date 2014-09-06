/*
 * ThreeAndFive.java
 * 
 * Copyright 2014
 * 
 * Michael Funk
 * mafunk92@gamail.com
 * @mafunk92
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
 
 import java.util.*;
 import java.io.*;
 


public class ThreeAndFive {
	
	// Global Variables
	private ArrayList<Integer> array = new ArrayList<Integer>();
	private int length = 0;
	private int sum =0;
	
	
	// Constructors
	public ThreeAndFive(){
		array = null;
	} // End Constructor
	
	public ThreeAndFive(int max){
	//	System.out.println("In Constructor");
		
		for( int i = 0; i < max; i++){
			if( (i % 3 == 0 ) || (i % 5 == 0) ){
				array.add(i);
				sum += i;
				length++;
			} // End If
		} // End For Loop
		
	//	for(int j=0; j< length; j++){                         //debug: what is in arraylist
	//		System.out.print("  ," + array.get(j));
	//	} // End For Loop
	//	System.out.println("");
	//	System.out.println( "length: " + length + ", sum: " + sum);
		
	} // End Constructor
	
	// Methods
	public int getSum(){
		return sum;
	} // End getSum()
		
	public void print(int max){
		
		System.out.println("Numbers divisible by 3 or 5 under " + max + " :");
		
		//print array
		for( int i=0; i<length;i++){
			System.out.print( array.get(i) + " ");
		} // End For Loop
		
		System.out.println("");
		System.out.println("");
		
		//print sum of arary
		System.out.println("Sum of 3 and 5's under " + max + " is: " + sum );
		
		System.out.println("");
		
	} // End print()
	
	// Main
	public static void main (String args[]) {
		
		int max = 1000;
		ThreeAndFive obj = new ThreeAndFive(max);

		obj.print(max);
	} // End Main
}

