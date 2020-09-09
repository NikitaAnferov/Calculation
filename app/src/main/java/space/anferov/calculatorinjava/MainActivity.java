package space.anferov.calculatorinjava;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    TextView result_text = findViewById(R.id.result_text);
    TextView match_operation = findViewById(R.id.math_operation);

    int [] btn_id = new int[] {R.id.btn_0, R.id.btn_1, R.id.btn_2, R.id.btn_3, R.id.btn_4,
            R.id.btn_5, R.id.btn_6, R.id.btn_7, R.id.btn_8, R.id.btn_9, R.id.btn_minus, R.id.btn_plus,
            R.id.btn_slash, R.id.btn_multiplication, R.id.btn_left_parenthesis, R.id.btn_right_parenthesis,
            R.id.btn_ac, R.id.btn_back, R.id.btn_equal};

    TextView [] textView_array = new TextView[18];







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        OnClickListener onClickListener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_0: setTextFiled("0"); break;
                    case R.id.btn_1: setTextFiled("1"); break;
                    case R.id.btn_2: setTextFiled("2"); break;
                    case R.id.btn_3: setTextFiled("3"); break;
                    case R.id.btn_4: setTextFiled("4"); break;
                    case R.id.btn_5: setTextFiled("5"); break;
                    case R.id.btn_6: setTextFiled("6"); break;
                    case R.id.btn_7: setTextFiled("7"); break;
                    case R.id.btn_8: setTextFiled("8"); break;
                    case R.id.btn_9: setTextFiled("9"); break;

                    case R.id.btn_minus: setTextFiled("-"); break;
                    case R.id.btn_plus: setTextFiled("+"); break;
                    case R.id.btn_slash: setTextFiled("/"); break;
                    case R.id.btn_multiplication: setTextFiled("*"); break;
                    case R.id.btn_left_parenthesis: setTextFiled("("); break;
                    case R.id.btn_right_parenthesis: setTextFiled(")"); break;

                    case R.id.btn_ac:
                        match_operation.setText("");
                        result_text.setText("");
                        break;

                    case R.id.btn_back:
                        String str = match_operation.getText().toString();
                        if(str != null) {
                            match_operation.setText(str.substring(0, str.length() - 1));
                        }
                        result_text.setText("");
                        break;
                }
            }
        };



        for(int i = 0 ; i < textView_array.length; i++) {
            textView_array[i] = findViewById(btn_id[i]);
            textView_array[i].setOnClickListener(onClickListener);
        }

    }





    private void setTextFiled(String str) {
        if(result_text.getText() != null) {
            match_operation.setText(result_text.getText());
            result_text.setText("");
        }
        match_operation.append(str);

    }


}


