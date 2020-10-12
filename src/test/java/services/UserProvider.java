package services;

import models.User;

import java.util.HashMap;

public class UserProvider {
    public HashMap users;

    public UserProvider(){
        this.users=new HashMap<String, User>();
        this.users.put("RegisteredUser",new User("passionfruit49@hotmail.com","TestPass"));
        this.users.put("RegisteredUserBadPassword", new User("passionfruit49@hotmail.com","Smoo"));
        this.users.put("UnregisteredUser", new User("smoo@smoo.com","smoo"));
        this.users.put("validUser3",new User("user3","pass"));

    }

    public User getUser(String userId){
        return (User) users.get(userId);
    }
}
