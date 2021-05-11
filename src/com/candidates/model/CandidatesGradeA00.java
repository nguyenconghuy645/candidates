package com.candidates.model;

public class CandidatesGradeA00 extends Candidates {
    public static final String Math = "Math";
    public static final String Physics = "Physics";
    public static final String Chemistry = "Chemistry";

    public CandidatesGradeA00() {
    }

    public CandidatesGradeA00(int numericalOrder, String id, String fullName, String address, String dateOfBirth, String testInPlace, int telephoneNumber, int priority) {
        super(numericalOrder, id, fullName, address, dateOfBirth, testInPlace, telephoneNumber, priority);
    }

    @Override
    public String toString() {
        return "CandidatesGradeA00{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", testInPlace='" + testInPlace + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                ", priority=" + priority +
                ", Subject: " + Math + " - " + Physics + " - " + Chemistry +
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
                "," + Math + "," + Physics + "," + Chemistry + "\n";
    }
}
