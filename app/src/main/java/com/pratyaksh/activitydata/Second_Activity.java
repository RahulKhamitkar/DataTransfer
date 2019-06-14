package com.pratyaksh.activitydata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Second_Activity extends AppCompatActivity {


    private EditText mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);
        mText = (EditText) findViewById(R.id.ETSendBack);

    }

    public void SendBack(View view){
        // Get the text from the EditText
        String stringToPassBack = mText.getText().toString().trim();

        // Put the String to pass back into an Intent and close this activity
        Intent intent = new Intent();
        intent.putExtra("keyName", stringToPassBack);
        setResult(RESULT_OK, intent);
        finish();
    }
}
