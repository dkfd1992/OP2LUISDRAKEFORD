package luis.drakeford.parcial.facitec.edu.py.op2luisdrakeford;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by LUIS on 09/11/2016.
 */
public interface ServicioInterface {

    @GET("/?s=posts")
    void getMovies(Callback<Result> callback);

}
