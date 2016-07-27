package useractivity;

import com.example.easysay.R;
import com.example.easysay.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FastRegistActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_register);
	}
	
	//注册协议点击事件
	public void clickUserRegistrationProtocol(View view) {
		Intent intent = new Intent(FastRegistActivity.this, ProtocolActivity.class);
		startActivity(intent);
	}

}
