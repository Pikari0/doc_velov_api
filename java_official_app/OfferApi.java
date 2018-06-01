package com.jcdecaux.vls.lib.service.offer;

import com.jcdecaux.vls.lib.model.Platform;
import com.jcdecaux.vls.lib.model.badge.Badge;
import com.jcdecaux.vls.lib.model.document.Document;
import com.jcdecaux.vls.lib.model.offer.GroupOffers;
import com.jcdecaux.vls.lib.model.offer.Offer;
import com.jcdecaux.vls.lib.model.offer.OfferEligible;
import com.jcdecaux.vls.lib.model.offer.Package;
import com.jcdecaux.vls.lib.model.offer.PackageOptions;
import com.jcdecaux.vls.lib.model.offer.SubscriptionOffers;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\"\u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\nj\u0002`\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J,\u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\nj\u0002`\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H'J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H'J,\u0010\u0011\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\nj\u0002`\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0010H'J,\u0010\u0012\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\nj\u0002`\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\bH'J6\u0010\u0012\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00140\nj\u0002`\u00150\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\bH'J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\bH'J\"\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\bH'J(\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0010H'J6\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0018\u001a\u00020\b2\b\b\u0001\u0010\u001f\u001a\u00020 H'J\"\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\"\u001a\u00020\bH'¨\u0006#"}, d2 = {"Lcom/jcdecaux/vls/lib/service/offer/OfferApi;", "", "get", "Lio/reactivex/Observable;", "Lcom/jcdecaux/vls/lib/model/offer/Offer;", "contract", "", "offerId", "", "getAll", "", "Lcom/jcdecaux/vls/lib/model/internal/Offers;", "email", "Lcom/jcdecaux/vls/lib/model/offer/SubscriptionOffers;", "subscriptionId", "platform", "Lcom/jcdecaux/vls/lib/model/Platform;", "getAllByCanal", "getAllOffersGroup", "group", "Lcom/jcdecaux/vls/lib/model/offer/OfferEligible;", "Lcom/jcdecaux/vls/lib/model/internal/OffersEligibles;", "getBadge", "Lcom/jcdecaux/vls/lib/model/badge/Badge;", "badgeId", "getBadgeLogo", "Lcom/jcdecaux/vls/lib/model/document/Document;", "getGroups", "Lcom/jcdecaux/vls/lib/model/offer/GroupOffers;", "getPackage", "Lcom/jcdecaux/vls/lib/model/offer/Package;", "packageOptions", "Lcom/jcdecaux/vls/lib/model/offer/PackageOptions;", "getProofModel", "proofId", "vls-android-core_release"}, k = 1, mv = {1, 1, 10})
/* compiled from: OfferApi.kt */
public interface OfferApi {
    @NotNull
    @GET("/contracts/{contract}/offers/{offerId}")
    Observable<Offer> get(@NotNull @Path("contract") String str, @Path("offerId") long j);

    @NotNull
    @GET("/contracts/{contract}/offers")
    Observable<List<Offer>> getAll(@NotNull @Path("contract") String str);

    @NotNull
    @GET("/contracts/{contract}/accounts/{email}/offers")
    Observable<List<Offer>> getAll(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2);

    @NotNull
    @GET("/contracts/{contract}/accounts/{email}/subscriptions/{subscriptionId}/offers")
    Observable<SubscriptionOffers> getAll(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @Path("subscriptionId") long j, @NotNull @Query("platform") Platform platform);

    @NotNull
    @GET("/contracts/{contract}/offers")
    Observable<List<Offer>> getAllByCanal(@NotNull @Path("contract") String str, @NotNull @Query("platform") Platform platform);

    @NotNull
    @GET("/contracts/{contract}/offerGroups/{group}/offers")
    Observable<List<Offer>> getAllOffersGroup(@NotNull @Path("contract") String str, @Path("group") long j);

    @NotNull
    @GET("/contracts/{contract}/accounts/{email}/offerGroups/{group}/offers")
    Observable<List<OfferEligible>> getAllOffersGroup(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @Path("group") long j);

    @NotNull
    @GET("/contracts/{contract}/badges/{badgeId}")
    Observable<Badge> getBadge(@NotNull @Path("contract") String str, @Path("badgeId") long j);

    @NotNull
    @GET("/contracts/{contract}/badges/{badgeId}/logo")
    Observable<Document> getBadgeLogo(@NotNull @Path("contract") String str, @Path("badgeId") long j);

    @NotNull
    @GET("/contracts/{contract}/offerGroups")
    Observable<List<GroupOffers>> getGroups(@NotNull @Path("contract") String str, @NotNull @Query("platform") Platform platform);

    @NotNull
    @POST("/contracts/{contract}/offers/{offerId}/badges/{badgeId}/packages")
    Observable<Package> getPackage(@NotNull @Path("contract") String str, @Path("offerId") long j, @Path("badgeId") long j2, @NotNull @Body PackageOptions packageOptions);

    @NotNull
    @GET("/contracts/{contract}/proofs/{proofId}/content")
    Observable<Document> getProofModel(@NotNull @Path("contract") String str, @Path("proofId") long j);
}
