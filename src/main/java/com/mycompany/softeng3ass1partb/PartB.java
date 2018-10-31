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
        Student[] ClassOf2019 = {new Student(), new Student()};
        ClassOf2019[0].setName("David Langley");
        ClassOf2019[0].setId("15340201");
        ClassOf2019[0].setDateOfBirth(new LocalDate(1996, 10, 10));
        
        ClassOf2019[1].setName("Lorcan Barrett-Gomez");
        ClassOf2019[1].setId("17329883");
        ClassOf2019[1].setDateOfBirth(new LocalDate(1998, 3, 15));
        
        ClassOf2019[2].setName("Colin Delahunt");
        ClassOf2019[2].setId("15402918");
        ClassOf2019[2].setDateOfBirth(new LocalDate(1996, 12, 23));
        
        Module[] diffModules = {new Module(), new Module(), new Module()};
        diffModules[0].setName("Programming 1");
        diffModules[0].setId("CT101");
        diffModules[0].addStudents(ClassOf2019[0]);
        
        diffModules[1].setName("History");
        diffModules[1].setId("HS101");
        diffModules[1].addStudents(ClassOf2019[1]);
        
        diffModules[2].setName("Biology");
        diffModules[2].setId("BY101");
        diffModules[2].addStudents(ClassOf2019[2]);
        
        Course[] courses= {new Course(), new Course(),new Course()};
        courses[0].setName("CS&IT");
        courses[0].setsDate(new LocalDate(2015,9,1));
        courses[0].seteDate(new LocalDate(2019,5,10));
        courses[0].addModules(diffModules[0]);
   
        courses[1].setName("Arts");
        courses[1].setsDate(new LocalDate(2016,9,1));
        courses[1].seteDate(new LocalDate(2020,5,10));
        courses[1].addModules(diffModules[1]);
        
        courses[2].setName("Environmental Science");
        courses[2].setsDate(new LocalDate(2017,9,1));
        courses[2].seteDate(new LocalDate(2021,5,10));
        courses[2].addModules(diffModules[2]);
   }
}