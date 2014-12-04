package com.example.sample1;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.fragment_main);
        /*if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }*/
        
       Button button = (Button) findViewById(R.id.submit1);
       System.out.println("uname"+findViewById(R.id.uname).toString());
       
       System.out.println("button"+button);
        button.setOnClickListener(new View.OnClickListener() {
        	@Override
            public void onClick(View v) {
                // Perform action on click
            	String uname = ((TextView)findViewById(R.id.uname)).getText().toString();
            	String pwd = ((TextView)findViewById(R.id.password)).getText().toString();
            	//String uname_fin = login.login(uname,pwd);
            	//System.out.println(uname_fin);
            	Intent launchactivity= new Intent(MainActivity.this,login.class); 
            	launchactivity.putExtra("uname", uname);
                startActivity(launchactivity); 
            }
        });
    }

    
    //@Override
   /* public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    	System.out.println("inside createview");
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        Button buttonClick = (Button) view.findViewById(R.id.submit1);
        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // onButtonClick((Button) view);
            }

        });

        return view;
    }*/
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
