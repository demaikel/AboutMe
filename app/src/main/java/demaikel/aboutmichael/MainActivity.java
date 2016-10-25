package demaikel.aboutmichael;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton Pedriño = (FloatingActionButton) findViewById(R.id.fab);
        Pedriño.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToContact = new Intent(getApplicationContext(),ContactActivity.class);
                startActivity(goToContact);
            }
        });
    }
}
