package br.edu.uniritter.mobile.mobile20222_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.edu.uniritter.mobile.mobile20222_1.view.Login;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
  private EditText userLogin;
  private EditText password;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  @Override
  public void onClick(View view) {
    Login login = new Login();

    userLogin = findViewById(R.id.login);
    password = findViewById(R.id.password);

    String loginString = userLogin.getText().toString();
    String passwordString = password.getText().toString();

    if(login.loginCheck(loginString, passwordString)) {
      Intent intent = new Intent(view.getContext(), Activity2.class);
      startActivity(intent);
    }

    else {
      Toast.makeText(this, "Usuario ou senha invalidos!", Toast.LENGTH_SHORT).show();
    }
  }
}