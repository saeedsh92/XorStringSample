package com.shahini.securestringsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String RSA_KEY="MIHNMA0GCSqGSIb3DQEBAQUAA4G7ADCBtwKBrwC9gD8M7qUTrwRc1YrjFtNz8gcjxFJvJ6QH+oji3/rr1sfy+k0gYtXzmyQN9YEGmO8mA2xXwowPOt8lGT24D/e1Km2GaJvDFQIo/yInnHyQuihhmXU8twRmVkUPktlj0u7gnN0l+c6wH6sxOGQ+r6VL2vvtg0QrQkzYY5Mtt6Auoopfsaz7i41Ow9A5poLnUOU2LkejkfMrlygFeIO2XDGFVJAsU23bu4ZuWjmaoFkCAwEAAQ==";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView input=(EditText)findViewById(R.id.textview_input);
        TextView output=(TextView)findViewById(R.id.textview_output);
        input.setText(RSA_KEY);
        output.setText(performXorOperation(RSA_KEY,0x27));
    }
    private static String performXorOperation(String s, int i) {
        char[] chars = s.toCharArray();
        for(int j = 0; j<chars.length; j++)
            chars[j] = (char)(chars[j] ^ i);
        return String.valueOf(chars);
    }
}
