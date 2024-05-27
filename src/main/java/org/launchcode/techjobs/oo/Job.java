package org.launchcode.techjobs.oo;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.assertEquals;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this(); // Call the first constructor to initialize the id field
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);

    }
// TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Job.nextId = nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String lineSeparator = System.lineSeparator();

        String idString = "ID: " + id;
        String nameString = "Name: " + (name.isEmpty() ? "Data not available" : name);
        String employerString = "Employer: " + (employer.getValue().isEmpty() ? "Data not available" : employer.getValue());
        String locationString = "Location: " + (location.getValue().isEmpty() ? "Data not available" : location.getValue());
        String positionTypeString = "Position Type: " + (positionType.getValue().isEmpty() ? "Data not available" : positionType.getValue());
        String coreCompetencyString = "Core Competency: " + (coreCompetency.getValue().isEmpty() ? "Data not available" : coreCompetency.getValue());

        return lineSeparator +
                idString + lineSeparator +
                nameString + lineSeparator +
                employerString + lineSeparator +
                locationString + lineSeparator +
                positionTypeString + lineSeparator +
                coreCompetencyString + lineSeparator;
    }
}
//    @Test
//    public void testToStringStartsAndEndsWithNewLine() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        Job job = createJob("Web Developer", "LaunchCode", "StL", "Back-end developer", "Java");
//        String firstChar = String.valueOf(job.toString().charAt(0));
//        String lastChar = String.valueOf(job.toString().charAt(job.toString().length()-1));
//        assertEquals(firstChar, lineSeparator());
//        assertEquals(lastChar, lineSeparator());
//}