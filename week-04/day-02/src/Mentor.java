public class Mentor extends Person {
  private String level;

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }
  public Mentor(String level) {
    this.level = level;
  }
  public Mentor() {
    this.level = "Intermediate";
  }
  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + level + " mentor.");
  }
  public void getGoal() {
    System.out.println("Educate brilliant junior software developers!");
  }
}