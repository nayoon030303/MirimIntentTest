package kr.hs.emirim.s2019s05.mirimintenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText input1, input2;
    RadioGroup group;
    RadioButton plus,minus,mul,div;
    Intent intent;
    int a=0;
    int b=0;
    String op;

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        group = findViewById(R.id.group);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(btnListener);




    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            intent = new Intent(getApplicationContext(), Result.class);
            switch (group.getCheckedRadioButtonId()) {
                case R.id.plus:
                    op = "+";
                    break;
                case R.id.minu:
                    op = "-";
                    break;
                case R.id.multi:
                    op = "*";
                    break;
                case R.id.div:
                    op = "/";
                    break;
            }
            intent.putExtra("op",op);

            a = Integer.parseInt(input1.getText().toString());
            b = Integer.parseInt(input2.getText().toString());
            intent.putExtra("a",a);
            intent.putExtra("b",b);
            startActivity(intent);

        }
    };
}