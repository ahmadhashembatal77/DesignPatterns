package javaD.builder;


/*
 *  It's creation design pattern that let you create complex object on step by step pieces.
 *
 *  Produces different type and representation of an object using the same
 *   construction process.
 *
 *  Extract the object constructor creation code out of its own class and
 *   move it to separate objects called builders.
 *
 * */

public class Main {
    public static void main(String[] args) {
        JobBuilder job = new JobBuilder();
        job.salary("100$")
                .location("syria")
                .title("android developer");
        System.out.println(job.build());


        DirectorBuilder directorBuilder = new DirectorBuilder();
        JobBuilder job2 = new JobBuilder();
        directorBuilder.buildNativeAndroidJob(job2);
        System.out.println(job2.build());
    }
}