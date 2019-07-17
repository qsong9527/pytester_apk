package cn.pytester.bbs.listeners;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.LinkedList;

import cn.pytester.bbs.model.TestFunction;

public class TestFunctionAdapter extends BaseAdapter {

    private LinkedList<TestFunction> mData;
    private Context mContext;

    public TestFunctionAdapter(LinkedList<TestFunction> mData, Context mContext) {
        this.mData = mData;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
