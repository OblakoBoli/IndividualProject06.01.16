package com.company;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaOfTriangleActivity extends AppCompatActivity implements View.OnClickListener {
Area triangle = new Area();
TextView textAnswerTriangle1;
EditText writerForTriangle1, writerOsnovOfTriangle;
Button btnAreaOfTriangle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_of_triangle);
        textAnswerTriangle1=(TextView)findViewById(R.id.textAnswerTriangle1);
        writerForTriangle1=(EditText)findViewById(R.id.writerForTriangle1);
        writerOsnovOfTriangle=(EditText)findViewById(R.id.writerOsnovOfTriangle);
        btnAreaOfTriangle=(Button)findViewById(R.id.btnAreaOfTriangle);
        btnAreaOfTriangle.setOnClickListener(this);

    }

    @Override    // подсчет через основание и высоту
    public void onClick(View v) {
        triangle.sklad1 = Float.parseFloat(writerForTriangle1.getText().toString());
        triangle.sklad2 = Float.parseFloat(writerOsnovOfTriangle.getText().toString());
        triangle.finalArea = (triangle.sklad1*triangle.sklad2)/2;
        textAnswerTriangle1.setText((int) triangle.finalArea);
    }


    public class Area {
        float sklad1, sklad2,sklad3,  finalArea;
    }
}
