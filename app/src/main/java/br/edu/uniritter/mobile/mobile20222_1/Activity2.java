package br.edu.uniritter.mobile.mobile20222_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import br.edu.uniritter.mobile.mobile20222_1.adapter.UsersAddapter;
import br.edu.uniritter.mobile.mobile20222_1.databinding.Activity2Binding;
import br.edu.uniritter.mobile.mobile20222_1.model.User;

public class Activity2 extends AppCompatActivity {
    private final String TAG = "Activity2";
    private Activity2Binding layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_2);
        // substitui isto por isso
        layout = DataBindingUtil.setContentView(this,R.layout.activity_2);
        User user1 = User.getUserById(getIntent().getIntExtra("id", -1));

        layout.setUser(user1);




    }
}