package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<FerrariEngine> ferrariEngines=new ArrayList<>();
        List<RenaultEnigine> renaultEnigines=new ArrayList<>();
        List<Engine> engines=new ArrayList<>();
        engines.add(new FerrariEngine(123,23,122));
        engines.add(new FerrariEngine(231,25,312));
        engines.add(new FerrariEngine(112,24,323));
        engines.add(new FerrariEngine(132,23,3123));
        engines.add(new FerrariEngine(113,22,3123));

        engines.add(new RenaultEnigine(123,122,323,333));

        engines.add(new RenaultEnigine(113,133,223,133));

        engines.add(new RenaultEnigine(223,423,123,123));

        engines.add(new RenaultEnigine(423,223,133,133));

        engines.add(new RenaultEnigine(233,323,113,113));

        List<User> users = new ArrayList<>();
        users.add(new User("John","as"));
        users.add(new User("Jotaro","Smith"));
        users.add(new User("Joasdn","qweqwe"));
        users.add(new User("Johsn","qwe"));
        users.add(new User("Johawen","qweqwe"));
        users.add(new User("Johqwen","Smith"));
        users.add(new User("Johwqen","Smith"));
        users.add(new User("John","asdasd"));
        users.add(new User("Johnas","qwe"));
        users.add(new User("Johndssd","qweqwe"));
        Userbean userbean=new UserBeanImp(users);
        userbean.getUsersByName("John");
        userbean.getUsersBySurname("Smith");
    }
}
