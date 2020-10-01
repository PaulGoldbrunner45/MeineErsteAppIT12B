package berufsschulefresing.paulgoldbrunner.meineersteappit12b;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button red = (Button) findViewById(R.id.button_red);
        Button yellow = (Button) findViewById(R.id.button_gelb);
        Button end = (Button) findViewById(R.id.button_end);
        title = (TextView) findViewById(R.id.textView);
        red.setOnClickListener(this);
        yellow.setOnClickListener(this);
        end.setOnClickListener(this);



    }
    @Override
    public void onClick(View v) {


        Toast.makeText(getApplicationContext(),  "Sie haben einen Button geklickt", Toast.LENGTH_LONG).show();

        switch(v.getId())
        {
            case R.id.button_red:
            title.setBackgroundColor(Color.RED);
            break;
            case R.id.button_gelb:
                title.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.button_end:
                    finish();

        }


    }
}