package test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SolutionAmazon {

	public static void main(String[] argh) {

	}

	public List<String> getDirectFriendsForUser(String user) {
		return new ArrayList<String>();
	}

	public List<String> getAttendedCoursesForUser(String user) {
		return new ArrayList<String>();
	}

	class CourseCounter {
		public CourseCounter(String name) {
			this.name = name;
		}

		private Integer counter = 0;
		private String name;

		public void increaseCounter() {
			counter++;
		}

		public Integer getCounter() {
			return counter;
		}

		public void setCounter(Integer counter) {
			this.counter = counter;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	public List<String> getRankedCourses(String user) {

		// 1. Get all users/friends in the user's circle
		// 1.1 Call ListA = getDirectFriendsForUser(user) -direct
		// 1.2 Call ListB = for userA:ListA - getDirectFriendsForUser(userA)

		// 2. merge ListA + ListB

		// 3. get all courses and keep the total count for each course

		// 4. Remove the courses user took

		// 5. Sort the list by count of each course

		Set<String> usersL1 = new HashSet<String>();
		Set<String> usersL2 = new HashSet<String>();
		usersL1.addAll(getDirectFriendsForUser(user));

		for (String u : usersL1) {
			usersL2.addAll(getDirectFriendsForUser(u));
		}
		Set<String> users = usersL1;
		users.addAll(usersL2);

		Map<String, CourseCounter> courses = new HashMap<>();

		for (String u : users) {
			List<String> courseListByUser = getAttendedCoursesForUser(u);

			for (String c : courseListByUser) {
				CourseCounter counter = courses.get(c);
				if (counter == null) {
					counter = new CourseCounter(c);
					courses.put(c, counter);
				} else {
					counter.increaseCounter();
				}
			}
		}

		List<String> coursesByUser = getAttendedCoursesForUser(user);
		for (String c : coursesByUser) {
			courses.remove(c);
		}

		List<CourseCounter> coursesAll = new ArrayList<>(courses.values());

		Collections.sort(coursesAll, new Comparator<CourseCounter>() {
			@Override
			public int compare(CourseCounter arg0, CourseCounter arg1) {
				return -arg0.getCounter().compareTo(arg1.getCounter());
			}
		});

		List<String> recommendedCourses = new ArrayList<>();
		for (CourseCounter c:coursesAll){
			recommendedCourses.add(c.getName());
		}
		
		return recommendedCourses;
	}
}
