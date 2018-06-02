package com.jcdecaux.vls.service;

import com.jcdecaux.vls.model.Campaign;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u000b"}, d2 = {"Lcom/jcdecaux/vls/service/CampaignApi;", "", "get", "Lio/reactivex/Observable;", "Lcom/jcdecaux/vls/model/Campaign;", "contract", "", "id", "", "getAll", "", "app_LyonProdRelease"}, k = 1, mv = {1, 1, 10})
/* compiled from: CampaignApi.kt */
public interface CampaignApi {
    @NotNull
    @GET("/contracts/{contract}/campaigns/{id}")
    Observable<Campaign> get(@NotNull @Path("contract") String str, @Path("id") long j);

    @NotNull
    @GET("/contracts/{contract}/campaigns")
    Observable<List<Campaign>> getAll(@NotNull @Path("contract") String str);
}
