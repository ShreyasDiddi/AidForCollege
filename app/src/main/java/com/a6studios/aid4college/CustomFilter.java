package com.a6studios.aid4college;

import android.util.Log;
import android.widget.Filter;

import java.util.ArrayList;

public class CustomFilter extends Filter {

    BusesAdapter adapter;
    ArrayList<BusTemplate> filterList;
    public CustomFilter(ArrayList<BusTemplate> filteredList,BusesAdapter adapter){
        this.adapter=adapter;
        this.filterList=filteredList;
    }


    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        FilterResults results= new FilterResults();
        ArrayList<BusTemplate> filteredBuses=new ArrayList<>();
        if(constraint!=null&&constraint.length()>0){
            if(constraint.toString().matches("[0-9]{1,2}")) {
                for(int i=0;i<filterList.size();i++){
                    if(filterList.get(i).getBno().contains(constraint))
                        filteredBuses.add(filterList.get(i));

                }
            }
            else
            {
                 for(int i=0;i<filterList.size();i++){
                    if(filterList.get(i).getRoute().toLowerCase().contains(constraint.toString().toLowerCase()))
                        filteredBuses.add(filterList.get(i));

                }
            }
            results.count=filteredBuses.size();
            results.values=filteredBuses;
        }
        else
        {
            results.count=filterList.size();
            results.values=filterList;
        }
        return  results;
    }

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {
        adapter.mBuses=(ArrayList<BusTemplate>)results.values;
        adapter.notifyDataSetChanged();
        Log.e("daa changed","data chanehd");
    }
}
