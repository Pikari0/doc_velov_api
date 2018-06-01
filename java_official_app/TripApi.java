package com.jcdecaux.vls.lib.service.trip;

import com.jcdecaux.vls.lib.model.trip.Trip;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H'J2\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u000bH'¨\u0006\f"}, d2 = {"Lcom/jcdecaux/vls/lib/service/trip/TripApi;", "", "get", "Lio/reactivex/Observable;", "", "Lcom/jcdecaux/vls/lib/model/trip/Trip;", "contract", "", "email", "getTripsSubscription", "kiwiId", "", "vls-android-core_release"}, k = 1, mv = {1, 1, 10})
/* compiled from: TripApi.kt */
public interface TripApi {
    @NotNull
    @GET("/contracts/{contract}/accounts/{email}/trips")
    Observable<List<Trip>> get(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2);

    @NotNull
    @GET("/contracts/{contract}/accounts/{email}/subscriptions/{kiwiId}/trips")
    Observable<List<Trip>> getTripsSubscription(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @Path("kiwiId") long j);
}
