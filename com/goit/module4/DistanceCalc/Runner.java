package com.goit.module4.DistanceCalc;


    public class Runner {

        public static void main(String[] args) {
            double x1 = 200;
            double x2 = 100;
            double y1 = 200;
            double y2 = 100;

            Distance distance = new Distance();

            System.out.println("Distance between dots with coordinates of  : ("  + x1 +" , " +y1+ ") and  ("+x2 +", and " + y2+ ") is "+ distance.Distance(x1,x2,y1,y2));

    }
}
