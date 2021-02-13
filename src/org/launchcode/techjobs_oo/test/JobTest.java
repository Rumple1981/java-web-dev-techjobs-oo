package org.launchcode.techjobs_oo.test;

import org.junit.*;
import static org.junit.Assert.*;  //assertEquals;
import org.launchcode.techjobs_oo.*;



public class JobTest {  // not sure what this is called -- its more than a method
    public Job job1;    // invent the variables named Job job1 and Job job2
    public Job job2;
    public Job job3;
    public Job job4;

    @Before                        // Forgot this: to invent a testable object
    public void makeAJob() {
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
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
        assertEquals(false,job3.equals(job4));
    }
}



