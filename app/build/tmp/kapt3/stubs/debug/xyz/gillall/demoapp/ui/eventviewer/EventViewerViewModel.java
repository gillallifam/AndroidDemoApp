package xyz.gillall.demoapp.ui.eventviewer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\r\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lxyz/gillall/demoapp/ui/eventviewer/EventViewerViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "repository", "Lxyz/gillall/demoapp/ui/sdevents/SDEventsRepository;", "(Landroid/app/Application;Lxyz/gillall/demoapp/ui/sdevents/SDEventsRepository;)V", "_event", "Landroidx/lifecycle/MutableLiveData;", "Lxyz/gillall/demoapp/model/SDEvent;", "context", "event", "Landroidx/lifecycle/LiveData;", "getEvent", "()Landroidx/lifecycle/LiveData;", "checkIn", "", "data", "Lxyz/gillall/demoapp/model/CheckIn;", "id", "", "app_debug"})
public final class EventViewerViewModel extends androidx.lifecycle.AndroidViewModel {
    private final android.app.Application context = null;
    private final androidx.lifecycle.MutableLiveData<xyz.gillall.demoapp.model.SDEvent> _event = null;
    private final xyz.gillall.demoapp.ui.sdevents.SDEventsRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<xyz.gillall.demoapp.model.SDEvent> getEvent() {
        return null;
    }
    
    public final void checkIn(@org.jetbrains.annotations.NotNull()
    xyz.gillall.demoapp.model.CheckIn data) {
    }
    
    public final void getEvent(@org.jetbrains.annotations.Nullable()
    java.lang.String id) {
    }
    
    public EventViewerViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    xyz.gillall.demoapp.ui.sdevents.SDEventsRepository repository) {
        super(null);
    }
}