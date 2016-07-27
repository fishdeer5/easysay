package useractivity;

import com.example.easysay.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LoginActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_login);

	//快速注册点击事件
    Button fast_regist = (Button) findViewById(R.id.fast_regist);
    fast_regist.setOnClickListener(new OnClickListener() {
    	@Override
    	public void onClick(View v) {
    		Intent intent = new Intent(LoginActivity.this, FastRegistActivity.class);
    		startActivity(intent);
    	}
    });
    //找回密码点击事件
    Button find_password = (Button) findViewById(R.id.find_password);
    find_password.setOnClickListener(new OnClickListener() {
    	@Override
    	public void onClick(View v) {
    		Intent intent = new Intent(LoginActivity.this, FindPassword.class);
    		startActivity(intent);
    	}
    });
	}
}
