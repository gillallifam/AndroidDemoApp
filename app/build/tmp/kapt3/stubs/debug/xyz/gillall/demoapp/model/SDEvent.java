package xyz.gillall.demoapp.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u0010J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010.\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010/\u001a\u00020\bH\u00c6\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u00101\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u00102\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u000b\u00103\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\bH\u00c6\u0003J~\u00105\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u00106J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010:\u001a\u00020\u0006H\u00d6\u0001J\t\u0010;\u001a\u00020\bH\u00d6\u0001R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001e\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019\u00a8\u0006<"}, d2 = {"Lxyz/gillall/demoapp/model/SDEvent;", "", "people", "", "Lxyz/gillall/demoapp/model/CheckIn;", "date", "", "description", "", "image", "longitude", "", "latitude", "price", "title", "id", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/Integer;", "setDate", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getId", "getImage", "setImage", "getLatitude", "()Ljava/lang/Double;", "setLatitude", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getLongitude", "setLongitude", "getPeople", "()Ljava/util/List;", "setPeople", "(Ljava/util/List;)V", "getPrice", "setPrice", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lxyz/gillall/demoapp/model/SDEvent;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class SDEvent {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<xyz.gillall.demoapp.model.CheckIn> people;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer date;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String description;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String image;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double longitude;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double latitude;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double price;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String id = null;
    
    @org.jetbrains.annotations.NotNull()
    public final xyz.gillall.demoapp.model.SDEvent copy(@org.jetbrains.annotations.Nullable()
    java.util.List<xyz.gillall.demoapp.model.CheckIn> people, @org.jetbrains.annotations.Nullable()
    java.lang.Integer date, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String image, @org.jetbrains.annotations.Nullable()
    java.lang.Double longitude, @org.jetbrains.annotations.Nullable()
    java.lang.Double latitude, @org.jetbrains.annotations.Nullable()
    java.lang.Double price, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String id) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public SDEvent(@org.jetbrains.annotations.Nullable()
    java.util.List<xyz.gillall.demoapp.model.CheckIn> people, @org.jetbrains.annotations.Nullable()
    java.lang.Integer date, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String image, @org.jetbrains.annotations.Nullable()
    java.lang.Double longitude, @org.jetbrains.annotations.Nullable()
    java.lang.Double latitude, @org.jetbrains.annotations.Nullable()
    java.lang.Double price, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String id) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<xyz.gillall.demoapp.model.CheckIn> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<xyz.gillall.demoapp.model.CheckIn> getPeople() {
        return null;
    }
    
    public final void setPeople(@org.jetbrains.annotations.Nullable()
    java.util.List<xyz.gillall.demoapp.model.CheckIn> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLongitude() {
        return null;
    }
    
    public final void setLongitude(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLatitude() {
        return null;
    }
    
    public final void setLatitude(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPrice() {
        return null;
    }
    
    public final void setPrice(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
}