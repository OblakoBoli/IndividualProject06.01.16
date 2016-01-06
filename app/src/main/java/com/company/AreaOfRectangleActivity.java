package com.company;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AreaOfRectangleActivity extends AppCompatActivity implements View.OnClickListener {
    Area rectangle = new Area();
    TextView textAnswerRect1;
    EditText writerSklad1Rect1, writerForSklad2Rect1;
    Button btnAnswerRect1;
    /*   объявление второго варика   */



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_of_rectangle);
        textAnswerRect1 = (TextView) findViewById(R.id.textAnswerRect1);
        writerSklad1Rect1 = (EditText) findViewById(R.id.writerSklad1Rect1);
        writerForSklad2Rect1 = (EditText) findViewById(R.id.writerForSklad2Rect1);
        btnAnswerRect1 = (Button) findViewById(R.id.btnAnswerRect1);
        btnAnswerRect1.setOnClickListener(this);

        /*     инициализация второго варика      */



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {                // !!!!!!!!! ЕСЛИ ЧТО , ВЫНЕСИ ЗА ПРЕДЕЛЫ СВИТЧА СЧИТЫВАНИЕ И ВЫВОД ОТВЕТА  !!!!!!!!!!
            case R.id.btnAnswerRect1:
                rectangle.sklad1= Float.parseFloat(writerSklad1Rect1.getText().toString());
                rectangle.sklad2= Float.parseFloat(writerForSklad2Rect1.getText().toString());
                rectangle.finalArea=(rectangle.sklad1*rectangle.sklad2);
                textAnswerRect1.setText((int) rectangle.finalArea);
                break;
            /*               Здесь  еще один case  для второй формулы               */
        }
    }
        public class Area {
        float sklad1, sklad2, finalArea;
    }
    }
