package com.candidates.service;

import com.candidates.dal.CandidatesDataBase;
import com.candidates.model.Candidates;

import java.io.IOException;
import java.util.Scanner;

import static com.candidates.dal.CandidatesDataBase.candidatesList;

public class CandidatesService {
    static CandidatesDataBase candidatesDataBase = new CandidatesDataBase();
    static Candidates candidates = new Candidates();
    Scanner scanner = new Scanner(System.in);

    public void loadFileCandidates() throws IOException {
        candidatesDataBase.loadFileCandidates();
    }

    public  static void printCandidatesMenu(){
        System.out.println(
                """
                        ----- Application Manager Candidate -----
                        Enter 1: To insert candidate
                        Enter 2: To show information of candidate
                        Enter 3: To search candidate by id
                        Enter 4: To update candidate
                        Enter 5: To delete candidate by id
                        Enter 6: To read file
                        Enter 7: To write file
                        Enter 8: To exit
                        Chọn chức năng:
                        """);
    }

    public void addCandidate() throws IOException {
        candidates.inputCandidates();
        for (Candidates candidate : candidatesList) {
            if (candidate.getId() == candidates.getId()) {
                System.out.println("Contact exists, system is update\n" + "==========================================\n");
                return;
            }
        }
        int count = candidatesList.size();
        candidates.setNumericalOrder(++count);
        candidatesList.add(candidates);
        System.out.println("Add complete!");
        System.out.println(candidatesList.getLast().toStringCSV());
        System.out.println("------------");
        candidatesDataBase.saveFileCandidates();
    }

    public void showFileCandidates() throws IOException {
        int size = candidatesDataBase.candidatesList.size();
        if (size == 0) {
            System.out.println("Candidates not exists.");
        }else {
            printCandidates();
            for (int i = 0; i < size; i++) {
                if (i==0 || i%5!=0){
                    candidatesDataBase.candidatesList.get(i).displayContactNonEmail();
                }else {
                    System.out.println("Press enter to continue displaying the list: ");
                    switch (scanner.nextLine()){
                        case "":
                            printCandidates();
                            candidatesDataBase.candidatesList.get(i).displayContactNonEmail();
                            break;
                        default:
                            System.out.println("Exit. ");
                            return;
                    }
                }
            }
            System.out.println("Displayed all contacts!!!");
        }
    }

    public void searchCandidate() throws IOException {
        if (candidatesList.size() == 0) {
            System.err.println("Candidates File is Empty!");
            return;
        }
        String id = getId();
        System.out.println("System is searching\n" + "result:\n");
        boolean check = true;
        for (Candidates candidate : candidatesList) {
            if (candidate.getId() == id) {
                System.out.println(candidate.toString());
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Candidate not exists \n" + "==========================================\n" + "\n");
        }
    }

    public void updateFileCandidate() throws IOException {
        if (candidatesList.size() == 0) {
            System.err.println("Candidates File is Empty!");
            return;
        }
        boolean check = true;
        String id = getId();
        for (Candidates candidate : candidatesList) {
            if (candidate.getId() == id) {
                candidate.inputCandidates();
                System.out.println("Result: " + candidatesList.getLast());
                candidatesDataBase.saveFileCandidates();
                check = false;
            }
        }
        if (check) {
            System.out.println("Candidate not exists \n" + "==========================================\n" + "\n");
        }
    }

    public void deleteCandidate() throws IOException {
        if (candidatesList.size() == 0) {
            System.err.println("Candidates File is Empty!");
            return;
        }
        boolean check = true;
        String id = getId();
        for (Candidates candidate : candidatesList) {
            if (candidate.getId() == id) {
                System.out.println("Request confirmation that you want to delete candidate information, Press Y if you agree:");
                String confirm = scanner.nextLine();
                switch (confirm) {
                    case "Y":
                        candidatesList.remove(candidate);
                        System.out.println("Delete complete!");
                        System.out.println("                                          --------------");
                        candidatesDataBase.saveFileCandidates();
                        check = false;
                        break;
                    default:
                        break;
                }
            }
        }
        if (check) {
            System.out.println("Candidate not exists \n" + "==========================================\n" + "\n");
        }
    }

    public void readFromCandidates() throws IOException {
        System.out.println("Warning deleting all candidates currently in memory!!!\n" + "Press Y if you agree:");
        String confirm = scanner.nextLine();
        switch (confirm) {
            case "Y":
                candidatesDataBase.readFileCandidates();
                break;
            default:
                break;
        }
    }

    public void writeToCandidates() throws IOException {
        System.out.println("Warning users before updating candidates file!!!\n" + "Press Y if you agree:");
        String confirm = scanner.nextLine();
        switch (confirm) {
            case "Y":
                candidatesDataBase.saveFileCandidates();
                break;
            default:
                break;
        }
    }

    private String getId() {
        System.out.println("Enter the id: ");
        String id = scanner.nextLine();
        return id;
    }

    public void printCandidates(){
        System.out.printf("|| %15s | %20s | %30s | %11s | %20s | %15s | %11s ||","Id","Full name","Address","Date of birth","testInPlace","telephoneNumber","priority");
        System.out.println();
    }
}
