package com.sms.main;

import com.sms.dao.javadao;
import com.sms.model.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        javadao dao = new javadao();

        int choice;

        do {

            System.out.println("\n========= Student Management System =========");

            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    Student student = new Student();

                    System.out.print("Enter Name : ");
                    student.setName(sc.nextLine());

                    System.out.print("Enter Age : ");
                    student.setAge(sc.nextInt());
                    sc.nextLine();

                    System.out.print("Enter Course : ");
                    student.setCourse(sc.nextLine());

                    System.out.print("Enter Branch : ");
                    student.setBranch(sc.nextLine());

                    System.out.print("Enter Email : ");
                    student.setEmail(sc.nextLine());

                    dao.addStudent(student);

                    break;

                case 2:

                    dao.viewStudents();

                    break;

                case 3:

                    System.out.print("Enter Student ID : ");

                    int id = sc.nextInt();

                    dao.searchStudent(id);

                    break;

                case 4:

                    Student update = new Student();

                    System.out.print("Enter Student roll no. : ");
                    update.setRollno(sc.nextInt());
                    sc.nextLine();

                    System.out.print("Enter New Name : ");
                    update.setName(sc.nextLine());

                    System.out.print("Enter New Age : ");
                    update.setAge(sc.nextInt());
                    sc.nextLine();

                    System.out.print("Enter New Course : ");
                    update.setCourse(sc.nextLine());

                    System.out.print("Enter New Branch : ");
                    update.setBranch(sc.nextLine());

                    System.out.print("Enter New Email : ");
                    update.setEmail(sc.nextLine());

                    dao.updateStudent(update);

                    break;

                case 5:

                    System.out.print("Enter Student roll no : ");

                    int deleteId = sc.nextInt();

                    dao.deleteStudent(deleteId);

                    break;

                case 6:

                    System.out.println("\nThank You!");

                    break;

                default:

                    System.out.println("\nInvalid Choice.");

            }

        } while (choice != 6);

        sc.close();

    }

}