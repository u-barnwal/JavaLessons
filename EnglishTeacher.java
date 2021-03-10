class EnglishTeacher extends Teacher {
  String favoriteChapter;

  void introduce() {
    System.out.println("Hello, my name is " + name + ". I am " + age + " year(s) old!");
    System.out.println("I got a bonus of " + bonus + " this year!");
  }

  void teach() {
    System.out.println("i am teaching " + favoriteChapter + "!");
  }
}
