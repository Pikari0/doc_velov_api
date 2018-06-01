package com.jcdecaux.vls.lib.service.station;

import com.jcdecaux.vls.lib.model.station.StationDetail;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'¨\u0006\t"}, d2 = {"Lcom/jcdecaux/vls/lib/service/station/StationListBikeApi;", "", "get", "Lio/reactivex/Observable;", "Lcom/jcdecaux/vls/lib/model/station/StationDetail;", "contract", "", "station_id", "", "vls-android-core_release"}, k = 1, mv = {1, 1, 10})
/* compiled from: StationListBikeApi.kt */
public interface StationListBikeApi {
    @NotNull
    @GET("/contracts/{contract}/stations/{station_id}")
    Observable<StationDetail> get(@NotNull @Path("contract") String str, @Path("station_id") long j);
}
