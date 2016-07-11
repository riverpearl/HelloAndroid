package com.tacademy.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputView;
    TextView messageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //객채를 얻어오려면 setContentView 다음에 얻어올 수 있다.

        inputView = (EditText)findViewById(R.id.edit_input);
        messageView = (TextView)findViewById(R.id.text_message);

        Button btn = (Button)findViewById(R.id.btn_send);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = inputView.getText().toString();
                messageView.setText(text);
            }
        });
    }
}
