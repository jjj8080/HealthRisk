package com.example.android.effectivenavigation;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;


/**
 * Created by boyang on 05/03/15.
 */
public class LoginActivity extends Activity {

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);
        TextView textView = (TextView)findViewById(R.id.registrationpage);
        textView.setOnClickListener(new View.OnClickListener()
        { public void onClick(View v)
            {
                Intent register = new Intent(LoginActivity.this, RegisterActivity.class);
            LoginActivity.this.startActivity(register);
        }
        });
    }

}
