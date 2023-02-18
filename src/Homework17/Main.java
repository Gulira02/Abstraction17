package Homework17;

public class Main {
    public static void main(String[] args) {
        Java java1 =new Java("Daniya",20,"W","daniyaa03@gmail.com");
        Java java2 =new Java("Firaya",21,"W","firaya02@gmail.com");
        Java java3 =new Java("Faniya",22,"W","faniya01@gmail.com");
        Java java4 =new Java("Felina",23,"W","felinaa00@gmail.com");
        Java java5 =new Java("Kadriya",24,"W","kadriya99@gmail.com");
        Java[] javas={java1,java2,java3,java4,java4,java5};

        Android android1=new Android("Ahsan",22,"M","ahsan01@gmail.com");
        Android android2=new Android("Arkadi",23,"M","arkadi00@gmail.com");
        Android android3=new Android("Ignat",24,"M","ignat99@gmail.com");
        Android[] androids={android1,android2,android3};

        Go go1=new Go("Beyhan",25,"W","beygan98@gmail.com");
        Go go2=new Go("Serhan",26,"M","serhan97@gmail.com");
        Go go3=new Go("Alsu",27,"W","alsu96@gmail.com");
        Go[] gos={go1,go2};

        Company company1=new Company("Moscow",javas,gos,androids,"Vera Kaya");
        Company company2=new Company("Moscow", new
                Java[]{java1,java2},new Go[]{go3}, new Android[]{android1},"Senora Gin");

        System.out.println(company1+"   ");
        System.out.println("------------------------------------------------------");
        System.out.println(company2+"  ");
    }


}