package xyz.gillall.demoapp.ui.sdevents;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lxyz/gillall/demoapp/ui/sdevents/SDEventsRepository;", "", "sdService", "Lxyz/gillall/demoapp/data/remote/SDApi;", "(Lxyz/gillall/demoapp/data/remote/SDApi;)V", "checkIN", "", "data", "Lxyz/gillall/demoapp/model/CheckIn;", "(Lxyz/gillall/demoapp/model/CheckIn;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEvent", "Lxyz/gillall/demoapp/model/SDEvent;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEvents", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class SDEventsRepository {
    private final xyz.gillall.demoapp.data.remote.SDApi sdService = null;
    
    public SDEventsRepository(@org.jetbrains.annotations.NotNull()
    xyz.gillall.demoapp.data.remote.SDApi sdService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getEvents(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<xyz.gillall.demoapp.model.SDEvent>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getEvent(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super xyz.gillall.demoapp.model.SDEvent> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object checkIN(@org.jetbrains.annotations.NotNull()
    xyz.gillall.demoapp.model.CheckIn data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p1) {
        return null;
    }
}