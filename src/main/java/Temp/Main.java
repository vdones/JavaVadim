package Temp;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        User u1 = new User("John", 20, true);
        User u2 = new User("Peter", 35, false);
        User u3 = new User("Michael", 49, true);

        ArrayList<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        System.out.println(users);

        ArrayList<User> activeUsers = new ArrayList<>();
        for (User u : users){
            if (u.isStatus())
                activeUsers.add(u);
        }
        System.out.println(activeUsers);

//        System.out.println(users.containsKey(2));
//        System.out.println(users.containsValue(u3));
//        System.out.println(users.keySet());
//        HashMap<Integer, User> secondUsers = new HashMap<>(users);
//        secondUsers.putAll(users);
//        System.out.println(secondUsers);


    }


}
