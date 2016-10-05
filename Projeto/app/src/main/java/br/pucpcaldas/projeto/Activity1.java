package br.pucpcaldas.projeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {
    private Button btTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

        btTela = (Button) findViewById(R.id.btBotao);

        btTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Activity2.class);
                startActivity(i);
                overridePendingTransition(R.transition.slide_esq1, R.transition.slide_esq2);
            }
        });
    }
}
