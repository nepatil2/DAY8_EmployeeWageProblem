package com.bl.day8_empwage;

public class UC7 {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int Emp_Rate_Per_Hr = 20;
    public static final int Num_Of_Working_Days = 20;
    public static final int Max_Hrs_In_Month = 100;

    public static int empHrs = 0;
    public static int totalEmpHrs = 0;
    public static int totalWorkingDays = 0;

    public static void main(String[] args) {
        computeEmpWage();
    }

    public static int computeEmpWage() {
        while(totalEmpHrs <= Max_Hrs_In_Month && totalWorkingDays < Num_Of_Working_Days){
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10 ) % 3;
            switch (empCheck){
                case IS_PART_TIME:
                    System.out.println("Employee is present Part_Time");
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    System.out.println("Employee is present Full_Time");
                    empHrs = 8;
                    break;
                default:
                    System.out.println("Employee is absent");
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day :  " + totalWorkingDays + "  Emp Hrs : " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * Emp_Rate_Per_Hr;
        System.out.println(" Total Emp Wage :" + totalEmpWage);
        return totalEmpWage;
    }
}