package kr.hs.emirim.s2019s05.mirimintenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    TextView result;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        String re ;
        back = findViewById(R.id.back);
        back.setOnClickListener(btnBack);
        result = findViewById(R.id.result);

        Intent intent = getIntent();
        String op = intent.getStringExtra("op");
        int a = intent.getIntExtra("a",0);
        int b = intent.getIntExtra("b",0);

        switch (op){
            case "+":
                result.append(a+"+"+b+"="+(a+b));
                break;
            case "-":
                result.append(a+"-"+b+"="+(a-b));
                break;
            case "/":
                result.append(a+"/"+b+"="+(a/b));
                break;
            case "*":
                result.append(a+"*"+b+"="+(a*b));
                break;
        }


    }
    View.OnClickListener btnBack = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
}