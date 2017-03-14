package com.nombrecompania.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch swt = (Switch) findViewById(R.id.switch_txt);
        Button btn = (Button) findViewById(R.id.btn_txt);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String textoIntroducido = input.getText().toString();
                boolean checked = swt.isChecked();

                if(textoIntroducido.isEmpty()){
                    Toast.makeText(MainActivity.this, "Introduceme algo cabron", Toast.LENGTH_SHORT).show();
                }
                else
                    Intent intent = new Integer(MainActivity.this,)
            }
        }

    }

    //onPause -> Activity a segundo plano
    //
}
