package com.trust.instagramclient.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.trust.instagramclient.Model.f3Model;
import com.trust.instagramclient.R;

import java.util.List;

/**
 * Created by vcs-server on 9/12/16.
 */
public class f3Adapter extends RecyclerView.Adapter<f3Adapter.UserViewHolder>{
    private List<f3Model> userList;
    private Context context;

    public f3Adapter(List<f3Model> userList, Context context) {
        this.userList = userList;
        this.context = context;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.f3_item, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        f3Model user = userList.get(position);
        holder.text.setText(user.getTitle());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }


    public static class UserViewHolder extends RecyclerView.ViewHolder {
        private TextView text;

        public UserViewHolder(View itemView) {
            super(itemView);
            text = (TextView) itemView.findViewById(R.id.f3_item_content);
        }
    }
}
