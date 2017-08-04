package kr.co.tjenit.facebookcopy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import kr.co.tjenit.facebookcopy.fragment.AlarmFragment;
import kr.co.tjenit.facebookcopy.fragment.FriendsFragment;
import kr.co.tjenit.facebookcopy.fragment.MassageFragment;
import kr.co.tjenit.facebookcopy.fragment.MoreFragment;
import kr.co.tjenit.facebookcopy.fragment.NewsFeedFragment;

public class MainActivity extends AppCompatActivity {

    ViewPager newsfeedViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newsfeedViewPager = (ViewPager) findViewById(R.id.newsfeedViewPager);
        newsfeedViewPager.setAdapter(new newsFeedAdapter(getSupportFragmentManager()));
    }

    class newsFeedAdapter extends FragmentStatePagerAdapter {

        public newsFeedAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public Fragment getItem(int position) {
            if (position==0) {
                return new NewsFeedFragment();
            }
            else if (position==1) {
                return new FriendsFragment();
            }
            else if (position==2) {
                return new MassageFragment();
            }
            else if (position==3) {
                return new AlarmFragment();
            }
            else {
                return new MoreFragment();
            }
        }
    }
}
