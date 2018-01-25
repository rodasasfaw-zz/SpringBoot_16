package print_grades.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {

    @RequestMapping ("/")
    public String print_grade()
    {

        int cusNumber = 0;
        String cusName = "";
        int salesAmount = 0;

        String taxCode0 = "tax exempt";
        int taxCode1 = .03;
        int taxCode2 = .05;
        int salesAmount = hhh;

        if 
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter test score.");
        testScore = keyboard.nextInt();


        String displayGrade = "Sales Report" + '\n' + cusNumber + cusName + salesAmount;

        System.out.println();
        return displayGrade;

    }



}

