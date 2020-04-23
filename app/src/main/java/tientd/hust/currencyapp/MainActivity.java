package tientd.hust.currencyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    int op1, op2;
    TextView textParent;
    List<String> itemParent;
    Spinner spinner1;
    ArrayAdapter<String> adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_0).setOnClickListener(this);
        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);
        findViewById(R.id.btn_4).setOnClickListener(this);
        findViewById(R.id.btn_5).setOnClickListener(this);
        findViewById(R.id.btn_6).setOnClickListener(this);
        findViewById(R.id.btn_7).setOnClickListener(this);
        findViewById(R.id.btn_8).setOnClickListener(this);
        findViewById(R.id.btn_9).setOnClickListener(this);

        findViewById(R.id.btn_ce).setOnClickListener(this);
        findViewById(R.id.btn_bs).setOnClickListener(this);

        op1=op2=0;
        textParent.setText(String.valueOf(op1));


        itemParent = new ArrayList<>();
        itemParent.add("USA");
        itemParent.add("VND");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itemParent);
        Spinner spinner1 = findViewById(R.id.spinner_currency_1);
        spinner1.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_0)
            addDigit(0);
        else if (id == R.id.btn_1)
            addDigit(1);
        else if (id == R.id.btn_2)
            addDigit(2);
        else if (id == R.id.btn_3)
            addDigit(3);
        else if (id == R.id.btn_4)
            addDigit(4);
        else if (id == R.id.btn_5)
            addDigit(5);
        else if (id == R.id.btn_6)
            addDigit(6);
        else if (id == R.id.btn_7)
            addDigit(7);
        else if (id == R.id.btn_8)
            addDigit(8);
        else if (id == R.id.btn_9)
            addDigit(9);
        else if (id == R.id.btn_ce)
            clearOperand();
        else if (id == R.id.btn_bs)
            removeDigit();
    }
    private void addDigit(int digit) { {
            op1 = op1 * 10 + digit;
            textParent.setText(String.valueOf(op1));
        }
    }
    private void removeDigit() {
            op1 = op1 / 10;
            textParent.setText(String.valueOf(op1));
    }
    private void clearOperand() {
            op1=0;
            textParent.setText(String.valueOf(op1));
    }


}
