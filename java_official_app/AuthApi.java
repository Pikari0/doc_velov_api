package com.jcdecaux.vls.lib.service.auth;

import com.jcdecaux.vls.lib.model.auth.AuthClientInfos;
import com.jcdecaux.vls.model.AuthRefreshToken;
import com.jcdecaux.vls.model.AuthResponse;
import io.reactivex.Maybe;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH'¨\u0006\f"}, d2 = {"Lcom/jcdecaux/vls/lib/service/auth/AuthApi;", "", "getAccessToken", "Lio/reactivex/Maybe;", "Lcom/jcdecaux/vls/model/AuthResponse;", "authRefreshToken", "Lcom/jcdecaux/vls/model/AuthRefreshToken;", "getTokenByClient", "environment", "", "authClientInfos", "Lcom/jcdecaux/vls/lib/model/auth/AuthClientInfos;", "vls-android-core_release"}, k = 1, mv = {1, 1, 10})
/* compiled from: AuthApi.kt */
public interface AuthApi {
    @NotNull
    @POST("/auth/access_tokens")
    Maybe<AuthResponse> getAccessToken(@NotNull @Body AuthRefreshToken authRefreshToken);

    @NotNull
    @POST("/auth/environments/{environment}/client_tokens")
    Maybe<AuthResponse> getTokenByClient(@NotNull @Path("environment") String str, @NotNull @Body AuthClientInfos authClientInfos);
}
