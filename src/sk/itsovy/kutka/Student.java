package sk.itsovy.kutka;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Student extends Subjects {
    private String firstName;
    private String lastName;
    private Date bDay;
    private int month;
    private int day;
    private int year;
    private String dateOfBirth;
    private int subjectCapacity;
    List<String> subjects = new ArrayList<String>();

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBday(Date bday) {
        Calendar cal = Calendar.getInstance();
        cal.set(1999, 5,16);
    }
    public Date getBday() {
        return bDay;
    }
    public int getMonth() {
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH);
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }


    public boolean addSubject (String subject) {
        subjectCapacity = 5;
        if (subjects.size() >= subjectCapacity) {
            return false;
        }
        subjects.add(subject);
        return true;
    }

    public List<String> getSubjects() {
        return subjects;

        }
    }
