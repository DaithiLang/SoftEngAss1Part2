/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softeng3ass1partb;

import org.joda.time.LocalDate;
import com.mycompany.softeng3assignment1.*;

/**
 *
 * @author David
 */
public class PartB {
    
   public static void Main(String arg[]){
        Student[] students = {new Student(), new Student(), new Student(), new Student()};
        students[0].setName("David Langley");
        students[0].setId("15340201");
        students[0].setDateOfBirth(new LocalDate(1996, 10, 10));
       
   }
}