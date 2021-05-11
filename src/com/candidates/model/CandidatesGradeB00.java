package com.candidates.model;

public class CandidatesGradeB00 extends Candidates {
    public static final String Math = "Math";
    public static final String Chemistry = "Chemistry";
    public static final String Biology = "Biology";

    public CandidatesGradeB00() {
    }

    public CandidatesGradeB00(int numericalOrder, String id, String fullName, String address, String dateOfBirth, String testInPlace, int telephoneNumber, int priority) {
        super(numericalOrder, id, fullName, address, dateOfBirth, testInPlace, telephoneNumber, priority);
    }

    @Override
    public String toString() {
        return "CandidatesGradeB00{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", testInPlace='" + testInPlace + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                ", priority=" + priority +
                ", Subject: " + Math + " - " + Chemistry + " - " + Biology +
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
                "," + Math + "," + Chemistry + "," + Biology + "\n";
    }
}
