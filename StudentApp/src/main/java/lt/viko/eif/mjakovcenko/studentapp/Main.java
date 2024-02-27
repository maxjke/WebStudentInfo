package lt.viko.eif.mjakovcenko.studentapp;

import lt.viko.eif.mjakovcenko.studentapp.model.Account;
import lt.viko.eif.mjakovcenko.studentapp.model.Student;
import lt.viko.eif.mjakovcenko.studentapp.model.Subject;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Name1", "LastName1","1001");
        Account account1 = new Account("Username1", "Password1");

        Subject subject1 = new Subject("Subject1", 20);
        Subject subject2 = new Subject("Subject2",20);

        student1.getSubjectList().add(subject1);
        student1.getSubjectList().add(subject2);

        student1.setAccount(account1);
        System.out.println(student1);
    }
}