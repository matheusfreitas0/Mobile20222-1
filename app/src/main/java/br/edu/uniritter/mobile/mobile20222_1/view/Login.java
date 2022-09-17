package br.edu.uniritter.mobile.mobile20222_1.view;

import br.edu.uniritter.mobile.mobile20222_1.model.User;
import br.edu.uniritter.mobile.mobile20222_1.model.UserList;

public class Login {

  public boolean loginCheck(String login, String password){
    boolean check = false;

    UserList userList = new UserList();

    for (User user : userList.getUsers()) {
      boolean loginCheck = user.getUserLogin().equals(login);
      boolean passwordCheck = user.getPassword().equals(password);

      if(loginCheck && passwordCheck) {
        check = true;
      }
    }
    return check;
  }
}
