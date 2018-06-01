package com.jcdecaux.vls.lib.service.event;

import com.jcdecaux.vls.lib.model.event.EventIS;
import com.jcdecaux.vls.lib.model.event.EventsResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000bH'¨\u0006\r"}, d2 = {"Lcom/jcdecaux/vls/lib/service/event/EventsApi;", "", "getEvent", "Lio/reactivex/Observable;", "Lcom/jcdecaux/vls/lib/model/event/EventIS;", "contract", "", "eventId", "getEvents", "Lcom/jcdecaux/vls/lib/model/event/EventsResponse;", "page", "", "size", "vls-android-core_release"}, k = 1, mv = {1, 1, 10})
/* compiled from: EventsApi.kt */
public interface EventsApi {
    @NotNull
    @GET("/contracts/{contract}/events/{eventId}")
    Observable<EventIS> getEvent(@NotNull @Path("contract") String str, @NotNull @Path("eventId") String str2);

    @NotNull
    @GET("/contracts/{contract}/events")
    Observable<EventsResponse> getEvents(@NotNull @Path("contract") String str, @Query("page") int i, @Query("size") int i2);
}
