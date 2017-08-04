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
import kr.co.tjenit.facebookcopy.adapter.MessageAdapter;
import kr.co.tjenit.facebookcopy.data.MessageData;

/**
 * Created by the on 2017-08-04.
 */

public class MassageFragment extends Fragment {

    public ListView messageListView;
    List<MessageData> messageDataList = new ArrayList<>();
    MessageAdapter messageAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_massage_item,container,false);
        messageListView = (ListView) v.findViewById(R.id.messageListView);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        messageDataList.add(new MessageData("더조은","반가워요", Calendar.getInstance()));
        messageDataList.add(new MessageData("더조은","반가워요", Calendar.getInstance()));
        messageDataList.add(new MessageData("더조은","반가워요", Calendar.getInstance()));

        messageAdapter = new MessageAdapter(getActivity(),messageDataList);
        messageListView.setAdapter(messageAdapter);
    }
}
