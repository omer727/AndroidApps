package com.simpleform;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	View.OnClickListener onClick = new View.OnClickListener(){

		@Override
		public void onClick(View v) {
			EditText name = (EditText)v.findViewById(R.id.name);
			EditText address = (EditText)v.findViewById(R.id.address);
			new Rest(name.getText(),address.getText());
		}
		
		
	};
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
    
}
