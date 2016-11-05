package me.com;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mLoginButton;
    private EditText mEditText1;
    private EditText mEditText2;
    private TextInputLayout mInputLayout1;
    private TextInputLayout mInputLayout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mLoginButton = (Button) findViewById(R.id.login_button);
        mLoginButton.setOnClickListener(this);

        mEditText1 = (EditText) findViewById(R.id.edit_text1);
        mEditText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                mInputLayout1.setError("");
                mInputLayout1.setHintTextAppearance(R.style.EditTextStatusNormal);
            }
        });

        mEditText2 = (EditText) findViewById(R.id.edit_text2);
        mEditText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                mInputLayout2.setError("");
                mInputLayout2.setHintTextAppearance(R.style.EditTextStatusNormal);
            }
        });

        mInputLayout1 = (TextInputLayout) findViewById(R.id.input_layout1);
        mInputLayout2 = (TextInputLayout) findViewById(R.id.input_layout2);
    }

    @Override
    public void onClick(View view) {
        if (view == mLoginButton) {
            mEditText2.setText("");
            mInputLayout2.setError(getString(R.string.error));
            mInputLayout2.setHintTextAppearance(R.style.EditTextStatusError);
        }
    }

}
