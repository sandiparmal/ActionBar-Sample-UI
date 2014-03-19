/**
 * Sample Android Application
 * Application Name:- ActionBar Sample UI only
 * @author Sandy
 */
package com.sandip.actionbar;


import info.androidhive.actionbar.R;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity implements
		ActionBar.OnNavigationListener {

	/** Action bar */
	private ActionBar actionBar;

	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/** initialize action bar */
		/** getActionBAr() Retrieve a reference to this activity's ActionBar. */
		actionBar = getActionBar();

		/** show title on action bar true or false */
		actionBar.setDisplayShowTitleEnabled(true);
		
		/** set title to action bar */
		actionBar.setTitle("We're here ");
		

		

		
	}
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
		/** menu which we are showing on Action bar */
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main_actions, menu);
 
        return super.onCreateOptionsMenu(menu);
    }
	
	/**
	 * On selecting action bar icons
	 * */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		/** take appropriate action for each action bar menu */
		switch (item.getItemId()) {
		case R.id.action_option:
			Toast.makeText(MainActivity.this, "Pressed "+item.getTitle(), Toast.LENGTH_SHORT).show();
			return true;
		case R.id.action_play:
			Toast.makeText(MainActivity.this, "Pressed "+item.getTitle(), Toast.LENGTH_SHORT).show();
			return true;
		case R.id.action_watch:	
			Toast.makeText(MainActivity.this, "Pressed "+item.getTitle(), Toast.LENGTH_SHORT).show();
			return true;
		
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	
	
	/**
	 * Actionbar navigation item select listener
	 */
	@Override
	public boolean onNavigationItemSelected(int itemPosition, long itemId) {		
		return false;
	}


	
}
