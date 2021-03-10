class App {

  public static void main(String[] args) {
    System.out.println();
    System.out.println();

    EnglishTeacher et = new EnglishTeacher();

    et.favoriteChapter = "Robinson Cruso";
    et.qualification = "Matric";
    et.salary = 100;
    et.bonus = 233;
    et.name = "Ram";
    et.age = 5;
    et.gender = "male";

    System.out.println("favoriteChapter: " + et.favoriteChapter);
    System.out.println("qualification: " + et.qualification);
    System.out.println("salary: " + et.salary);
    System.out.println("bonus: " + et.bonus);
    System.out.println("name: " + et.name);
    System.out.println("age: " + et.age);
    System.out.println("gender: " + et.gender);

    System.out.println();

    et.introduce();

    System.out.println();

    et.teach();
  }

}