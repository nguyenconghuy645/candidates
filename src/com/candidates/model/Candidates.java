package com.candidates.model;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Candidates {
    protected int numericalOrder;
    protected String id, fullName, address, dateOfBirth, testInPlace;
    protected int telephoneNumber, priority;
    Scanner scanner = new Scanner(System.in);
    public static final String Math = "Math";
    public static final String Physics = "Physics";
    public static final String Chemistry = "Chemistry";

    public Candidates() {

    }

    public Candidates(int numericalOrder, String id, String fullName, String address, String dateOfBirth, String testInPlace, int telephoneNumber, int priority) {
        this.numericalOrder = numericalOrder;
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.testInPlace = testInPlace;
        this.telephoneNumber = telephoneNumber;
        this.priority = priority;
    }

    public int getNumericalOrder() {
        return numericalOrder;
    }

    public void setNumericalOrder(int numericalOrder) {
        this.numericalOrder = numericalOrder;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTestInPlace() {
        return testInPlace;
    }

    public void setTestInPlace(String testInPlace) {
        this.testInPlace = testInPlace;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Candidates{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", testInPlace='" + testInPlace + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                ", priority=" + priority +
                '}';
    }

    public String toStringCSV() {
        return id +
                "," + fullName +
                "," + address +
                "," + dateOfBirth +
                "," + testInPlace +
                "," + telephoneNumber +
                "," + priority + "\n";
    }

    public void inputCandidates() {
        System.out.println("Enter the id: ");
        this.id = scanner.nextLine();
        System.out.println("Enter the fullName: ");
        this.fullName = scanner.nextLine();
        System.out.println("Enter the address: ");
        this.address = scanner.nextLine();
        System.out.println("Enter the dateOfBirth: ");
        this.dateOfBirth = scanner.nextLine();
        System.out.println("Enter the testInPlace: ");
        this.testInPlace = scanner.nextLine();
        String regexTelephoneNumber = "^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$";
        System.out.println("Enter the telephoneNumber: ");
        String telephone = scanner.nextLine();
        Pattern pattern1 = Pattern.compile(regexTelephoneNumber);
        Matcher matcher1 = pattern1.matcher(telephone);
        while (!matcher1.find()) {
            System.out.println("Please input right format for telephone!");
            telephone = scanner.nextLine();
            matcher1 = pattern1.matcher(telephone);
        }
        this.telephoneNumber = Integer.parseInt(telephone);
        System.out.println("Enter the priority: ");
        this.priority = scanner.nextInt();
    }

    public void displayContactNonEmail(){
        System.out.printf("|| %15s | %20s | %30s | %11s | %20s | %15s | %11s ||",id,fullName,address,dateOfBirth,testInPlace,telephoneNumber,priority);
        System.out.println();
    }
}
