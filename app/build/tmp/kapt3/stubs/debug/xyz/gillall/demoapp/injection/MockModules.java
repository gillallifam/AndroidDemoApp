package xyz.gillall.demoapp.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lxyz/gillall/demoapp/injection/MockModules;", "", "()V", "SDTest1", "Lorg/koin/core/module/Module;", "getSDTest1", "()Lorg/koin/core/module/Module;", "sdService", "Lxyz/gillall/demoapp/data/remote/SDApi;", "app_debug"})
public final class MockModules {
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module SDTest1 = null;
    @org.jetbrains.annotations.NotNull()
    public static final xyz.gillall.demoapp.injection.MockModules INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.koin.core.module.Module getSDTest1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final xyz.gillall.demoapp.data.remote.SDApi sdService() {
        return null;
    }
    
    private MockModules() {
        super();
    }
}