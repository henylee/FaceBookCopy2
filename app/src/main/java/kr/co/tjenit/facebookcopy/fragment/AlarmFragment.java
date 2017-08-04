package kr.co.tjenit.facebookcopy.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import kr.co.tjenit.facebookcopy.R;
import kr.co.tjenit.facebookcopy.adapter.AlarmAdapter;
import kr.co.tjenit.facebookcopy.data.AlarmData;

/**
 * Created by the on 2017-08-04.
 */

public class AlarmFragment extends Fragment {

    public ListView alarmListView;
    List<AlarmData> alarmDataList = new ArrayList<>();
    AlarmAdapter alarmAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_alarm_item,container,false);
        alarmListView = (ListView) v.findViewById(R.id.alarmListView);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        alarmDataList.add(new AlarmData("유저", "반갑반갑을 입력", Calendar.AM_PM));
        alarmDataList.add(new AlarmData("유저", "반갑반갑을 입력", Calendar.AM_PM));
        alarmDataList.add(new AlarmData("유저", "반갑반갑을 입력", Calendar.AM_PM));

        alarmAdapter = new AlarmAdapter(getActivity(), alarmDataList);
        alarmListView.setAdapter(alarmAdapter);
    }
}
