package edu.amherst.amherstapp3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Hutomo Limanto on 2/12/2017.
 */

public class DiningActivity extends AppCompatActivity {
    public void launchBreakfast(View view){
        Intent intent = new Intent(this,BreakfastActivity.class);
        startActivity(intent);
    }
    public void launchLunch(View view){
        Intent intent = new Intent(this,LunchActivity.class);
        startActivity(intent);
    }
    public void launchDinner(View view){
        Intent intent = new Intent(this,DinnerActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dining);
}}
