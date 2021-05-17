package xyz.gillall.demoapp.databinding;
import xyz.gillall.demoapp.R;
import xyz.gillall.demoapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PixabayItemBindingImpl extends PixabayItemBinding implements xyz.gillall.demoapp.generated.callback.OnClickListener.Listener {

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

    public PixabayItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private PixabayItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
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
            setClickListener((xyz.gillall.demoapp.ui.pixabay.imagegallery.HitClickListener) variable);
        }
        else if (BR.item == variableId) {
            setItem((xyz.gillall.demoapp.model.pixabay.ImageHit) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClickListener(@Nullable xyz.gillall.demoapp.ui.pixabay.imagegallery.HitClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }
    public void setItem(@Nullable xyz.gillall.demoapp.model.pixabay.ImageHit Item) {
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
        xyz.gillall.demoapp.ui.pixabay.imagegallery.HitClickListener clickListener = mClickListener;
        xyz.gillall.demoapp.model.pixabay.ImageHit item = mItem;
        java.lang.Integer itemDownloads = null;
        java.lang.String itemPreviewURL = null;
        java.lang.Integer itemViews = null;
        java.lang.String itemDownloadsToString = null;
        java.lang.String itemViewsToString = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (item != null) {
                    // read item.downloads
                    itemDownloads = item.getDownloads();
                    // read item.previewURL
                    itemPreviewURL = item.getPreviewURL();
                    // read item.views
                    itemViews = item.getViews();
                }


                if (itemDownloads != null) {
                    // read item.downloads.toString()
                    itemDownloadsToString = itemDownloads.toString();
                }
                if (itemViews != null) {
                    // read item.views.toString()
                    itemViewsToString = itemViews.toString();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            xyz.gillall.demoapp.util.BindingAdaptersKt.setImageURL(this.pixGalleryItem, itemPreviewURL);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDesc, itemDownloadsToString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTitle, itemViewsToString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // clickListener
        xyz.gillall.demoapp.ui.pixabay.imagegallery.HitClickListener clickListener = mClickListener;
        // item
        xyz.gillall.demoapp.model.pixabay.ImageHit item = mItem;
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