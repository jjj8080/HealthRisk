package com.example.android.effectivenavigation;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
//
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

/**
 * Created by boyang on 05/03/15.
 */
public class RegisterActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getActionBar().setCustomView(R.layout.abs_layout);
        setContentView(R.layout.registrationpage);
        TextView textView = (TextView)findViewById(R.id.returntologin);
        textView.setOnClickListener(new View.OnClickListener()
        { public void onClick(View v)
            {
                Intent register = new Intent(RegisterActivity.this, LoginActivity.class);
                RegisterActivity.this.startActivity(register);
            }
        });
    }
}




