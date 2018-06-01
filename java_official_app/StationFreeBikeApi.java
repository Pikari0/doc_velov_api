package com.jcdecaux.vls.lib.service.station;

import com.jcdecaux.vls.lib.model.station.StationBorn;
import com.jcdecaux.vls.lib.model.station.StationFreeBikeResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH'¨\u0006\f"}, d2 = {"Lcom/jcdecaux/vls/lib/service/station/StationFreeBikeApi;", "", "freeBikeStation", "Lio/reactivex/Observable;", "Lcom/jcdecaux/vls/lib/model/station/StationFreeBikeResponse;", "contractName", "", "accountEmail", "kiwiId", "", "stationBorn", "Lcom/jcdecaux/vls/lib/model/station/StationBorn;", "vls-android-core_release"}, k = 1, mv = {1, 1, 10})
/* compiled from: StationFreeBikeApi.kt */
public interface StationFreeBikeApi {
    @NotNull
    @POST("/contracts/{contractName}/accounts/{accountEmail}/subscriptions/{kiwiId}/trips")
    Observable<StationFreeBikeResponse> freeBikeStation(@NotNull @Path("contractName") String str, @NotNull @Path("accountEmail") String str2, @Path("kiwiId") long j, @NotNull @Body StationBorn stationBorn);
}
