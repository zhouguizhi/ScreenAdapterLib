package com.test;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void common(View view){
        Intent intent = new Intent(this,CommonActivity.class);
        startActivity(intent);
    }
    public void high_efficiency(View view){
        Intent intent = new Intent(this,HighEfficiencyActivity.class);
        startActivity(intent);
    }
}

