package luis.drakeford.parcial.facitec.edu.py.op2luisdrakeford;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {


    ListView ServicioListView;

    ImageView avatarImageView;
    TextView textoTextView;
    TextView nombreTexView;
    Boolean faborite;
    ModeloDao modeloDao;
    List<String> modelo = new ArrayList<String>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ServicioListView = (ListView) findViewById(R.id.listViewServicio);






        RestAdapter restAdapter = new RestAdapter
                .Builder()
                .setEndpoint ("http://servidor-monkydevs.rhcloud.com")
                .build();
        ServicioInterface servicio  = restAdapter.create(ServicioInterface.class);
        servicio.getMovies(new Callback<Result>() {
            @Override
            public void success(Result result, Response response) {
                Log.i("RESULT", result.toString());
                ServicioAdapter adapter = new ServicioAdapter(result.Search,getApplicationContext());
                ServicioListView.setAdapter(adapter);


            }



            @Override
            public void failure(RetrofitError error) {
                Log.e("RESULTADO", error.getMessage());
                Toast.makeText(getApplicationContext(),error.getLocalizedMessage(),Toast.LENGTH_LONG).show();

            }
        });




    }
}
