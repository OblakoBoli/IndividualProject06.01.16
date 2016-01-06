package com.company;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GeometryArea extends AppCompatActivity implements View.OnClickListener {
    Button btnCercl, btnTriangle, btnSqear, btnRect, btnParallel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry_area);
        btnCercl = (Button) findViewById(R.id.btnCercl);
        btnSqear = (Button) findViewById(R.id.btnSqear);
        btnTriangle = (Button) findViewById(R.id.btnTriangle);
        btnRect = (Button) findViewById(R.id.btnRect);
        btnParallel = (Button) findViewById(R.id.btnParallel);
        btnSqear.setOnClickListener(this);
        btnCercl.setOnClickListener(this);
        btnTriangle.setOnClickListener(this);
        btnRect.setOnClickListener(this);
        btnParallel.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSqear:
                Intent intent;
                intent = new Intent(GeometryArea.this, AreaOfSqear.class);
                startActivity(intent);
                break;
            case R.id.btnCercl:
                intent = new Intent(GeometryArea.this, AreaOfCerclActivity.class);
                startActivity(intent);
                break;
            case R.id.btnTriangle:
                 intent = new Intent(GeometryArea.this, AreaOfTriangleActivity.class);
                 startActivity(intent);
                break;
            case R.id.btnRect:
                intent = new Intent(GeometryArea.this, AreaOfRectangleActivity.class);
                startActivity(intent);
                break;
            case R.id.btnParallel:
                intent = new Intent(GeometryArea.this, AreaOfParallelActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
