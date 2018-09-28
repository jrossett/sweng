package ch.epfl.sweng.bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class GreetingActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.greeting_activity);
        Intent intent = getIntent();
        String msg = "Hello " + intent.getStringExtra("name") + "!";
        TextView text = findViewById(R.id.greetingMessage);
        text.setText(msg);
    }
}
