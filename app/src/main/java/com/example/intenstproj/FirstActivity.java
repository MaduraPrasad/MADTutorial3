package com.example.intenstproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity<activity_first> extends AppCompatActivity {
    private Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity_second();
            }
        });
        public void displayToast(View v){
            Toast.makeText(FirstActivity.this,"sending message",Toast.LENGTH_SHORT).show();
        }
    }

    public void openActivity_second(){
        Intent intent = new Intent(this, SecondActivity.class);
        startSecondActivity(intent);
    }

}