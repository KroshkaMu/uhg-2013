package tu.kom.uhg;

import tu.kom.uhg.R;

import android.os.Bundle;
import android.view.Menu;
import tu.kom.uhg.GenericActivity;
 
public class MainActivity extends GenericActivity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);		
		mapView(getCurrentFocus());
		
		/*
		Intent intent = new Intent(this, GaterunActivity.class);
        startActivity(intent);
        finish();
        */
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
}
