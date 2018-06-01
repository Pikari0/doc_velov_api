package com.jcdecaux.vls.lib.service.contract;

import com.jcdecaux.vls.lib.model.contract.CGAU;
import com.jcdecaux.vls.lib.model.contract.Contract;
import com.jcdecaux.vls.lib.model.document.Document;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u000e"}, d2 = {"Lcom/jcdecaux/vls/lib/service/contract/ContractApi;", "", "getCGAUDocument", "Lio/reactivex/Observable;", "Lcom/jcdecaux/vls/lib/model/document/Document;", "contract", "", "version", "getCGAUs", "", "Lcom/jcdecaux/vls/lib/model/contract/CGAU;", "getContract", "Lcom/jcdecaux/vls/lib/model/contract/Contract;", "getValidCGAU", "vls-android-core_release"}, k = 1, mv = {1, 1, 10})
/* compiled from: ContractApi.kt */
public interface ContractApi {
    @NotNull
    @GET("/contracts/{contract}/cgau/{version}/file")
    Observable<Document> getCGAUDocument(@NotNull @Path("contract") String str, @NotNull @Path("version") String str2);

    @NotNull
    @GET("/contracts/{contract}/cgau")
    Observable<List<CGAU>> getCGAUs(@NotNull @Path("contract") String str);

    @NotNull
    @GET("/contracts/{contract}")
    Observable<Contract> getContract(@NotNull @Path("contract") String str);

    @NotNull
    @GET("/contracts/{contract}/cgau/valid")
    Observable<CGAU> getValidCGAU(@NotNull @Path("contract") String str);
}
