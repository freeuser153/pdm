package br.pucpcaldas.projeto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Activity2 extends AppCompatActivity {

    Button btTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        btTela = (Button) findViewById(R.id.btBotao);

        btTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Activity1.class);
                startActivity(i);
                overridePendingTransition(R.transition.slide_dir1, R.transition.slide_dir2);
            }
        });

    }
}
