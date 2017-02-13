package edu.amherst.amherstapp3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Hutomo Limanto on 2/12/2017.
 */

public class ActivityA extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);}

    public void launchDining(View view) {
        Intent intent = new Intent(this, DiningActivity.class);
        startActivity(intent);
    }
}

