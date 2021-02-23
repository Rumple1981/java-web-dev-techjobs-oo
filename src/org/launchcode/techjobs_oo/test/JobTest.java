package org.launchcode.techjobs_oo.test;

import org.junit.*;
import static org.junit.Assert.*;  //assertEquals;
import org.launchcode.techjobs_oo.*;



public class JobTest {  // not sure what this is called -- its more than a method
    public Job job1;    // invent the variables named Job job1 and Job job2
    public Job job2;
    public Job job3;
    public Job job4;
    public Job job5;
    public Job job6;
    public Job job7;
    public Job job8;
    public Job job9;

    @Before                        // Forgot this: to invent a testable object
    public void makeAJob() {
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        job5 = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        job6 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        job7 = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        job8 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        job9 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency(""));
    }


    @Test
    public void testSettingJobId() {
        assertEquals(job1.getId() + 1, job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(job3 instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        assertEquals(false, job3.equals(job4));
    }

    @Test
    public void testToStringLineSpaces() {
//        System.out.println(job4);
        assertEquals(true, job4.toString().startsWith("\n"));
        assertEquals(true, job4.toString().endsWith("\n"));
    }

    @Test
    public void testToStringContainsLabels() {
      System.out.println(job4.toString());
        assertEquals(true, job4.toString().contains("Name"));
        assertEquals(true, job4.toString().contains("Product tester"));

        assertEquals(true, job4.toString().contains("Employer"));
        assertEquals(true, job4.toString().contains("ACME"));

        assertEquals(true, job4.toString().contains("Location"));
        assertEquals(true, job4.toString().contains("Desert"));

        assertEquals(true, job4.toString().contains("Position Type"));
        assertEquals(true, job4.toString().contains("Quality Control"));

        assertEquals(true, job4.toString().contains("Core Competency"));
        assertEquals(true, job4.toString().contains("Persistence"));

    }

    @Test   // this fails on colons
    public void testToStringContainsACME() {
        System.out.println(job4);
        assertEquals(true, job4.toString().contains("ACME"));
    }

        @Test
    public void testToStringContainsDataNot() {

        assertEquals(true, job5.toString().contains("Data not available"));

            assertEquals(true, job6.toString().contains("Data not available"));

            assertEquals(true, job7.toString().contains("Data not available"));

            assertEquals(true, job8.toString().contains("Data not available"));

            assertEquals(true, job9.toString().contains("Data not available"));
    }
}




