package day_47_Abstraction.EmployeeTask;

public  abstract  class  person {

  public String name;
  public int age;
  public char gender;

    protected abstract void sleep();

    public person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
