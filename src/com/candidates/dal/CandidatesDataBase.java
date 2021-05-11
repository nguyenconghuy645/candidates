package com.candidates.dal;

import com.candidates.model.Candidates;

import java.io.*;
import java.util.LinkedList;

public class CandidatesDataBase {
    public static LinkedList<Candidates> candidatesList = new LinkedList<>();

    public void saveFileCandidates() throws IOException {
        FileWriter fileWriter = new FileWriter("E:\\Codegym\\Time\\C0221H1\\Timework\\Module2\\candidates\\data\\candidate.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Candidates candidate : candidatesList) {
            String line = candidate.toStringCSV();
            bufferedWriter.write(line);
        }
        bufferedWriter.close();
    }

    public void readFileCandidates() throws IOException {
        LinkedList<Candidates> printCandidatesList = new LinkedList<>();
        FileReader fileReader = new FileReader("E:\\Codegym\\Time\\C0221H1\\Timework\\Module2\\candidates\\data\\candidate.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(",");
            if (arr[0].equals("ID")) {
                continue;
            }
            try {
                Candidates candidates = new Candidates(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4], arr[5], Integer.parseInt(arr[6]),Integer.parseInt(arr[7]));
                printCandidatesList.add(candidates);
            } catch (ArrayIndexOutOfBoundsException ignored) {
                System.out.println(ignored.getMessage());
            }
        }
        for (Candidates candidate : printCandidatesList) {
            System.out.println(candidate.toString());
        }
        System.out.println();
        bufferedReader.close();
    }

    public void loadFileCandidates() throws IOException {
        FileReader fileReader = new FileReader("E:\\Codegym\\Time\\C0221H1\\Timework\\Module2\\candidates\\data\\candidate.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(",");
            if (arr[0].equals("ID")) {
                continue;
            }
            try {
                Candidates candidates = new Candidates(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4], arr[5], Integer.parseInt(arr[6]),Integer.parseInt(arr[7]));
                candidatesList.add(candidates);
            } catch (ArrayIndexOutOfBoundsException ignored) {
                System.out.println(ignored.getMessage());
            }
        }
    }
}
