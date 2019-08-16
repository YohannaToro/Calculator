/*
 * Copyright (C) 2019 CrkJo
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
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author YohannaToro
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    /**
     *this function create a linked list of different test cases
     * @param c
     * @return LinkedList
     */
    
    private LinkedList getList(String c) throws FileNotFoundException{
        String path="resources/test_cases/case"+c+".txt";
        Scanner sc= new Scanner(new File(path));
        LinkedList list= new LinkedList();
        while(sc.hasNext()){
            list.insert(Double.parseDouble(sc.nextLine()));
        }
        return list;
    }
    /**
     * Test of mean method, of class Calculator.
     */
    @org.junit.Test
    public void testMean() {
        System.out.println("mean");
        LinkedList list1 = getList("1"),list2 = getList("2"),list3 = getList("3");;
        double expResultCase1 =550.60,expResultCase2 =62.32,expResultCase3 =638.90 ;
        double result1 = Calculator.mean(list1);
        double result2 = Calculator.mean(list2);
        double result3 = Calculator.mean(list3);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case give a different result.");
    }

    /**
     * Test of standarDesviation method, of class Calculator.
     */
    @org.junit.Test
    public void testStandarDesviation() {
        System.out.println("standarDesviation");
        
        LinkedList list1 = getList("1"),list2 = getList("2"),list3 = getList("3");;
        double expResultCase1 =572.03,expResultCase2 =62.26,expResultCase3 =625.63 ;
        double result1 = Calculator.standarDesviation(list1);
        double result2 = Calculator.standarDesviation(list2);
        double result3 = Calculator.standarDesviation(list3);
        assertEquals(expResultCase1, result1);
        assertEquals(expResultCase2, result2);
        assertEquals(expResultCase3, result3);
        
        fail("The test case give a different result");
    }
    
}
