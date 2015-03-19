package com.example.android.effectivenavigation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
/**
 * Created by boyang on 11/03/15.
 */
public class MedicalFormActivity extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicalform);
        RadioButton btn = (RadioButton) findViewById(R.id.symptoms0);
        btn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                //Intent intent = new Intent(getApplicationContext(), MedicalFormActivity2.class);
                //startActivity(intent);
            }
        });
    }
}
