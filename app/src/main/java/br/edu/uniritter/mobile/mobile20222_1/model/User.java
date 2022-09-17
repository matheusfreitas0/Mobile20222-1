package br.edu.uniritter.mobile.mobile20222_1.model;

public class User {
  private int id;
  private String name;
  private String userLogin;
  private String password;

  public User(int id, String name, String userLogin, String password) {
    this.id = id;
    this.name = name;
    this.userLogin = userLogin;
    this.password = password;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getPassword() {
    return password;
  }

  public String getUserLogin() {
    return userLogin;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}