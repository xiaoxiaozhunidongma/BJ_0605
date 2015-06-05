package com.biju.login;

import com.biju.BaseActivity;
import com.biju.MainActivity;
import com.biju.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;

public class LoginActivity extends BaseActivity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		initUI();
	}

	private void initUI() {
		findViewById(R.id.Login_OK).setOnClickListener(this);
		findViewById(R.id.Login_registered).setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.Login_OK:
			Login_OK();
			break;
		case R.id.Login_registered:
			Login_registered();
			break;
		default:
			break;
		}
	}

	private void Login_registered() {
		Intent intent=new Intent(LoginActivity.this, RegisteredActivity.class);
		startActivity(intent);
	}

	private void Login_OK() {
		Intent intent=new Intent(LoginActivity.this, MainActivity.class);
		startActivity(intent);
	}

	@Override
	public void Response() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ErrorResponse() {
		// TODO Auto-generated method stub
		
	}


}
