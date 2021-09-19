package l1111_demo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    private static Scanner scanner = new Scanner(System.in);
    private static List<NormalStudent> normalStudentList;
    private static List<GoodStudent> goodStudentList;
    private static int size = 0;

    static {
        normalStudentList = new ArrayList<NormalStudent>();
        goodStudentList = new ArrayList<GoodStudent>();
    }

    public static void recruit(){
        System.out.print("Enter the number of student that you want to recruit (11-15): ");
        int number = scanner.nextInt();
        if (number < 3 || number > 5){
            System.out.println("The number of student is not suitable");
            return;
        }

        if (size < 3){
            System.out.println("The number of student is not enough for recruiting");
        }else {
            if (goodStudentList.size() == number){
                System.out.println("The following candidates were recruited: ");
                for (int i = 0; i < goodStudentList.size(); i++) {
                    System.out.println(goodStudentList.get(i).getFullName());
                }
            }else if (goodStudentList.size() > number){
                GpaComparatorAscending gpaComparatorAscending = new GpaComparatorAscending();
                Collections.sort(goodStudentList, gpaComparatorAscending);
                for (int i = 0; i < number; i++) {
                    System.out.println(goodStudentList.get(i).getFullName());
                }
            }else {
                for (int i = 0; i < goodStudentList.size(); i++) {
                    System.out.println(goodStudentList.get(i).getFullName());
                }
                EnglishScoreComparatorAscending englishScoreComparatorAscending = new EnglishScoreComparatorAscending();
                Collections.sort(normalStudentList, englishScoreComparatorAscending);
                for (int i = goodStudentList.size(); i < number; i++) {
                    System.out.println(normalStudentList.get(i).getFullName());
                }
            }
        }
    }

    public static void addStudent() throws InvalidDOBException, InvalidFullNameException, InvalidPhoneNumberException {
        System.out.print("Enter your id: ");
        int id = scanner.nextInt();
        scanner.skip("\\R");
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter your birthday: ");
        String birthday = scanner.nextLine();
        System.out.print("Enter your gender: ");
        String sex = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter your university name: ");
        String universityName = scanner.nextLine();
        System.out.print("Enter your grade level (1. good | 2. normal): ");
        int gradeLevel = scanner.nextInt();
        if (gradeLevel == 1){
            System.out.print("Enter your gpa: ");
            double gpa = scanner.nextDouble();
            scanner.skip("\\R");
            System.out.print("Enter your best reward name: ");
            String bestRewardName = scanner.nextLine();
            goodStudentList.add(new GoodStudent(id, fullName, birthday, sex, phoneNumber, universityName, gradeLevel, gpa, bestRewardName));
        }else {
            System.out.print("Enter your english score: ");
            double englishScore = scanner.nextDouble();
            System.out.print("Enter your entry test score: ");
            double entryTestScore = scanner.nextDouble();
            normalStudentList.add(new NormalStudent(id, fullName, birthday, sex, phoneNumber, universityName, gradeLevel, englishScore, entryTestScore));
        }
        size++;
    }

    public void display(){
        System.out.println("List of good student");
        for (int i = 0; i < goodStudentList.size(); i++) {
            System.out.println(goodStudentList.get(i).toString());
        }
        System.out.println("List of normal student");
        for (int i = 0; i < normalStudentList.size(); i++) {
            System.out.println(normalStudentList.get(i).toString());
        }
    }

    public void sortFullNameDescending(){
        GoodStudentFullNameComparatorDescending goodStudentFullNameComparatorDescending = new GoodStudentFullNameComparatorDescending();
        Collections.sort(goodStudentList, goodStudentFullNameComparatorDescending);
        NormalStudentFullNameComparatorDescending normalStudentFullNameComparatorDescending = new NormalStudentFullNameComparatorDescending();
        Collections.sort(normalStudentList, normalStudentFullNameComparatorDescending);
    }
}
