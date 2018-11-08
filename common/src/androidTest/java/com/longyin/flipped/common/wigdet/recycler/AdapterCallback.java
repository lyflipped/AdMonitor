package com.longyin.flipped.common.wigdet.recycler;

/**
 * 适配器回调接口
 * @author flipped
 * @param <Data>
 */
public interface AdapterCallback<Data> {
    void update(Data data, RecyclerAdapter.ViewHolder<Data> holder);
}