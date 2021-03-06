package com.mds.app.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.mds.app.R;

public class MenuPrincipal extends Activity {

	ImageButton busca;
	ImageButton sobre;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_principal);

		busca_addListener();
		sobre_addListener();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private void busca_addListener() {
		busca = (ImageButton) findViewById(R.id.imgbutton_busca);
		busca.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(MenuPrincipal.this, Busca.class);
				startActivity(i);

			}
		});
	}

	private void sobre_addListener() {
		sobre = (ImageButton) findViewById(R.id.imgbutton_sobre);
		sobre.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(MenuPrincipal.this, Sobre.class);
				startActivity(i);

			}
		});
	}

}
