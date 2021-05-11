package com.candidates.model;

public class CandidatesGradeD00 extends Candidates {
    public static final String Math = "Math";
    public static final String Literature = "Literature";
    public static final String English = "English";

    public CandidatesGradeD00() {
    }

    public CandidatesGradeD00(int numericalOrder, String id, String fullName, String address, String dateOfBirth, String testInPlace, int telephoneNumber, int priority) {
        super(numericalOrder, id, fullName, address, dateOfBirth, testInPlace, telephoneNumber, priority);
    }

    @Override
    public String toString() {
        return "CandidatesGradeD00{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", testInPlace='" + testInPlace + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                ", priority=" + priority +
                ", Subject: " + Math + " - " + Literature + " - " + English +
                '}';
    }

    public String toStringCSV() {
        return id +
                "," + fullName +
                "," + address +
                "," + dateOfBirth +
                "," + testInPlace +
                "," + telephoneNumber +
                "," + priority +
                "," + Math + "," + Literature + "," + English + "\n";
    }
}
