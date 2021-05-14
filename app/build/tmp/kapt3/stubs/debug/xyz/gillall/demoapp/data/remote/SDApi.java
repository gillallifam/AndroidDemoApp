package xyz.gillall.demoapp.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lxyz/gillall/demoapp/data/remote/SDApi;", "", "checkIn", "", "checkin", "Lxyz/gillall/demoapp/model/sd/CheckIn;", "(Lxyz/gillall/demoapp/model/sd/CheckIn;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEvent", "Lxyz/gillall/demoapp/model/sd/SDEvent;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEvents", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface SDApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "events")
    public abstract java.lang.Object getEvents(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<xyz.gillall.demoapp.model.sd.SDEvent>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "events/{id}")
    public abstract java.lang.Object getEvent(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super xyz.gillall.demoapp.model.sd.SDEvent> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "checkin")
    public abstract java.lang.Object checkIn(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    xyz.gillall.demoapp.model.sd.CheckIn checkin, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
}