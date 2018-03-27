package com.zzx.futrue.test;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zzx.futrue.R;

import java.util.ArrayList;

/**
 * Created by jasonzhang on 18/3/27.
 */

public class TestListAdapter extends RecyclerView.Adapter {
    private ArrayList<TestTypeBean> mList;

    public TestListAdapter(ArrayList<TestTypeBean> list) {
        this.mList = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_test, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        TestTypeBean bean = mList.get(position);
        ((ViewHolder)holder).name.setText(bean.name);
        ((ViewHolder)holder).des.setText(bean.des);
        holder.itemView.setTag(bean);
    }

    @Override
    public int getItemCount() {
        return mList==null?0:mList.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView name;
        public TextView des;
        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            des = itemView.findViewById(R.id.des);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    TestTypeBean bean = (TestTypeBean) v.getTag();
                    Intent intent = new Intent(v.getContext(),bean.cls);
                    v.getContext().startActivity(intent);
                }
            });
        }
    }
}
