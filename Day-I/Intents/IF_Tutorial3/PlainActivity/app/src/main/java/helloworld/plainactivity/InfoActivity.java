package helloworld.plainactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {
    private final String TAG = "InfoActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        TextView infotext = (TextView) findViewById(R.id.textView5);
        Bundle b = getIntent().getExtras();
        Log.v(TAG, "Name: "+ b.getString("Name") + "\n" +
                "Address:" +  b.getString("Address") + "\n" +
                "Phone: " +  b.getString("Phone") + "\n" +
                "School: " +  b.getString("School"));
        infotext.setText("Name: " + getIntent().getStringExtra("Name") + "\n \n" +
                "Address:" +  getIntent().getStringExtra("Address") + "\n \n" +
                "Phone: " +  getIntent().getStringExtra("Phone") + "\n \n" +
                "School: " +  getIntent().getStringExtra("School"));

        boolean mAndroid = b.getBoolean("UserLikeAndroid");

        if(mAndroid)
            infotext.append("\n \n" + b.getString("Name") + " likes Android ;)");
        else
            infotext.append("\n \n" + b.getString("Name") + " does not like Android :(");

    }
}
