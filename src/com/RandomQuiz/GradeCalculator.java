package com.RandomQuiz;

import java.text.NumberFormat;

public class GradeCalculator {

    public void CalculateGrade(int correctAnswers, int totalQuestions){
        NumberFormat gradePercentage = NumberFormat.getPercentInstance();
        double finalGrade = ((double) correctAnswers / (double) totalQuestions);
        String finalGradePercent = gradePercentage.format(finalGrade);
        System.out.println("Your grade is: " + finalGradePercent);

    }
}
