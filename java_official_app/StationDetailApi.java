package com.jcdecaux.vls.lib.service.station;

import com.jcdecaux.vls.lib.model.station.Station;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH'J(\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH'¨\u0006\f"}, d2 = {"Lcom/jcdecaux/vls/lib/service/station/StationDetailApi;", "", "getStationDetail", "Lio/reactivex/Observable;", "Lcom/jcdecaux/vls/lib/model/station/Station;", "stationId", "", "contract", "", "apiKey", "getStationsList", "", "vls-android-core_release"}, k = 1, mv = {1, 1, 10})
/* compiled from: StationDetailApi.kt */
public interface StationDetailApi {
    @NotNull
    @GET("/vls/v1/stations/{station_id}")
    Observable<Station> getStationDetail(@Path("station_id") long j, @NotNull @Query("contract") String str, @NotNull @Query("apiKey") String str2);

    @NotNull
    @GET("/vls/v1/stations")
    Observable<List<Station>> getStationsList(@NotNull @Query("contract") String str, @NotNull @Query("apiKey") String str2);
}
