package com.example.and_assignment.data;

public class FightRepository {
    private Fight fight;
    private static FightRepository instance;

    private FightRepository(){
        fight=new Fight();
    }

    public static FightRepository getInstance(){
        if (instance==null)instance =new FightRepository();

        return instance;
    }

    public Fight getFight(){
        return fight;
    }
}
