package kr.co.tjenit.facebookcopy.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjenit.facebookcopy.R;
import kr.co.tjenit.facebookcopy.adapter.FriendsListAdapter;
import kr.co.tjenit.facebookcopy.data.FriendsData;

/**
 * Created by the on 2017-08-04.
 */

public class FriendsFragment extends Fragment {

    private ListView friendsListView;
    List<FriendsData> friendsDataList = new ArrayList<>();
    FriendsListAdapter friendsListAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_friends_item,container,false);
        friendsListView = (ListView) v.findViewById(R.id.friendsListView);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        friendsDataList.add(new FriendsData("이요한","함께 아는 친구 4명"));
        friendsDataList.add(new FriendsData("이요한","함께 아는 친구 4명"));
        friendsDataList.add(new FriendsData("이요한","함께 아는 친구 4명"));
        friendsDataList.add(new FriendsData("이요한","함께 아는 친구 4명"));

        friendsListAdapter = new FriendsListAdapter(getActivity(), friendsDataList);
        friendsListView.setAdapter(friendsListAdapter);
    }
}
