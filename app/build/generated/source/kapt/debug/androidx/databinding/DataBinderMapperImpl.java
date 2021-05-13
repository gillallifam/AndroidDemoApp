package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new xyz.gillall.demoapp.DataBinderMapperImpl());
  }
}
