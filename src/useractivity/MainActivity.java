package useractivity;

import com.example.easysay.R;
import com.example.easysay.R.id;
import com.example.easysay.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


public class MainActivity extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_user);
        
      //µÇÂ¼µã»÷ÊÂ¼þ
        Button login_button = (Button) findViewById(R.id.login_button);
        login_button.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View v) {
        		Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        		startActivity(intent);
        	}
        });
    }

}
