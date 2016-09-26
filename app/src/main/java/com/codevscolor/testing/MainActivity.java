package com.codevscolor.testing;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private Button mLoginButton;
    private EditText mEmailET;
    private EditText mPasswordET;
    private TextView mResultTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLoginButton = (Button) findViewById(R.id.button);
        mEmailET = (EditText) findViewById(R.id.editTextEmail);
        mPasswordET = (EditText) findViewById(R.id.editTextPassword);
        mResultTV = (TextView) findViewById(R.id.textViewResult);
        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mEmailET.getText().toString().equals("codevscolor@gmail.com") && mPasswordET.getText().toString().equals("password"))
                    mResultTV.setText("success");
                else
                    mResultTV.setText("failed");
            }
        });
    }
    public String getName() {
        return null;
    }
    public int getNumber(int n) {
        return 1;
    }
}