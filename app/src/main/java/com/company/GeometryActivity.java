package com.company;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GeometryActivity extends AppCompatActivity implements View.OnClickListener {
Button btnAreaActivity, btnPerimeterActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry);
        btnPerimeterActivity=(Button)findViewById(R.id.btnPerimeterActivity);
        btnAreaActivity=(Button)findViewById(R.id.btnAreaActivity);
        btnAreaActivity.setOnClickListener(this);
        btnPerimeterActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnAreaActivity:
                Intent intent;
                intent = new Intent(GeometryActivity.this, GeometryArea.class);
                startActivity(intent);
            break;
            case  R.id.btnPerimeterActivity:
/*                intent = new Intent(GeometryActivity.this, GeometryPerimeter.class);
                startActivity(intent);*/
            break;


        }
    }
}
