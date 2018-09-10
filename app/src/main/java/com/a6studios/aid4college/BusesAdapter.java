package com.a6studios.aid4college;

import android.content.Context;
import android.support.design.internal.SnackbarContentLayout;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 10/28/2017.
 */

public class BusesAdapter extends
        RecyclerView.Adapter<BusesAdapter.ViewHolder> implements Filterable {
    CustomFilter filter;
    ArrayList<BusTemplate> mBuses,filterList;
    private Context mContext;
    int mExpandedPosition = -1;

    public BusesAdapter(Context context,ArrayList<BusTemplate> buses){
        mBuses=buses;
        mContext=context;
        filterList=buses;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView numTextView;
        public TextView phoneTextView;
        public TextView routeTextView;
        public LinearLayout phoneLinearLayout;

        public ViewHolder(final View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            numTextView = (TextView) itemView.findViewById(R.id.bus_no);
            phoneTextView = (TextView) itemView.findViewById(R.id.bus_pno);
            routeTextView = (TextView) itemView.findViewById(R.id.bus_route);
            phoneLinearLayout = (LinearLayout)itemView.findViewById(R.id.call_ll);

        }

        @Override
        public void onClick(View v) {
            Toast.makeText(getContext(),""+(mBuses.get(getPosition()).getBno()), Toast.LENGTH_LONG).show();
            //phoneLinearLayout.setVisibility(View.VISIBLE);
        }
    }



    private Context getContext(){
        return mContext;
    }

    @Override
    public BusesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View busView = inflater.inflate(R.layout.item_bus,parent,false);
        ViewHolder viewHolder=new ViewHolder(busView);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(BusesAdapter.ViewHolder viewHolder, final int position) {
        BusTemplate bus = mBuses.get(position);
        TextView textView_num=viewHolder.numTextView;
        textView_num.setText(bus.getBno());
        TextView textView_pnum=viewHolder.phoneTextView;
        textView_pnum.setText(bus.getPhone());
        TextView textView_route=viewHolder.routeTextView;
        textView_route.setText(bus.getRoute());

        final boolean isExpanded = (position==mExpandedPosition);
        viewHolder.phoneLinearLayout.setVisibility(isExpanded?View.VISIBLE:View.GONE);
        viewHolder.itemView.setActivated(isExpanded);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mExpandedPosition = isExpanded ? -1:position;
                TransitionManager.beginDelayedTransition((ViewGroup) v);
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mBuses.size();

    }

    @Override
    public Filter getFilter() {
        if (filter==null){
            filter=new CustomFilter(filterList,this);
        }
        return filter;
    }
}


