package com.jcdecaux.vls.lib.service.identity;

import com.jcdecaux.vls.lib.model.account.Code;
import com.jcdecaux.vls.lib.model.account.OpenIDPayload;
import com.jcdecaux.vls.lib.model.identity.CreateUser;
import com.jcdecaux.vls.lib.model.identity.ResetPassword;
import com.jcdecaux.vls.lib.model.identity.UpdateUser;
import com.jcdecaux.vls.lib.model.identity.User;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u0006H'J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u000eH'J(\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0006H'J,\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u0006H'J,\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u0006H'J\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0006H'J,\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u0006H'J,\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u001c\u001a\u00020\u001eH'J,\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u001f\u001a\u00020 H'J6\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\"\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u0006H'J6\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\"\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u0006H'¨\u0006$"}, d2 = {"Lcom/jcdecaux/vls/lib/service/identity/IdentityApi;", "", "anonymous", "Lio/reactivex/Observable;", "Lcom/jcdecaux/vls/lib/model/account/Code;", "contractName", "", "password", "stationId", "", "redirectUri", "createUser", "Lcom/jcdecaux/vls/lib/model/identity/User;", "contract", "Lcom/jcdecaux/vls/lib/model/identity/CreateUser;", "deleteUser", "Lretrofit2/Response;", "Ljava/lang/Void;", "email", "getIdentityToken", "Lio/reactivex/Maybe;", "Lcom/jcdecaux/vls/lib/model/account/OpenIDPayload;", "grant_type", "refresh_token", "getToken", "code", "getUser", "loginUser", "resetPassword", "Lokhttp3/ResponseBody;", "Lcom/jcdecaux/vls/lib/model/identity/ResetPassword;", "updateUser", "Lcom/jcdecaux/vls/lib/model/identity/UpdateUser;", "verifyResetPassword", "token", "verifyUser", "vls-android-core_release"}, k = 1, mv = {1, 1, 10})
/* compiled from: IdentityApi.kt */
public interface IdentityApi {
    @NotNull
    @GET("/identities/contracts/{contractName}/anonymous")
    Observable<Code> anonymous(@NotNull @Path("contractName") String str, @NotNull @Query("password") String str2, @Query("stationId") long j, @NotNull @Query("redirect_uri") String str3);

    @NotNull
    @POST("/identities/contracts/{contract}/users")
    Observable<User> createUser(@NotNull @Path("contract") String str, @NotNull @Body CreateUser createUser);

    @NotNull
    @DELETE("/identities/contracts/{contract}/users/{email}/")
    Observable<Response<Void>> deleteUser(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2);

    @NotNull
    @POST("/identities/token")
    Maybe<OpenIDPayload> getIdentityToken(@NotNull @Query("grant_type") String str, @NotNull @Query("refresh_token") String str2, @NotNull @Query("redirect_uri") String str3);

    @NotNull
    @POST("/identities/token")
    Observable<OpenIDPayload> getToken(@NotNull @Query("grant_type") String str, @NotNull @Query("code") String str2, @NotNull @Query("redirect_uri") String str3);

    @NotNull
    @GET("/identities/contracts/{contract}/users/{email}/")
    Observable<User> getUser(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2);

    @NotNull
    @GET("/identities/users/login")
    Observable<Code> loginUser(@NotNull @Query("email") String str, @NotNull @Query("password") String str2, @NotNull @Query("redirect_uri") String str3);

    @NotNull
    @POST("/identities/contracts/{contract}/users/{email}/reset")
    Observable<ResponseBody> resetPassword(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @NotNull @Body ResetPassword resetPassword);

    @NotNull
    @PATCH("/identities/contracts/{contract}/users/{email}/")
    @Headers({"ForceIdentityToken: true"})
    Observable<User> updateUser(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @NotNull @Body UpdateUser updateUser);

    @NotNull
    @GET("/identities/contracts/{contract}/verify/{email}/reset")
    Observable<Code> verifyResetPassword(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @NotNull @Query("token") String str3, @NotNull @Query("redirect_uri") String str4);

    @NotNull
    @GET("/identities/contracts/{contract}/verify/{email}/registration")
    Observable<Code> verifyUser(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @NotNull @Query("token") String str3, @NotNull @Query("redirect_uri") String str4);
}
