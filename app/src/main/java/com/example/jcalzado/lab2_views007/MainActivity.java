package com.example.jcalzado.lab2_views007;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int randomNumber = (int) (Math.random()*100000+1);
    private EditText inText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inText = (EditText) findViewById(R.id.inText);

        // Mostramos el Toast con el número aleatorio.
        Toast toastRandomNumber = Toast.makeText(this, String.valueOf(randomNumber), Toast.LENGTH_SHORT);
        toastRandomNumber.show();
    }

    public void controlar (View v) {
        int userNumber = Integer.parseInt(inText.getText().toString());
        String result = "";
        if (userNumber == randomNumber) {
            result = "¡Felicidades, ha acertado!";
        } else {
            result = "Lo sentimos, vuelva a intentarlo.";
        }
        Toast toastResult = Toast.makeText(this, result, Toast.LENGTH_LONG);
        toastResult.show();

    }
}
