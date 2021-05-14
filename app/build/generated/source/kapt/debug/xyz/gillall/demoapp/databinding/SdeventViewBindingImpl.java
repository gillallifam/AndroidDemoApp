package xyz.gillall.demoapp.databinding;
import xyz.gillall.demoapp.R;
import xyz.gillall.demoapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SdeventViewBindingImpl extends SdeventViewBinding implements xyz.gillall.demoapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SdeventViewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private SdeventViewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag("open");
        this.pixGalleryItem.setTag(null);
        this.txtDesc.setTag(null);
        this.txtTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new xyz.gillall.demoapp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.clickListener == variableId) {
            setClickListener((xyz.gillall.demoapp.ui.sd.events.SDEventClickListener) variable);
        }
        else if (BR.item == variableId) {
            setItem((xyz.gillall.demoapp.model.sd.SDEvent) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClickListener(@Nullable xyz.gillall.demoapp.ui.sd.events.SDEventClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }
    public void setItem(@Nullable xyz.gillall.demoapp.model.sd.SDEvent Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String itemTitle = null;
        java.lang.String itemImage = null;
        xyz.gillall.demoapp.ui.sd.events.SDEventClickListener clickListener = mClickListener;
        xyz.gillall.demoapp.model.sd.SDEvent item = mItem;
        java.lang.String itemDescription = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (item != null) {
                    // read item.title
                    itemTitle = item.getTitle();
                    // read item.image
                    itemImage = item.getImage();
                    // read item.description
                    itemDescription = item.getDescription();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            xyz.gillall.demoapp.util.BindingAdaptersKt.setImagePlaceholderURL(this.pixGalleryItem, itemImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDesc, itemDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTitle, itemTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // clickListener
        xyz.gillall.demoapp.ui.sd.events.SDEventClickListener clickListener = mClickListener;
        // item
        xyz.gillall.demoapp.model.sd.SDEvent item = mItem;
        // clickListener != null
        boolean clickListenerJavaLangObjectNull = false;



        clickListenerJavaLangObjectNull = (clickListener) != (null);
        if (clickListenerJavaLangObjectNull) {




            clickListener.onClick(item, callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): clickListener
        flag 1 (0x2L): item
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}