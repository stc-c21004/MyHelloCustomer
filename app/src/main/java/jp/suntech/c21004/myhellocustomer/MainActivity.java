package jp.suntech.c21004.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick = findViewById(R.id.btClick);
        HelloListener listener = new HelloListener();//ボタンにリスナを組み込む
        btClick.setOnClickListener(listener);

        Button btClear = findViewById(R.id.btClear);
        btClear.setOnClickListener(listener);

        Button btClear1 = findViewById(R.id.btClear1);
        btClear1.setOnClickListener(listener);
    }

    private class HelloListener implements View.OnClickListener{

        @Override
        public void onClick(View view){
            EditText input = findViewById(R.id.etName);
            EditText input1 = findViewById(R.id.etName1);
            TextView output = findViewById(R.id.tvOutput);
            int id = view.getId();
            switch(id){
                case R.id.btClick:
                    String inputStr = input.getText().toString();
                    String inputStr1 = input1.getText().toString();
                    output.setText(inputStr + "にお住いの"+inputStr1 + "さん、こんにちは！");
                    break;
                case R.id.btClear:
                    input.setText("");
                    String inputStr2 = input1.getText().toString();
                    output.setText("にお住まいの"+inputStr2 + "さん、こんにちは！");
                    break;
                case R.id.btClear1:
                    input1.setText("");
                    String inputStr3 = input.getText().toString();
                    output.setText(inputStr3 + "にお住まいのさん、こんにちは！");
                    break;
            }
        }
    }
}