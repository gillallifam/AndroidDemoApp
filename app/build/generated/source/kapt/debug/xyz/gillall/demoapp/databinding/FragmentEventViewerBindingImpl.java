package xyz.gillall.demoapp.databinding;
import xyz.gillall.demoapp.R;
import xyz.gillall.demoapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEventViewerBindingImpl extends FragmentEventViewerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.nestedScrollView, 1);
        sViewsWithIds.put(R.id.imageViewViewer, 2);
        sViewsWithIds.put(R.id.txtTitle, 3);
        sViewsWithIds.put(R.id.textView1, 4);
        sViewsWithIds.put(R.id.constraintLayout, 5);
        sViewsWithIds.put(R.id.image_checkin, 6);
        sViewsWithIds.put(R.id.image_share, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentEventViewerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentEventViewerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[2]
            , (androidx.core.widget.NestedScrollView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.defimage == variableId) {
            setDefimage((java.lang.String) variable);
        }
        else if (BR.event == variableId) {
            setEvent((xyz.gillall.demoapp.model.sd.SDEvent) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDefimage(@Nullable java.lang.String Defimage) {
        this.mDefimage = Defimage;
    }
    public void setEvent(@Nullable xyz.gillall.demoapp.model.sd.SDEvent Event) {
        this.mEvent = Event;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): defimage
        flag 1 (0x2L): event
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}