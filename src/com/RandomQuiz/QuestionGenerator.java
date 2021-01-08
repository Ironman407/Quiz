package com.RandomQuiz;


import java.util.Locale;
import java.util.Scanner;

public class QuestionGenerator {

    Scanner myScanner = new Scanner(System.in);
    int numberOfQuestions;
    public void getQuestionAmount() {

        System.out.println("How many questions would you like to answer?");
        System.out.println("Please choose a number between 1 and 7");
        numberOfQuestions = myScanner.nextByte();
        boolean answerInRange = numberOfQuestions <= 7 && numberOfQuestions >= 1;
        if (answerInRange) {
            System.out.println("You have chosen " + numberOfQuestions + " questions.");
            setQuestions(numberOfQuestions);
        }else
            System.out.println("Please choose a valid number of questions");
    }


    public void setQuestions ( int numberOfQuestions){
        String[] countries = {"Finland", "Sweden", "Japan", "Italy", "France", "Iraq", "Spain"};
        String[] capitals = {"Helsinki", "Stockholm", "Tokyo", "Rome", "Paris", "Baghdad", "Madrid"};
        for (int i = 0; i < numberOfQuestions; i++) {
            System.out.println("What is the capital of " + countries[i]);
            String answer = myScanner.next();
            if (answer.toUpperCase(Locale.ROOT).equals(capitals[i].toUpperCase(Locale.ROOT))) {
                System.out.println(answer + " is correct");
            } else
                System.out.println(answer + " is incorrect");
        }

    }

}
