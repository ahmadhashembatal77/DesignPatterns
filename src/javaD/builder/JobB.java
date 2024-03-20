package javaD.builder;

public class JobB {
    private final String title;
    private final String location;
    private final String skills;
    private final String experience;
    private final String salary;

    public JobB(String title, String location, String skills, String experience, String salary) {
        this.title = title;
        this.location = location;
        this.skills = skills;
        this.experience = experience;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "JobB{" +
                "title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", skills='" + skills + '\'' +
                ", experience='" + experience + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
