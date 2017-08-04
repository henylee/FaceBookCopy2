package kr.co.tjenit.facebookcopy.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import kr.co.tjenit.facebookcopy.R;

/**
 * Created by the on 2017-08-04.
 */

public class NewsFeedFragment extends Fragment {

    public ListView newsFeedListView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_news_feed_item,container,false);
        newsFeedListView = (ListView) v.findViewById(R.id.newsFeedListView);
        return v;
    }
}
