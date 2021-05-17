package xyz.gillall.demoapp;

import java.lang.System;

/**
 * INTRO
 * ui packages grouped for fast find related files
 * LIBRARIES:
 * retrofit > the almost default way of work with network calls, recommended by google
 * koin > In execution time dependency injection
 * glide > Easy image loader and cache
 * JETPACK
 * Databinding > no findviewbyid, easy access to views
 * Recyclerview > Support huge amount of items(Events) with low memory usage
 * OTHERS
 * BindingAdapters > Create functions for use while binding views
 * FUTURE TASKS
 * Fix icons on bottom
 * Use a Workmanager to fetch data periodically and update
 * Stop using the endpoint for get a single event, the data is already here.
 * Use Room to store data offline
 * Make app full screen
 * Extract strings, translations
 * Handle rotate if needed
 * Add loaders while fetch data
 * Setup navigation transitions
 * Unit tests
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f*\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lxyz/gillall/demoapp/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "sharedViewModel", "Lxyz/gillall/demoapp/shared/SharedViewModel;", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "getDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "dataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty dataStore$delegate = null;
    private xyz.gillall.demoapp.shared.SharedViewModel sharedViewModel;
    public android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    public static final xyz.gillall.demoapp.MainActivity.Companion Companion = null;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> getDataStore(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$dataStore) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0006\"\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lxyz/gillall/demoapp/MainActivity$Companion;", "", "()V", "clg", "", "values", "", "([Ljava/lang/Object;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void clg(@org.jetbrains.annotations.NotNull()
        java.lang.Object... values) {
        }
    }
}