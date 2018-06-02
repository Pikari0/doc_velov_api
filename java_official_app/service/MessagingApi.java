package com.jcdecaux.vls.service;

import com.jcdecaux.vls.model.FCMBody;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.Path;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\nH'J2\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\nH'¨\u0006\r"}, d2 = {"Lcom/jcdecaux/vls/service/MessagingApi;", "", "deleteToken", "Lio/reactivex/Observable;", "Lretrofit2/Response;", "Ljava/lang/Void;", "contract", "", "email", "fCMBody", "Lcom/jcdecaux/vls/model/FCMBody;", "registerToken", "body", "app_LyonProdRelease"}, k = 1, mv = {1, 1, 10})
/* compiled from: MessagingApi.kt */
public interface MessagingApi {
    @NotNull
    @HTTP(hasBody = true, method = "DELETE", path = "/contracts/{contract}/accounts/{email}/devices")
    Observable<Response<Void>> deleteToken(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @NotNull @Body FCMBody fCMBody);

    @NotNull
    @POST("/contracts/{contract}/accounts/{email}/devices")
    Observable<Response<Void>> registerToken(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @NotNull @Body FCMBody fCMBody);
}
