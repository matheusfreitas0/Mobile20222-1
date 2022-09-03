package br.edu.uniritter.mobile.mobile20222_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import br.edu.uniritter.mobile.mobile20222_1.model.User;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private final String TAG = "MainActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button02) {
            Intent intent = new Intent(view.getContext(), Activity2.class);
            startActivity(intent);
        }
    }
}