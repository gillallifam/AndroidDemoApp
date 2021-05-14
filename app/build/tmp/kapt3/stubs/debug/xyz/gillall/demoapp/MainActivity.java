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
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014\u00a8\u0006\b"}, d2 = {"Lxyz/gillall/demoapp/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public static final xyz.gillall.demoapp.MainActivity.Companion Companion = null;
    
    public MainActivity() {
        super();
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