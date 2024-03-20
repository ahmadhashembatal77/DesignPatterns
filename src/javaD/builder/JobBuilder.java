package javaD.builder;

public class JobBuilder implements Builder {
    private String title;
    private String location;
    private String skills;
    private String experience;
    private String salary;

    @Override
    public JobBuilder title(String title) {
        this.title = title;
        return this;
    }
    @Override
    public JobBuilder location(String location) {
        this.location = location;
        return this;
    }
    @Override
    public JobBuilder skills(String skills) {
        this.skills = skills;
        return this;
    }
    @Override
    public JobBuilder experience(String experience) {
        this.experience = experience;
        return this;
    }
    @Override
    public JobBuilder salary(String salary) {
        this.salary = salary;
        return this;
    }

    public JobB build() {
        return new JobB(title, location, skills, experience, salary);
    }

}
