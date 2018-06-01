package com.jcdecaux.vls.lib.service.process;

import com.jcdecaux.vls.lib.model.internal.Process;
import com.jcdecaux.vls.lib.model.process.ProcessResult;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JQ\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0014\b\u0001\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\r\"\u00020\u0006H'¢\u0006\u0002\u0010\u000eJG\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\u0014\b\u0001\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\r\"\u00020\u0006H'¢\u0006\u0002\u0010\u000fJG\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0014\b\u0001\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\r\"\u00020\u0006H'¢\u0006\u0002\u0010\u0011JQ\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0014\b\u0001\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\r\"\u00020\u0006H'¢\u0006\u0002\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/jcdecaux/vls/lib/service/process/ProcessApi;", "", "confirm", "Lio/reactivex/Observable;", "Lcom/jcdecaux/vls/lib/model/process/ProcessResult;", "contract", "", "email", "processId", "", "process", "Lcom/jcdecaux/vls/lib/model/internal/Process;", "returns", "", "(Ljava/lang/String;Ljava/lang/String;JLcom/jcdecaux/vls/lib/model/internal/Process;[Ljava/lang/String;)Lio/reactivex/Observable;", "(Ljava/lang/String;Ljava/lang/String;J[Ljava/lang/String;)Lio/reactivex/Observable;", "create", "(Ljava/lang/String;Ljava/lang/String;Lcom/jcdecaux/vls/lib/model/internal/Process;[Ljava/lang/String;)Lio/reactivex/Observable;", "delete", "vls-android-core_release"}, k = 1, mv = {1, 1, 10})
/* compiled from: ProcessApi.kt */
public interface ProcessApi {
    @NotNull
    @PATCH("/contracts/{contract}/accounts/{email}/processes/{processId}")
    Observable<ProcessResult> confirm(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @Path("processId") long j, @NotNull @Body Process process, @NotNull @Query("returns") String... strArr);

    @NotNull
    @PATCH("/contracts/{contract}/accounts/{email}/processes/{processId}")
    Observable<ProcessResult> confirm(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @Path("processId") long j, @NotNull @Query("returns") String... strArr);

    @NotNull
    @POST("/contracts/{contract}/accounts/{email}/processes")
    Observable<ProcessResult> create(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @NotNull @Body Process process, @NotNull @Query("returns") String... strArr);

    @NotNull
    @DELETE("/contracts/{contract}/accounts/{email}/processes/{processId}")
    Observable<ProcessResult> delete(@NotNull @Path("contract") String str, @NotNull @Path("email") String str2, @Path("processId") long j, @NotNull @Body Process process, @NotNull @Query("returns") String... strArr);
}
