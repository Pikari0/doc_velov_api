package com.jcdecaux.vls.service;

import com.jcdecaux.vls.model.Defect;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH'¨\u0006\u000b"}, d2 = {"Lcom/jcdecaux/vls/service/DefectApi;", "", "getAll", "Lio/reactivex/Observable;", "", "Lcom/jcdecaux/vls/model/Defect;", "Lcom/jcdecaux/vls/model/Defects;", "contract", "", "valid", "", "app_LyonProdRelease"}, k = 1, mv = {1, 1, 10})
/* compiled from: DefectApi.kt */
public interface DefectApi {
    @NotNull
    @GET("/contracts/{contract}/defects")
    Observable<List<Defect>> getAll(@NotNull @Path("contract") String str, @Query("valid") boolean z);
}
