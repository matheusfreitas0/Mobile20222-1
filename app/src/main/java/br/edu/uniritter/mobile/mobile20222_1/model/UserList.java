package br.edu.uniritter.mobile.mobile20222_1.model;

import java.util.ArrayList;
import java.util.List;

public class UserList {
  private List<User> users;

  public UserList() {
    this.users = new ArrayList<>();
    users.add( new User(1, "Matheus", "ms1", "1"));
    users.add( new User(2, "Fernando", "fo1", "1"));
    users.add( new User(3, "Miriam", "mm1", "1"));
  }

  public List<User> getUsers() {
    return users;
  }
}