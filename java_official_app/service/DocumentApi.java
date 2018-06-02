package com.jcdecaux.vls.service;

import com.jcdecaux.vls.lib.model.document.Document;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.DELETE;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH'¨\u0006\r"}, d2 = {"Lcom/jcdecaux/vls/service/DocumentApi;", "", "deleteDocument", "Lio/reactivex/Observable;", "Lretrofit2/Response;", "Ljava/lang/Void;", "id", "", "uploadDocument", "Lcom/jcdecaux/vls/lib/model/document/Document;", "attachment", "", "Lokhttp3/MultipartBody$Part;", "app_LyonProdRelease"}, k = 1, mv = {1, 1, 10})
/* compiled from: DocumentApi.kt */
public interface DocumentApi {
    @NotNull
    @DELETE("/documents/{id}")
    Observable<Response<Void>> deleteDocument(@NotNull @Path("id") String str);

    @Multipart
    @NotNull
    @POST("/documents")
    Observable<Document> uploadDocument(@NotNull @Part List<MultipartBody.Part> list);
}
