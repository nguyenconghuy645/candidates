package com.candidates.presentation;

import com.candidates.service.CandidatesService;

import java.io.IOException;
import java.util.Scanner;

public class CandidatesMain {
    public static void main(String[] args) {
        CandidatesService candidatesService = new CandidatesService();
        Scanner scanner = new Scanner(System.in);
        try {
            candidatesService.loadFileCandidates();
        } catch (IOException e) {
            System.err.println("Candidates Manager File is Empty!");
        }
        int choose;
        do{
            candidatesService.printCandidatesMenu();
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    try {
                        candidatesService.addCandidate();
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        candidatesService.showFileCandidates();
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        candidatesService.searchCandidate();
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        candidatesService.updateFileCandidate();
                    } catch (IOException e) {
                        System.err.println("Candidates Manager File is Empty!");
                    }
                    break;
                case 5:
                    try {
                        candidatesService.deleteCandidate();
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        candidatesService.readFromCandidates();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    try {
                        candidatesService.writeToCandidates();
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 8:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Please re-enter!");
                    System.out.println("------------");
                    break;
            }
        }while (choose != 8);
    }
}
