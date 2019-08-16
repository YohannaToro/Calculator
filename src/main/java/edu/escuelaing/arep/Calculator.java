/*
 * Copyright (C) 2019 YohannaToro
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.escuelaing.arep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author YohannaToro
 */
public class Calculator {
    /**
     * Execute the application
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        String path="resources/test_cases/case1.txt";
        Scanner sc= new Scanner(new File(path));
        LinkedList list= new LinkedList();
        while(sc.hasNext()){
            list.insert(Double.parseDouble(sc.nextLine()));
        }
         double a=mean(list);
         double sDeviation = standarDesviation(list);
            System.out.printf("Mean: %.2f \n", a);
            System.out.printf("Standard deviation: %.2f \n", sDeviation);

    }

    /**
     *this function calculate mean of a set of n real numbers
     * @param list
     * @return double
     */
    public static double mean(LinkedList list){
        double sum=0;
        for(int i=0;i<list.getSize();i++){
            sum+=list.get(i);
        }
        double res=sum/list.getSize();
        return res;
    }
    
    /**
     *this function calculate standar desviation of a set of n real number
     * @param list
     * @return double
     */
    public static double standarDesviation(LinkedList list){
        double sum = 0, sD = mean(list);
        int length = list.getSize();
        for(int i=0;i<length;i++) {
            sum += Math.pow(list.get(i) - sD, 2);
        }
        return Math.sqrt(sum/(length-1));
    }
}
