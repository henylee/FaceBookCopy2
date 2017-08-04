package kr.co.tjenit.facebookcopy.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjenit.facebookcopy.R;
import kr.co.tjenit.facebookcopy.data.AlarmData;

/**
 * Created by the on 2017-08-04.
 */

public class AlarmAdapter extends ArrayAdapter<AlarmData> {

    Context mContext;
    List<AlarmData> mList;
    LayoutInflater inf;

    public AlarmAdapter (Context context, List<AlarmData> list) {

        super(context, R.layout.alarm_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row==null) {
            row = inf.inflate(R.layout.alarm_item, null);
        }
        return row;
    }
}
