package com.goit.module4.DistanceCalc;


    public class Runner {

        public static void main(String[] args) {
            Point p1 = new Point(100,100);
            Point p2 = new Point(200,200);
            DistanceCalculatorUtil dist = new DistanceCalculatorUtil();
            //System.out.println(dist.distanceCalc(p1.getCoordinateX(),p2.getCoordinateX(),p1.getCoordinateY(), p2.getCoordinateY()));
            //System.out.println();
            System.out.println(dist.distanceCalc(p1,p2));


        }
    }
