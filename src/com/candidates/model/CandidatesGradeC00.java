package com.candidates.model;

public class CandidatesGradeC00 extends Candidates {
    public static final String Literature = "Literature";
    public static final String History = "History";
    public static final String Geography = "Geography";

    public CandidatesGradeC00() {
    }

    public CandidatesGradeC00(int numericalOrder, String id, String fullName, String address, String dateOfBirth, String testInPlace, int telephoneNumber, int priority) {
        super(numericalOrder, id, fullName, address, dateOfBirth, testInPlace, telephoneNumber, priority);
    }

    @Override
    public String toString() {
        return "CandidatesGradeC00{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", testInPlace='" + testInPlace + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                ", priority=" + priority +
                ", Subject: " + Literature + " - " + History + " - " + Geography +
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
                "," + Literature + "," + History + "," + Geography + "\n";
    }
}
