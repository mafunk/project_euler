/*
 * EvenFib.java
 * 
 * Copyright 2014 Michael Funk <mafunk92@gmail.com>
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


public class EvenFib {
	// Gloabl Variables
	private ArrayList<Integer> array = new ArrayList<Integer>();
	private int length = 0;
	
	// Constructors
	public EvenFib(){
		array = null;
	} // End Constructor
	
	public EvenFib(int max){
		array.add(1);
		array.add(2);
		length = 2;
		
		for( int i = 2; i < max/100000; i++){
			if((array.get(i-2) + array.get(i-1)) < max){ 
				array.add( (array.get(i-2) + array.get(i-1)) );
				System.out.print((array.get(i-2) + array.get(i-1)) + "  ");
				length++;
			} // End If
		} // End For Loop
	} // End Constructor
	
	// Methods
	public void sumEven(){
		int sum =0;
		
		System.out.println("Even fib numbers: ");
		
		for(int i =0; i < length-1; i++){
			if(array.get(i)%2 == 0){
				sum += array.get(i);
				System.out.print( array.get(i) + "  ");
			} // End If
		} // End For Loop
		
		System.out.println("");
		System.out.println("The sum of the even fib numbers: " + sum);
		
	} // End sumEven()
	
	public void sumOdd(){
		int sum =0;
		
		
	} // End sumOdd()
	
	public void sumAll(){
		int sum =0;
		
		
	} // End sumAll()
	
	// Main
	public static void main (String args[]) {
		int max = 4000000;
		EvenFib obj = new EvenFib(max);
		
		//obj.sumEven();
		
	} // End Main
}

