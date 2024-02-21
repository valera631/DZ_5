package com.example.myapplication;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private int clickCount = 0;
    private TextView textView;

    private TextView textView_2;
    private EditText editText;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount++;
                textView.setText(Integer.toString(clickCount));
            }
        });

        textView_2 = findViewById(R.id.textView2);
        editText = findViewById(R.id.editTextText);
        button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();
                if (!name.isEmpty()) {
                    textView_2.setText("Привет " + name + "!");
                }
            }
        });
    }


}
