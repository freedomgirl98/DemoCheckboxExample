package sg.edu.rp.c346.id19036308.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb;
    Button btnCheck;
    TextView tv;

    private double calcPay(double price, double discount){
        double pay = price * (1-discount/100);
        return pay;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb = findViewById(R.id.checkBoxDiscount);
        btnCheck = findViewById(R.id.buttonCheck);
        tv = findViewById(R.id.textView);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyActivity", "Inside onClick()");
                Toast.makeText(MainActivity.this, "Check being requested", Toast.LENGTH_LONG).show();
                if(cb.isChecked()) {
                    double pay = calcPay(100, 20);
                    tv.setText("The discount is given. You need to pay " + pay);
                }
                else {
                    double pay = calcPay(100, 0);
                    tv.setText("The discount is not given. You need to pay " + pay);
                }




                /* if(cb.isChecked()){
                    tv.setText("Ths discount is given");
                }
                else{
                    tv.setText("Ths discount is not given");
                }
                cb.setChecked(false);
                Toast.makeText(MainActivity.this, "Check being requested", Toast.LENGTH_LONG).show();

                Log.d("CheckboxActivity", "CheckBox status" + cb.isChecked());
                Log.i("MyActivity", "Inside onClick()");

                 */
            }
        });
    }
}
