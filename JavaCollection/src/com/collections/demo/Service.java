package com.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Service {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(11);
		list.add(14);
		list.add(128);
		Collections.sort(list);
		for(Integer data : list) {
			
			
			System.out.println(data);
		}
		ListIterator<Integer> itr = list.listIterator();
		while(itr.hasNext()) {
	
			
	       System.out.println("index is:"+ itr.nextIndex() + " the value is "+ itr.next());
		}
		while(itr.hasPrevious()) {
			System.out.println("index is:"+ itr.previousIndex() + " the value is "+ itr.previous());}
			
			Student s1 = new Student(1, "mahesh");
			Student s2 = new Student(10, "snick");
			Student s3 = new Student(11, "bounty");
			List<Student> stud = new ArrayList<Student>();
			stud.add(s1);
			stud.add(s2);
			stud.add(s3);
			System.out.println(stud);
			Iterator<Student> it = stud.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());}
			}


			
		}
	

