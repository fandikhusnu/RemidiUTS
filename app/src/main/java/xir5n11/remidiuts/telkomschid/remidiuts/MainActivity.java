package xir5n11.remidiuts.telkomschid.remidiuts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSwipe, btnTab, btnSpinner, btnDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSwipe = (Button) findViewById(R.id.buttonSwipe);
        btnTab = (Button) findViewById(R.id.buttonTab);
        btnSpinner = (Button) findViewById(R.id.buttonSpinner);
        btnDrawer = (Button) findViewById(R.id.buttonDrawer);

        findViewById(R.id.buttonSwipe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SwipeActivity.class));
            }
        });

        findViewById(R.id.buttonTab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TabActivity.class));
            }
        });

        findViewById(R.id.buttonSpinner).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SpinnerActivity.class));
            }
        });

        findViewById(R.id.buttonDrawer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DrawerActivity.class));
            }
        });
    }
}
