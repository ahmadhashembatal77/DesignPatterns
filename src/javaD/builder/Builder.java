package javaD.builder;

public interface Builder {
    Builder title(String title);

    Builder location(String location);

    Builder skills(String skills);

    Builder experience(String experience);

    Builder salary(String salary);
}