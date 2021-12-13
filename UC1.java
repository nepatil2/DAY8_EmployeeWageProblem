package com.bl.day8_empwage;

public class UC1 {
        public static final int IS_FULL_TIME=1;
        public static final int Absent=0;
        private int empCheck;

        public static void main(String[] args) {
            double empCheck = (Math.floor(Math.random()*10)%2);
            UC1 attendance = new UC1();
            attendance.isFullTime(empCheck);

        }
        public int isFullTime(double empCheck){
            if ((this.empCheck == IS_FULL_TIME)) {
                System.out.println("Employee is Present");
            }
            else if ((this.empCheck == Absent)) {
                System.out.println("Employee is Absent");
            }
            return this.empCheck;
        }
    }

