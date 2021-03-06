package xyz.gillall.demoapp.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J9\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ9\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lxyz/gillall/demoapp/data/remote/PixabayApi;", "", "getImages", "Lxyz/gillall/demoapp/model/pixabay/ImageHits;", "key", "", "query", "image_type", "perpage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVideos", "Lxyz/gillall/demoapp/model/pixabay/VideoHits;", "video_type", "app_debug"})
public abstract interface PixabayApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api")
    public abstract java.lang.Object getImages(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "key")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "image_type")
    java.lang.String image_type, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "per_page")
    java.lang.String perpage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super xyz.gillall.demoapp.model.pixabay.ImageHits> p4);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/videos")
    public abstract java.lang.Object getVideos(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "key")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "video_type")
    java.lang.String video_type, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "per_page")
    java.lang.String perpage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super xyz.gillall.demoapp.model.pixabay.VideoHits> p4);
}