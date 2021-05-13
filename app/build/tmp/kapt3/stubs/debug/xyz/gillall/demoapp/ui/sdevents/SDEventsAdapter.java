package xyz.gillall.demoapp.ui.sdevents;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lxyz/gillall/demoapp/ui/sdevents/SDEventsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lxyz/gillall/demoapp/model/SDEvent;", "Lxyz/gillall/demoapp/ui/sdevents/SDEventsAdapter$ViewHolder;", "clickListener", "Lxyz/gillall/demoapp/ui/sdevents/SDEventClickListener;", "(Lxyz/gillall/demoapp/ui/sdevents/SDEventClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class SDEventsAdapter extends androidx.recyclerview.widget.ListAdapter<xyz.gillall.demoapp.model.SDEvent, xyz.gillall.demoapp.ui.sdevents.SDEventsAdapter.ViewHolder> {
    private final xyz.gillall.demoapp.ui.sdevents.SDEventClickListener clickListener = null;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    xyz.gillall.demoapp.ui.sdevents.SDEventsAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public xyz.gillall.demoapp.ui.sdevents.SDEventsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public SDEventsAdapter(@org.jetbrains.annotations.NotNull()
    xyz.gillall.demoapp.ui.sdevents.SDEventClickListener clickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lxyz/gillall/demoapp/ui/sdevents/SDEventsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lxyz/gillall/demoapp/databinding/SdeventViewBinding;", "(Lxyz/gillall/demoapp/databinding/SdeventViewBinding;)V", "bind", "", "item", "Lxyz/gillall/demoapp/model/SDEvent;", "clickListener", "Lxyz/gillall/demoapp/ui/sdevents/SDEventClickListener;", "Companion", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final xyz.gillall.demoapp.databinding.SdeventViewBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        public static final xyz.gillall.demoapp.ui.sdevents.SDEventsAdapter.ViewHolder.Companion Companion = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        xyz.gillall.demoapp.model.SDEvent item, @org.jetbrains.annotations.NotNull()
        xyz.gillall.demoapp.ui.sdevents.SDEventClickListener clickListener) {
        }
        
        private ViewHolder(xyz.gillall.demoapp.databinding.SdeventViewBinding binding) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lxyz/gillall/demoapp/ui/sdevents/SDEventsAdapter$ViewHolder$Companion;", "", "()V", "from", "Lxyz/gillall/demoapp/ui/sdevents/SDEventsAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final xyz.gillall.demoapp.ui.sdevents.SDEventsAdapter.ViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}