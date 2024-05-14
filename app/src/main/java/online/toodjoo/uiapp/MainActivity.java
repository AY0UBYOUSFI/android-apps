package online.toodjoo.uiapp;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText T1;
    EditText T2;
    RadioGroup R1;
    RadioButton B1;
    RadioButton B2;
    RadioButton B3;

    TextView Result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        T1 = findViewById(R.id.Number1);
        T2 = findViewById(R.id.Number2);
        R1 = findViewById(R.id.radiogroup1);
        B1 = findViewById(R.id.add);
        B2 = findViewById(R.id.sub);
        B3 = findViewById(R.id.mult);
        Result = findViewById(R.id.result);




            //operation additon and substraction and multiplication

            B1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked && !T1.getText().toString().isEmpty() && !T2.getText().toString().isEmpty()) {
                        double V1 = Double.parseDouble(T1.getText().toString());
                        double V2 = Double.parseDouble(T2.getText().toString());
                        Result.setText("result : " + add_tow_numbers(V1, V2));
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"empty filed !",Toast.LENGTH_LONG).show();
                    }
                }
            });
            B2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked && !T1.getText().toString().isEmpty() && !T2.getText().toString().isEmpty()) {
                        double V1 = Double.parseDouble(T1.getText().toString());
                        double V2 = Double.parseDouble(T2.getText().toString());
                        Result.setText("result : " + sub_tow_numbers(V1, V2));
                    }else{
                        Toast.makeText(getApplicationContext(),"empty filed !",Toast.LENGTH_LONG).show();
                    }
                }
            });
            B3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked && !T1.getText().toString().isEmpty() && !T2.getText().toString().isEmpty()) {
                        double V1 = Double.parseDouble(T1.getText().toString());
                        double V2 = Double.parseDouble(T2.getText().toString());
                        Result.setText("result : " + mult_tow_numbers(V1, V2));
                    }else{
                        Toast.makeText(getApplicationContext(),"empty filed !",Toast.LENGTH_LONG).show();
                    }
                }
            });


        }






    private double add_tow_numbers ( double number1, double number2){
        return number1 + number2;
    }
    private double sub_tow_numbers ( double number1, double number2){
        return number1 - number2;
    }
    private double mult_tow_numbers ( double number1, double number2){
        return number1 * number2;
    }
}

