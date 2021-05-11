package com.candidates.model;

public class CandidatesGradeA01 extends Candidates {
    public static final String Math = "Math";
    public static final String Physics = "Physics";
    public static final String English = "English";

    public CandidatesGradeA01() {
    }

    public CandidatesGradeA01(int numericalOrder, String id, String fullName, String address, String dateOfBirth, String testInPlace, int telephoneNumber, int priority) {
        super(numericalOrder, id, fullName, address, dateOfBirth, testInPlace, telephoneNumber, priority);
    }

    @Override
    public String toString() {
        return "CandidatesGradeA01{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", testInPlace='" + testInPlace + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                ", priority=" + priority +
                ", Subject: " + Math + " - " + Physics + " - " + English +
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
                "," + Math + "," + Physics + "," + English + "\n";
    }
}
