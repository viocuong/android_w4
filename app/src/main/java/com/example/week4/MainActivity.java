package com.example.week4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText a,b;
    private Button btn;
    private Spinner spin;
    private TextView  result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex3_reg);

    }
    private void activity_main(){
        initView();
        String[] st = getResources().getStringArray(R.array.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,st);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double n1 = Double.parseDouble(a.getText().toString());
                    double n2 = Double.parseDouble(b.getText().toString());
                    String x = spin.getSelectedItem().toString();
                    if(x.equals("+")){
                        result.setText("sum = "+(n1+n2));
                    }
                    else if(x.equals("-")){
                        result.setText("sub = "+(n1-n2));
                    }
                    else if(x.equals("*")){
                        result.setText("mul = "+(n1*n2));
                    }
                    else result.setText(("div = ")+(n1/n2));
                }
                catch (Exception e){
                    System.out.println(e);
                }
            }
        });
    }
    private void initView(){
        this.a =findViewById(R.id.a);
        this.b = findViewById(R.id.b);
        this.btn = findViewById(R.id.btnC);
        this.spin = findViewById(R.id.spiner);
        this.result = findViewById(R.id.txtRes);
    }

}