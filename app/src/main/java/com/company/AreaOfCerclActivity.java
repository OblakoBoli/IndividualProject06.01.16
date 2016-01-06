package com.company;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaOfCerclActivity extends AppCompatActivity implements View.OnClickListener {
Area cercl = new Area();
EditText writerForCercl;
TextView textAnswerCercl;
Button btnAreaOfCercl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_of_cercl);
        writerForCercl=(EditText)findViewById(R.id.writerForCercl);
        textAnswerCercl=(TextView)findViewById(R.id.textAnswerCercl);
        btnAreaOfCercl=(Button)findViewById(R.id.btnAreaOfCercl);
        btnAreaOfCercl.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        cercl.sklad1 = Float.parseFloat(writerForCercl.getText().toString());
        cercl.finalArea = (float) (cercl.sklad1*cercl.sklad1 * 3.14);
        textAnswerCercl.setText((int) cercl.finalArea);
    }


    public class Area {
        float sklad1,  finalArea;
    }
}
