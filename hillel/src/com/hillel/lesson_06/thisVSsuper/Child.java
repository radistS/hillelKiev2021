package com.hillel.lesson_06.thisVSsuper;

public class Child extends Parent {
    private String mName;
    private String faName;
    private int age; // 0

    public Child(String fName, String lName, String mName, String faName) {
        super(fName, lName); // parent
        this.mName = mName;  // child
        this.faName = faName;
        System.out.println("child : (fName, lName, mName, faName)");
    }

    public Child(String fName, String lName) {
       this();
       this.setfName(fName);
       this.setlName(lName);
    }

    public Child() {
    }

    public Child(String mName) {
        this.mName = mName;
        System.out.println("child : (mName)");
    }

    public Child(int age) {
        super();
        this.age = age;
        System.out.println("child : (age)");
    }

    @Override
    public String toString() {
        return "Child{" +
                "parent fName='" + super.getfName() + '\'' +
                ", parent lName='" + super.getlName() + '\'' +
                ", mName='" + mName + '\'' +
                ", faName='" + faName + '\'' +
                ", age=" + age +
                '}';
    }
}
