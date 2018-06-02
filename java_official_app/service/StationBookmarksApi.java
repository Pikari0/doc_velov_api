package com.jcdecaux.vls.service;

import com.jcdecaux.vls.lib.model.station.StationDetail;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
import retrofit2.http.Path;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\nH'J2\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\nH'J3\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H'¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/jcdecaux/vls/service/StationBookmarksApi;", "", "addStationBookmarks", "Lio/reactivex/Observable;", "Lretrofit2/Response;", "Ljava/lang/Void;", "contract", "", "email", "stationId", "", "deleteStationBookmarks", "getStationBookmarks", "", "Lcom/jcdecaux/vls/lib/model/station/StationDetail;", "body", "", "(Ljava/lang/String;[Ljava/lang/Long;)Lio/reactivex/Observable;", "app_LyonProdRelease"}, k = 1, mv = {1, 1, 10})
/* compiled from: StationBookmarksApi.kt */
public interface StationBookmarksApi {
    @NotNull
    @POST("/contracts/{contract}/accounts/{email}/stationbookmarks/{stationId}/")
    Observable<Response<Void>> addStationBookmarks(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @Path("stationId") long j);

    @NotNull
    @DELETE("/contracts/{contract}/accounts/{email}/stationbookmarks/{stationId}/")
    Observable<Response<Void>> deleteStationBookmarks(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @Path("stationId") long j);

    @NotNull
    @POST("/contracts/{contract}/stations")
    Observable<List<StationDetail>> getStationBookmarks(@NotNull @Path("contract") String str, @NotNull @Body Long[] lArr);
}
