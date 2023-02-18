package Homework17;

import java.util.Arrays;

public class Company {
    private String address;
    private Java[] javas;
    private Go[] gos;
    private Android[] androids;
    private String ownerName; //Имя владельца

   public Company(String address, Java[] javas, Go[] gos, Android[] androids, String ownerName){
       this.address=address;
       this.javas=javas;
       this.gos=gos;
       this.androids=androids;
       this.ownerName=ownerName;
   }
   public String getAddress(){
       return address;
   }
   public void setAddress(String address){
       this.address= this.address;
   }

    public Java[] getJavas() {
        return javas;
    }

    public void setJavas(Java[] javas) {
        this.javas = javas;
    }
    public Go[]getGos(){
       return gos;
    }
    public void setGos(Go[] gos){
       this.gos=gos;
    }
    public Android[] getAndroids(){
        return androids;
    }
    public void setAndroids(Android[] androids){
       this.androids=androids;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Companies: \n " +
                "address:  " + address + '\n' +
                " javists:  " + Arrays.toString(javas) +'\n'+
                " gos:   " + Arrays.toString(gos) +'\n'+
                " androids:  " + Arrays.toString(androids) +'\n'+
                " ownerName:  " + ownerName + '\n';
    }
}
