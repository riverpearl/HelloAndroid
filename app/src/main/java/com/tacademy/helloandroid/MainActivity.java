package com.tacademy.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

        btn = (Button)findViewById(R.id.btn_toast);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String text = getResources().getString(R.string.toast_message);
                //Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, R.string.toast_message, Toast.LENGTH_SHORT).show(); //위 코드보다 이 형태로 더 많이 쓰임
            }
        });

        btn = (Button)findViewById(R.id.btn_google);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(intent);
            }
        });

        btn = (Button)findViewById(R.id.btn_dial);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-5121-5262")); //전화를 바로 걸게 하려면 ACTION_CALL -> 얘는 permission 필요
                startActivity(intent);
            }
        });
    }
}
