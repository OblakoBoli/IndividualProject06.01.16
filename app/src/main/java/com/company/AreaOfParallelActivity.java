package com.company;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaOfParallelActivity extends AppCompatActivity implements View.OnClickListener  {
Area parallelogramm =new Area();
TextView textAnswerParall_1;
EditText writerSklad1Parall_1,  writerForSklad2Parall_1;
Button btnAreaOfParall_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_of_parallel);
        textAnswerParall_1=(TextView)findViewById(R.id.textAnswerParall_1);
        writerSklad1Parall_1=(EditText)findViewById(R.id.writerSklad1Parall_1);
        writerForSklad2Parall_1=(EditText)findViewById(R.id.writerForSklad2Parall_1);
        btnAreaOfParall_1=(Button)findViewById(R.id.btnAreaOfParall_1);
        btnAreaOfParall_1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId()) {                // !!!!!!!!! ЕСЛИ ЧТО , ВЫНЕСИ ЗА ПРЕДЕЛЫ СВИТЧА СЧИТЫВАНИЕ И ВЫВОД ОТВЕТА  !!!!!!!!!!
            case R.id.btnAnswerRect1:
                parallelogramm.sklad1= Float.parseFloat(writerSklad1Parall_1.getText().toString());
                parallelogramm.sklad2= Float.parseFloat(writerForSklad2Parall_1.getText().toString());
                parallelogramm.finalArea=(parallelogramm.sklad1*parallelogramm.sklad2);
                textAnswerParall_1.setText((int) parallelogramm.finalArea);
                break;
            /*               Здесь  еще один case  для второй формулы               */
        }
    }

    public class Area {
        float sklad1, sklad2, finalArea;
    }
}
