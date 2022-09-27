package com.burak.inner_and_static.AnonymousInner;

import com.burak.generics.Student;

public class Main {
    public static void main(String[] args) {

        Student std = new Student() {
            @Override
            public void study() {
                System.out.println("I am studying....");
            }

            @Override
            public void goClass() {
                System.out.println("I'm going to class....");
            }
        };
        std.study();
        std.goClass();

        System.out.println("------------");

        Teacher t1 = new Teacher("Albert Einstein", "Physics") {
            @Override
            void teach() {
                System.out.println(getName() +" is teaching " + getLecture());
            }
        };
        t1.teach();
        t1.giveHW();

    }

    public interface Student {
        void study();
        void goClass();
    }

    public static abstract class Teacher {
        private String name;
        private String lecture;

        public Teacher(String name, String lecture) {
            this.name = name;
            this.lecture = lecture;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLecture() {
            return lecture;
        }

        public void setLecture(String lecture) {
            this.lecture = lecture;
        }

        abstract void teach();

        public void giveHW() {
            System.out.println("Your homework is page 42 to 234 !!!!");
        }
    }
}
