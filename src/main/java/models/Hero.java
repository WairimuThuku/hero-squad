package models;

import java.util.ArrayList;

public class Hero {
    private String name;
    private int age;
    private String power;
    private String weakness;
    private String id;
    private static ArrayList<Hero> instances = new ArrayList<>();

    public Hero(String name, Integer age, String power, String weakness, String id) {
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        this.id = id;
    }

    public Hero(String name, Integer age, String power, String weakness) {
    }

    public static Hero findById(String idOfHero) {
        return null;
    }

    public String getName() {return this.name;}
    public int getAge() {return this.age;}
    public String getPower() {return this.power;}
    public String getWeakness() {return this.weakness;}
    public String getId() {return this.id;}
    public static ArrayList<Hero> getAllInstances() {return instances;}
    public static void clearAllHeroes(){instances.clear();}



    public static Hero setUpNewHero(){
        return new Hero("Marcus Rashford",24,"Long shots","Weak crosses and poor defensive",  "Striker");
    }
    public static Hero setUpNewHero1(){
        return new Hero("Mohamed Salah",29,"Strong key passes","Poor defensive contribution",  "Defender");
    }
   // public static Hero setUpNewHero2(){
      //  return new Hero("Ederson Moraes",31,"Strong reflex","Short passes",  "Goalkeeper");
    }



