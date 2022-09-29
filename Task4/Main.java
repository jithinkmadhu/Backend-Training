
package com.orthofx.task;

import com.orthofx.task.Student;
import com.orthofx.task.Branch;

import java.util.*;

public class Main {

	private static Map<String, Branch> branchTable = new HashMap<>();
	private static Map<Integer, Student> studentTable = new HashMap<>();
	private static Scanner sc = new Scanner(System.in);

	public static Branch createBranch(String name) {
		Branch branch = new Branch(branchTable.size() + 1, name);
		branchTable.put(branch.getName(), branch);
		System.out.println("\nBranch created successfully....\n");
		return branch;
	}

	public static Student addStudent(String name, Branch branchName) {
		Student student = new Student(studentTable.size() + 1, name, branchName);
		studentTable.put(student.getId(), student);
		System.out.println("\nStudent Added successfully....\n");
		return student;
	}

	public static void viewStudent(int id) {
		try {
			Student student = studentTable.get(id);
			System.out.println("\nId : " + student.getId() + "\nName : " + student.getName() + "\nBranch : "
					+ student.getBranchName() + "\n");
		} catch (NullPointerException e) {
			System.out.println("\nStudent with this id doesn't exist\n");
		}

	}

	public static Student updateStudent(int id, String name, Branch branch) {
		Student student = new Student(id, name, branch);
		studentTable.put(id, student);
		return student;
	}

	public static void deleteStudent(int id) {
		studentTable.remove(id);
		System.out.println("Student deleted successfully.");
	}

	public static void viewAllStudents() {
		for (Student student : studentTable.values()) {
			System.out.printf("%s = %s\n", student.getName(), student.getBranchName());
		}
	}

	public static void viewAllBranches() {
		for (Branch branch : branchTable.values()) {
			System.out.printf("%s = %s\n", branch.getName(), branch.getId());
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int input, id;
		boolean again = true, found = false;
		String branchName, studentName;

		do {
			System.out.println("Enter the option you want to perform:" + "\n1. Create Branch" + "\n2. Add Student"
					+ "\n3. View Student" + "\n4. Update Student" + "\n5. Delete Student" + "\n6. View all Students"
					+ "\n7. View all Branches" + "\n8. Exit");

			input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println("\nCreate Branch");
				System.out.println("-------------");
				System.out.print("Enter the Branch : ");
				branchName = sc.next();
				createBranch(branchName);
				break;
			case 2:
				System.out.println("\nAdd Student");
				System.out.println("-----------");
				System.out.println("Enter the name : ");
				studentName = sc.next();
				System.out.println("Enter the Branch : ");
				branchName = sc.next();

				if (branchTable.containsKey(branchName)) {
					addStudent(studentName, branchTable.get(branchName));
				} else {
					System.out.println("\nBranch doesn't exist!!!!!!!!!!!\n");
				}
				break;
			case 3:
				System.out.println("\nView Student");
				System.out.println("------------");
				System.out.print("Enter the id : ");
				id = sc.nextInt();
				viewStudent(id);
				break;
			case 4:
				System.out.println("\nUpdate Student");
				System.out.println("--------------");
				System.out.print("Enter id : ");
				id = sc.nextInt();
				found = false;
				if (studentTable.containsKey(id)) {
					System.out.print("Enter the name : ");
					studentName = sc.next();
					System.out.print("Enter the branch : ");
					branchName = sc.next();
					updateStudent(id, studentName, branchTable.get(branchName));
					found = true;
				}
				if (!found)
					System.out.println("\nStudent with this id is not present!!!!!!!\n");
				else
					System.out.println("\nStudent details updated successfully.\n");
				break;
			case 5:
				System.out.println("\nDelete Student");
				System.out.println("--------------");
				System.out.print("Enter id : ");
				id = sc.nextInt();
				deleteStudent(id);
				break;
			case 6:
				System.out.println("View all Student");
				System.out.println("----------------");
				viewAllStudents();
				break;
			case 7:
				System.out.println("View all Branches");
				System.out.println("------------");
				viewAllBranches();
				break;
			case 8:
				System.out.println("Exiting..");
				System.exit(0);
				break;
			default:
				System.out.println("\nPlease enter valid input!!\n");
				break;
			}
		} while (again);
	}
}
