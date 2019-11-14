package sk.itsovy.kutka;

import java.util.Random;

public class Group {
    private String name;
    private int capacity;
    private int size;
    private Student[] arr;

    public Group(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.size = 0;
        this.arr = new Student[capacity];
    }

    public boolean addStudent(Student student) {
        if ((student == null) || size == capacity) {
            return false;
        }

        arr[size] = student;
        size++;
        return true;


    }

    public Student getStudent(String FirstName, String LastName) {
        return null;
    }

    public boolean deleteStudent(Student student) {
        if (student == null || size == 0)
            return false;

        for (int i = 0; i < size; i++) {
            if (arr[i] == student) {
                //TODO Delete Student from Array
            }
        }
        return false;
    }

    public void print() {
        System.out.println("List of Students [" + name + "] :");
        for (int i = 0; i < size; i++) {
            System.out.println("   " + arr[i].toString());

        }
    }
    public void sort() {
        int n = size;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i].getLastName().compareToIgnoreCase(arr[j].getLastName()) > 0) {
                    Student temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                if (arr[i].getLastName().compareToIgnoreCase(arr[j].getLastName()) == 0) {
                    if (arr[i].getFirstName().compareToIgnoreCase(arr[j].getFirstName()) > 0) {
                        Student temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }
    public void randomStudent() {
        Random rn = new Random();

        int randomNumber = rn.nextInt(arr.length);
        System.out.println(arr[randomNumber]);


    }
    public void getStudents(int month) {

    }
}
