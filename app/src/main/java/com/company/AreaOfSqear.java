package com.company;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaOfSqear extends AppCompatActivity implements View.OnClickListener {
    // ДЛЯ МЕНЮ
    final int MENU_RESET_ID = 1;


    TextView answerArea;
    EditText writerForSqr;
    Button btnAreaSqr;

    // Второй вариант через диагонали
    TextView textAnswer;
    EditText writerForSqrSecond;
    Button btnAreaOfSqrTwo;

    Area sqear = new Area();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_of_sqear);
        answerArea = (TextView) findViewById(R.id.answerArea);
        writerForSqr = (EditText) findViewById(R.id.writerForSqr);
        btnAreaSqr = (Button) findViewById(R.id.btnAreaOfSqr);
        btnAreaSqr.setOnClickListener(this);

        // инициализация второго варика
        textAnswer = (TextView) findViewById(R.id.textAnswer);
        writerForSqrSecond = (EditText) findViewById(R.id.writerForSqrSecond);
        btnAreaOfSqrTwo = (Button) findViewById(R.id.btnAreaOfSqrTwo);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {                // !!!!!!!!! ЕСЛИ ЧТО , ВЫНЕСИ ЗА ПРЕДЕЛЫ СВИТЧА СЧИТЫВАНИЕ И ВЫВОД ОТВЕТА  !!!!!!!!!!
            case R.id.btnAreaOfSqr:
                sqear.sklad1 = Float.parseFloat(writerForSqr.getText().toString());
                sqear.finalArea = sqear.sklad1 * sqear.sklad1;
                answerArea.setText((int) sqear.finalArea);
                break;
            case R.id.btnAreaOfSqrTwo:
                sqear.sklad2 = Float.parseFloat(writerForSqrSecond.getText().toString());
                sqear.finalArea = (sqear.sklad2*sqear.sklad2)/2;
                answerArea.setText((int) sqear.finalArea);
                break;
            }
        }
    // создание меню
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// TODO Auto-generated method stub
        menu.add(0, MENU_RESET_ID, 0, "Reset");

        return super.onCreateOptionsMenu(menu);
    }
    // обработка нажатий на пункты меню
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
// TODO Auto-generated method stub
        switch (item.getItemId()) {
            case MENU_RESET_ID:
// очищаем поля
                writerForSqr.setText("");
                writerForSqrSecond.setText("");
                textAnswer.setText("");
                answerArea.setText("");
                break;
        }
        return super.onOptionsItemSelected(item);
    }




    public class Area {
        float sklad1, sklad2, finalArea;
    }
}
