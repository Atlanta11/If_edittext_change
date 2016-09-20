package enterprise.sample.com.if_edittext_change;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText yourEditText;
    TextView value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView value1 = (TextView) findViewById(R.id.value);
        final TextView value2 = (TextView) findViewById(R.id.textView);
        final TextView value3 = (TextView) findViewById(R.id.textView2);
        yourEditText = (EditText) findViewById(R.id.yourEditTextId);

        yourEditText.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) { value1.setText(yourEditText.getText()+" AfterTextChanged");

                // you can call or do what you want with your EditText here
               // yourEditText. ...

            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                value2.setText(yourEditText.getText()+" beforeTextChanged");
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                value3.setText(yourEditText.getText()+" Command:onTextChanged");
            }
        });
    }
}
