package com.goit.module4.DistanceCalc;


public class DistanceCalculatorUtil
{
  private Point p1;
  private Point p2;

        public double distanceCalc (Point p1, Point p2) {
                 double x1 = p1.getCoordinateX();
                 double x2 = p2.getCoordinateX();
                 double y1 = p1.getCoordinateY();
                 double y2 = p2.getCoordinateY();
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        }
}
