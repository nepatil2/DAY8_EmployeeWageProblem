package com.bl.day8_empwage;

public class UC3 {
    public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;
    public static final int Emp_Rate_Per_Hr =20;
    public static  int empHrs=0;
    public static  int empWage=0;


    public static void main(String[] args) {
        double empCheck = (Math.floor(Math.random()*10)%3);
        UC3 attendance = new UC3();
        int wage = attendance.isFullTime((int) empCheck);
    }
    public int isFullTime(int empCheck){
        if ((empCheck == IS_FULL_TIME)) {
            System.out.println("Employee is Present");
            empHrs =8;
        }
        else if ((empCheck == IS_PART_TIME)) {
            System.out.println("Employee is Present Part_Time");
            empHrs =4;
        }
        else{
            System.out.println("Employee is Absent");
            empHrs =0;
        }
        empWage = empHrs * Emp_Rate_Per_Hr;
        System.out.println("Employee Daily Wage is " +empWage);
        return empWage;
    }
}
