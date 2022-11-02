package com.example.lab5_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ButtonClicked(View view) {
       Toast MyToast = Toast.makeText(getApplicationContext(), "Ура сообщения работают", Toast.LENGTH_SHORT);
                MyToast.show();



    }
    public void ButtonClickedZeus(View view) {
        Toast Zeus = Toast.makeText(getApplicationContext(), "Вы выбрали зевса", Toast.LENGTH_SHORT);
        Zeus.show();
    }
    public void ButtonClickedSimple(View view) {
        Toast Simple = Toast.makeText(getApplicationContext(), "Вы выбрали симпла", Toast.LENGTH_SHORT);
        Simple.show();
    }
    public void ButtonClickedMonesy(View view) {
        Toast monesy = Toast.makeText(getApplicationContext(), "Вы выбрали монеси", Toast.LENGTH_SHORT);
        monesy.show();
    }


}