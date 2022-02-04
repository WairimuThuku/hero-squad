package models;

import java.util.ArrayList;

public class Squad {private String squadId;
    private String squadName;
    private int squadSize;

    private ArrayList<Hero>  squadMembers = new ArrayList<>();
    private static ArrayList<Squad> instances = new ArrayList<>();


    public Squad(String name, int size, String Id ){
        squadName = name;
        squadSize = size;
        squadId = Id;

        this.squadMembers = new ArrayList<>();
        //instances.add(this);
        //this.squadId = instances.size();

    }
    public static Squad findBySquadId(int i) {
        return null;
    }

    public String getSquadId(){return squadId;}

    public String getSquadName() {return squadName;}
    public int getSize() {return squadSize;}

    public static ArrayList<Squad> getInstances(){return instances;}
    public ArrayList<Hero> getSquadMembers(){
        return squadMembers;
    }
    public void setSquadMembers(Hero newMember) {
        squadMembers.add(newMember);
    }
    public static void clearAllSquads(){ instances.clear(); }
    public void clearAllSquadMembers(){ getSquadMembers().clear(); }

    public static Squad setUpNewSquad(){return new Squad("Striker",5, "Man u");}
    public static Squad setUpNewSquad1(){return new Squad("Defender",5, "Liverpool");}
    public static Squad setUpNewSquad2(){return new Squad("Goalkeeper",2, "Barcelona" );}

}


