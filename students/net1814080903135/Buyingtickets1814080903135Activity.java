package edu.hzuapps.androidlabs.net1814080903135;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Buyingtickets1814080903135Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyingtickets1814080903135);
        Button button = findViewById(R.id.button2);
        final Buyingtickets1814080903135Activity  _this=this;

        setContentView(R.layout.activity_buyingtickets1814080903135);
        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");
        TextView textView = (TextView) findViewById(R.id.RecMes);
        textView.setText(message);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(_this,Queryinterface1814080903135Activity.class);
                _this.startActivity(intent);
            }
        });
    }
}