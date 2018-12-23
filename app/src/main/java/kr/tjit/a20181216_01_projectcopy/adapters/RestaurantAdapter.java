package kr.tjit.a20181216_01_projectcopy.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

import kr.tjit.a20181216_01_projectcopy.R;
import kr.tjit.a20181216_01_projectcopy.datas.Restaurant;

public class RestaurantAdapter extends ArrayAdapter<Restaurant> {

    Context mContext;
    List<Restaurant> mList;
    LayoutInflater inf;

    public RestaurantAdapter(Context mContext, List<Restaurant> mList) {
        super(mContext, R.layout.restaurant_list_item, mList);

        this.mContext = mContext;
        this.mList = mList;
        this.inf = LayoutInflater.from(mContext);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;

        if (row == null) {

            row = inf.inflate(R.layout.restaurant_list_item, null);

        }

        return row;

    }
}
