package com.jcdecaux.cyclocity.vls.core.data.source.remote.retrofit.api;

import com.jcdecaux.cyclocity.vls.core.data.source.remote.retrofit.model.account.Account;
import com.jcdecaux.cyclocity.vls.core.data.source.remote.retrofit.model.account.Alert;
import com.jcdecaux.cyclocity.vls.core.data.source.remote.retrofit.model.account.CompleteAccount;
import com.jcdecaux.cyclocity.vls.core.data.source.remote.retrofit.model.account.UpdateAccount;
import com.jcdecaux.vls.model.account.TempAccesses;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH'J(\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0006H'J\u001e\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0006H'J(\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f0\u00102\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0006H'J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u0006H'J,\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u0019H'¨\u0006\u001a"}, d2 = {"Lcom/jcdecaux/cyclocity/vls/core/data/source/remote/retrofit/api/AccountApi;", "", "complete", "Lio/reactivex/Observable;", "Lcom/jcdecaux/cyclocity/vls/core/data/source/remote/retrofit/model/account/Account;", "contract", "", "id", "completeAccount", "Lcom/jcdecaux/cyclocity/vls/core/data/source/remote/retrofit/model/account/CompleteAccount;", "delete", "Lretrofit2/Response;", "Ljava/lang/Void;", "email", "get", "", "Lio/reactivex/Single;", "getAlerts", "Lcom/jcdecaux/cyclocity/vls/core/data/source/remote/retrofit/model/account/Alert;", "getTempAccesses", "Lcom/jcdecaux/vls/model/account/TempAccesses;", "contractName", "phoneNumber", "update", "updateAccount", "Lcom/jcdecaux/cyclocity/vls/core/data/source/remote/retrofit/model/account/UpdateAccount;", "vls-android-core_release"}, k = 1, mv = {1, 1, 10})
/* compiled from: AccountApi.kt */
public interface AccountApi {
    @NotNull
    @PATCH("/contracts/{contract}/accounts/{email}")
    Observable<Account> complete(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @NotNull @Body CompleteAccount completeAccount);

    @NotNull
    @DELETE("/contracts/{contract}/accounts/{email}")
    Observable<Response<Void>> delete(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2);

    @NotNull
    @GET("/contracts/{contract}/accounts")
    Observable<List<Account>> get(@NotNull @Path("contract") String str);

    @NotNull
    @GET("/contracts/{contract}/accounts/{email}")
    Single<Account> get(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2);

    @NotNull
    @GET("/contracts/{contract}/accounts/{email}/alerts")
    Single<List<Alert>> getAlerts(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2);

    @NotNull
    @GET("/contracts/{contractName}/tempAccesses/{phoneNumber}")
    Observable<TempAccesses> getTempAccesses(@NotNull @Path("contractName") String str, @NotNull @Path("phoneNumber") String str2);

    @NotNull
    @PATCH("/contracts/{contract}/accounts/{email}")
    Observable<Account> update(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @NotNull @Body UpdateAccount updateAccount);
}
