package com.jcdecaux.vls.service;

import com.jcdecaux.vls.model.Rate;
import com.jcdecaux.vls.model.Rating;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H'J6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH'¨\u0006\u000f"}, d2 = {"Lcom/jcdecaux/vls/service/BikeApi;", "", "getRating", "Lio/reactivex/Observable;", "", "Lcom/jcdecaux/vls/model/Rating;", "Lcom/jcdecaux/vls/model/Ratings;", "contract", "", "bikeIds", "", "rate", "Lcom/jcdecaux/vls/model/Rate;", "email", "tripId", "app_LyonProdRelease"}, k = 1, mv = {1, 1, 10})
/* compiled from: BikeApi.kt */
public interface BikeApi {
    @NotNull
    @GET("/contracts/{contract}/bikes/ratings")
    Observable<List<Rating>> getRating(@NotNull @Path("contract") String str, @NotNull @Query("id") List<Long> list);

    @NotNull
    @POST("/contracts/{contract}/accounts/{email}/trips/{tripId}/rate")
    Observable<Rate> rate(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @Path("tripId") long j, @NotNull @Body Rate rate);
}
