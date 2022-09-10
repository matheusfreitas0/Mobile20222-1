package br.edu.uniritter.mobile.mobile20222_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import br.edu.uniritter.mobile.mobile20222_1.adapter.UsersAddapter;
import br.edu.uniritter.mobile.mobile20222_1.model.User;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private final String TAG = "MainActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getIntent().getIntExtra("userId",-1);
        Log.d(TAG, "onCreate: começando a bagaça");
        setContentView(R.layout.activity_main);
        /*(R.id.botao).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Activity2.class);
                startActivity(intent);
            }
        });
        */
        //findViewById(R.id.botao).setOnClickListener( this );
        View.OnClickListener ocl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Alguém clicou ocl");
                Intent intent = new Intent(view.getContext(), Activity2.class);
                intent.putExtra("userId", 1);


                startActivity(intent);
            }
        };


        findViewById(R.id.button02).setOnClickListener( ocl );
        findViewById(R.id.botao).setOnClickListener(
                (view) -> {
                    Log.d(TAG, "onClick: Alguém clicou lambda");

                    Intent intent = new Intent(view.getContext(), Activity2.class);
                    startActivity(intent);
                });
        RecyclerView rc = findViewById(R.id.recycler1);
        List<User> lista = new ArrayList<>();
        lista.add(User.getUsers().get(4));
        UsersAddapter adapter = new UsersAddapter( lista);
        rc.setAdapter(adapter);
        LinearLayoutManager llm1 = new LinearLayoutManager(this);
        rc.setLayoutManager(llm1);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button02) {
            Intent intent = new Intent(view.getContext(), Activity2.class);
            startActivity(intent);
        }
    }
}