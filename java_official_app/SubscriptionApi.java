package com.jcdecaux.vls.lib.service.subscription;

import com.jcdecaux.vls.lib.model.badge.BadgeInfos;
import com.jcdecaux.vls.lib.model.badge.BadgeState;
import com.jcdecaux.vls.lib.model.document.Document;
import com.jcdecaux.vls.lib.model.subscription.Subscription;
import com.jcdecaux.vls.lib.model.subscription.SubscriptionAutoRenewal;
import com.jcdecaux.vls.lib.model.subscription.SubscriptionEmail;
import com.jcdecaux.vls.lib.model.subscription.SubscriptionPeriod.Type;
import com.jcdecaux.vls.lib.model.subscription.SubscriptionStatus;
import com.jcdecaux.vls.lib.model.subscription.SubscriptionStatus.Status;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH'J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\tH'JG\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\u0014\b\u0001\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\"\u00020\u0013H'¢\u0006\u0002\u0010\u0014J2\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00160\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u0013H'J2\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00160\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0006H'J<\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00160\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u001aH'J,\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH'J2\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u001e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH'J,\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH'J6\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\"\u001a\u00020#H'¨\u0006$"}, d2 = {"Lcom/jcdecaux/vls/lib/service/subscription/SubscriptionApi;", "", "changeMyBadge", "Lio/reactivex/Observable;", "Lcom/jcdecaux/vls/lib/model/badge/BadgeState;", "contract", "", "email", "id", "", "badgeInfos", "Lcom/jcdecaux/vls/lib/model/badge/BadgeInfos;", "get", "Lcom/jcdecaux/vls/lib/model/subscription/SubscriptionEmail;", "contractName", "kiwiId", "Lcom/jcdecaux/vls/lib/model/subscription/Subscription;", "periods", "", "Lcom/jcdecaux/vls/lib/model/subscription/SubscriptionPeriod$Type;", "(Ljava/lang/String;Ljava/lang/String;J[Lcom/jcdecaux/vls/lib/model/subscription/SubscriptionPeriod$Type;)Lio/reactivex/Observable;", "getAll", "", "period", "getAllWaitingAssociation", "status", "Lcom/jcdecaux/vls/lib/model/subscription/SubscriptionStatus$Status;", "getReceiptDocument", "Lcom/jcdecaux/vls/lib/model/document/Document;", "getStatuses", "Lio/reactivex/Single;", "Lcom/jcdecaux/vls/lib/model/subscription/SubscriptionStatus;", "isRenting", "", "subscriptionAutoRenewal", "Lcom/jcdecaux/vls/lib/model/subscription/SubscriptionAutoRenewal;", "vls-android-core_release"}, k = 1, mv = {1, 1, 10})
/* compiled from: SubscriptionApi.kt */
public interface SubscriptionApi {
    @NotNull
    @POST("/contracts/{contract}/accounts/{email}/subscriptions/{id}/badges")
    Observable<BadgeState> changeMyBadge(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @Path("id") long j, @NotNull @Body BadgeInfos badgeInfos);

    @NotNull
    @GET("/contracts/{contractName}/subscriptions/{kiwiId}/email")
    Observable<SubscriptionEmail> get(@NotNull @Path("contractName") String str, @Path("kiwiId") long j);

    @NotNull
    @GET("/contracts/{contract}/accounts/{email}/subscriptions/{id}")
    Observable<Subscription> get(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @Path("id") long j, @NotNull @Query("periods") Type... typeArr);

    @NotNull
    @GET("/contracts/{contract}/accounts/{email}/subscriptions")
    Observable<List<Subscription>> getAll(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @NotNull @Query("periods") Type type);

    @NotNull
    @GET("/contracts/{contract}/accounts/{email}/subscriptions")
    Observable<List<Subscription>> getAll(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @NotNull @Query("periods") String str3);

    @NotNull
    @GET("/contracts/{contract}/accounts/{email}/subscriptions")
    Observable<List<Subscription>> getAllWaitingAssociation(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @NotNull @Query("periods") String str3, @NotNull @Query("status") Status status);

    @NotNull
    @GET("/contracts/{contract}/accounts/{email}/subscriptions/{id}/receipts")
    Observable<Document> getReceiptDocument(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @Path("id") long j);

    @NotNull
    @GET("/contracts/{contract}/accounts/{email}/subscriptions/{id}/statuses")
    Single<List<SubscriptionStatus>> getStatuses(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @Path("id") long j);

    @NotNull
    @GET("/contracts/{contract}/accounts/{email}/subscriptions/{id}/rentbike")
    Single<Boolean> isRenting(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @Path("id") long j);

    @NotNull
    @PATCH("/contracts/{contract}/accounts/{email}/subscriptions/{id}")
    Observable<Subscription> subscriptionAutoRenewal(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @Path("id") long j, @NotNull @Body SubscriptionAutoRenewal subscriptionAutoRenewal);
}
