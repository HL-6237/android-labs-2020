package edu.hzuapps.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GetReward extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_reward);

        Button button = (Button) findViewById(R.id.button_return);
        button.setX(450f);
        button.setY(1100f);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(GetReward.this,Net1814080903104Activity.class);
                GetReward.this.startActivity(intent);
            }
        });
    }
}