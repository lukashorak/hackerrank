package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

import java.util.*;

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}

// Complete the code
public class SolutionB {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}
		
		Collections.sort(studentList, new Comparator<Student>(){

			@Override
			public int compare(Student arg0, Student arg1) {
				// TODO Auto-generated method stub
				if (arg0.getCgpa() < arg1.getCgpa()){
					return -1;
				}else if (arg0.getCgpa() == arg1.getCgpa()){
					return arg0.getFname().compareTo(arg1.getFname());
				}else{
					return 1;
				}
			}
			
		});

		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
	}
}
