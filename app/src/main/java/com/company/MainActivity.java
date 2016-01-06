package com.company;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btnGeometry, btnPhysics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        btnPhysics =(Button)findViewById(R.id.btnGeometry);
        btnGeometry =(Button)findViewById(R.id.btnPhysics);
        btnGeometry.setOnClickListener(this);
        btnPhysics.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnGeometry:
                Intent intent;
                intent = new Intent(MainActivity.this, GeometryActivity.class);
                startActivity(intent);
            break;
            case R.id.btnPhysics:
/*                intent = new Intent(MainActivity.this, PhysicsActivity.class);
                startActivity(intent);*/
                break;
        }
    }
}