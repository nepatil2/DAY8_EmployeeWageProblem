package com.bl.day8_empwage;

public class UC6 {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int Emp_Rate_Per_Hr = 20;
    public static final int Num_Of_Working_Days = 20;
    public static final int Max_Hrs_In_Month = 100;

    public static  int empHrs = 0;
    public static  int totalEmpWage = 0;
    public static  int totalEmpHrs = 0;
    public static  int totalWorkingDays = 0;


    public static void main(String[] args) {
        double empCheck = 0;
        while (empHrs <= Max_Hrs_In_Month && totalWorkingDays < Num_Of_Working_Days) {
            totalWorkingDays++ ;
            empCheck = (int) (Math.floor(Math.random() * 10) % 3);

            UC6 attendance = new UC6();
            int wage = attendance.isFullTime((int) empCheck);

            totalEmpHrs += empHrs;
            System.out.println("Days: " + totalWorkingDays+ " \t Employee Hrs: " + empHrs);
        }

        System.out.println("Total Employee Wage in Month is " + totalEmpWage);
    }

    public int isFullTime ( int empCheck) {
        switch (empCheck) {
            case IS_FULL_TIME:
                System.out.println("Employee is present Full_Time");
                empHrs = 8;
                break;
            case IS_PART_TIME:
                System.out.println("Employee is Present Part_Time");
                empHrs = 4;
                break;
            default:
                System.out.println("Employee is Absent");
                empHrs = 0;
        }
        totalEmpWage = totalEmpHrs * Emp_Rate_Per_Hr;
        System.out.println("Total Employee Wage is " + totalEmpWage);
        return totalEmpWage;
    }
}
