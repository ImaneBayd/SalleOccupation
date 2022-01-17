package services;

import entities.Creneau;
import entities.Occupation;
import entities.Salle;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface SalleAPI {

    /*@GET("api/occupations/{id}")
    Call<Occupation> find(@Path("id") String id);*/

    @GET("/api/salles/{id}")
    Call<Salle> getSalle(@Path("id")String id);
    @GET("/api/creneaux/{id}")
    Call<Creneau> getCreneau(@Path("id")String id);
    @POST("/api/occupations")
    Call<Occupation> createOccupation(@Body Occupation occupation );
}
