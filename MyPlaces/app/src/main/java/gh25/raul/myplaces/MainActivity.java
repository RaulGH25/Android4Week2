package gh25.raul.myplaces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;

    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        if(toolbar != null){
            setSupportActionBar(toolbar);
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_world);




        button1 = (ImageButton) findViewById(R.id.buttonPlace1);
        button1.setOnClickListener(this);

        button2 = (ImageButton) findViewById(R.id.buttonPlace2);
        button2.setOnClickListener(this);

        button3 = (ImageButton) findViewById(R.id.buttonPlace3);
        button3.setOnClickListener(this);

        button4 = (ImageButton) findViewById(R.id.buttonPlace4);
        button4.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        // default method for handling onClick Events..
        switch (v.getId()) {

            case R.id.buttonPlace1:
                showMap(1);
                break;

            case R.id.buttonPlace2:
                showMap(2);
                break;

            case R.id.buttonPlace3:
                showMap(3);
                break;

            case R.id.buttonPlace4:
                showMap(4);
                break;

            default:
                break;
        }
    }


    private void showMap(int ubicacionSeleccionada){
        Intent intent = new Intent(this, MapsActivity.class);
        switch (ubicacionSeleccionada){
            case 1:
                intent.putExtra( "latitud", ConstantesLugares.PLACE_1_LAT );
                intent.putExtra( "longitud", ConstantesLugares.PLACE_1_LON );
                intent.putExtra( "name", ConstantesLugares.PLACE_1_NAME );
                break;
            case 2:
                intent.putExtra( "latitud", ConstantesLugares.PLACE_2_LAT );
                intent.putExtra( "longitud", ConstantesLugares.PLACE_2_LON );
                intent.putExtra( "name", ConstantesLugares.PLACE_2_NAME );
                break;
            case 3:
                intent.putExtra( "latitud", ConstantesLugares.PLACE_3_LAT );
                intent.putExtra( "longitud", ConstantesLugares.PLACE_3_LON );
                intent.putExtra( "name", ConstantesLugares.PLACE_3_NAME );
                break;
            case 4:
                intent.putExtra( "latitud", ConstantesLugares.PLACE_4_LAT );
                intent.putExtra( "longitud", ConstantesLugares.PLACE_4_LON );
                intent.putExtra( "name", ConstantesLugares.PLACE_4_NAME );
                break;
        }
        startActivity(intent);
    }

}
