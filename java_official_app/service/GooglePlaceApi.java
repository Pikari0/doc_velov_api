package com.jcdecaux.vls.service;

import com.jcdecaux.vls.model.GooglePlaceAPIResults;
import com.jcdecaux.vls.model.GooglePlaceDetail;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'JT\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0006H'¨\u0006\u0010"}, d2 = {"Lcom/jcdecaux/vls/service/GooglePlaceApi;", "", "getAddressDetail", "Lio/reactivex/Observable;", "Lcom/jcdecaux/vls/model/GooglePlaceDetail;", "reference", "", "apiKey", "getAddressList", "Lcom/jcdecaux/vls/model/GooglePlaceAPIResults;", "input", "location", "radius", "types", "components", "language", "app_LyonProdRelease"}, k = 1, mv = {1, 1, 10})
/* compiled from: GooglePlaceApi.kt */
public interface GooglePlaceApi {
    @NotNull
    @GET("details/json")
    Observable<GooglePlaceDetail> getAddressDetail(@NotNull @Query("reference") String str, @NotNull @Query("key") String str2);

    @NotNull
    @GET("autocomplete/json")
    Observable<GooglePlaceAPIResults> getAddressList(@NotNull @Query("key") String str, @NotNull @Query("input") String str2, @NotNull @Query("location") String str3, @NotNull @Query("radius") String str4, @NotNull @Query("types") String str5, @NotNull @Query("components") String str6, @NotNull @Query("language") String str7);
}
