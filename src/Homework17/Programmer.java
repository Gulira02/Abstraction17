package Homework17;

public abstract class Programmer {
    private String name;
    private int age;
    private String gender;
    private String email;

    public Programmer(String name, int age, String gender, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Programmers: \n" +
                "name:   " + name + '\n' +
                " age:  " + age +'\n'+
                " gender:  " + gender + '\n' +
                " email:   " + email ;
    }
    //Класс Java (name, age, gender, email) түзүңүз
    //Класс Android (name, age, gender, email) түзүңүз
    //Класс Go (name, age, gender, email) түзүңүз
    //Жогорудагы 3 класс бир класстан мурасталсын.
    //Класс Company(address, java, android, go, ownerName)
    //Мейн класстан эки компания түзүңүз
    //Биринчи компанияда 5 жава, 3 андроид, 2 gо программист иштесин
    //Экинчи компанияда 2 жава, 1 андроид, 1 go программист иштесин
    //Компанияларды консольго чыгарыңыз
}
