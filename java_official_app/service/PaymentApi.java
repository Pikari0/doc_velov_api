package com.jcdecaux.vls.service;

import com.jcdecaux.cyclocity.vls.data.source.remote.retrofit.model.Transaction;
import com.jcdecaux.vls.model.Balance;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH'J(\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u0006H'J,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u0006H'J(\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¨\u0006\u0012"}, d2 = {"Lcom/jcdecaux/vls/service/PaymentApi;", "", "getBalance", "Lio/reactivex/Observable;", "Lcom/jcdecaux/vls/model/Balance;", "contract", "", "id", "kiwiId", "", "getPayments", "", "Lcom/jcdecaux/cyclocity/vls/data/source/remote/retrofit/model/Transaction;", "getTransaction", "transaction", "getTransactionProof", "Lokhttp3/ResponseBody;", "getTransactions", "app_LyonProdRelease"}, k = 1, mv = {1, 1, 10})
/* compiled from: PaymentApi.kt */
public interface PaymentApi {
    @NotNull
    @GET("/contracts/{contract}/accounts/{email}/balance")
    Observable<Balance> getBalance(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2);

    @NotNull
    @GET("/contracts/{contract}/accounts/{email}/subscriptions/{kiwiId}/balance")
    Observable<Balance> getBalance(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @Path("kiwiId") long j);

    @NotNull
    @GET("/contracts/{contract}/accounts/{email}/sales")
    Observable<List<Transaction>> getPayments(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2);

    @NotNull
    @GET("/contracts/{contract}/accounts/{email}/transactions/{transaction}")
    Observable<Transaction> getTransaction(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @NotNull @Path("transaction") String str3);

    @NotNull
    @GET("/contracts/{contract}/accounts/{email}/transactions/{transaction}/bill")
    @Headers({"Accept: application/pdf"})
    Observable<ResponseBody> getTransactionProof(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @NotNull @Path("transaction") String str3);

    @NotNull
    @GET("/contracts/{contract}/accounts/{email}/transactions")
    Observable<List<Transaction>> getTransactions(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2);
}
