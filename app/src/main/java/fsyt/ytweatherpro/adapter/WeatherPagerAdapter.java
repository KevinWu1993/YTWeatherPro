package fsyt.ytweatherpro.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by KevinWu on 16-3-30.
 */
public class WeatherPagerAdapter extends FragmentStatePagerAdapter {
    private List<WeatherPagerAdapter> fragmentList;

    public WeatherPagerAdapter(FragmentManager fm,List<WeatherPagerAdapter> fragmentList) {
        super(fm);
        this.fragmentList=fragmentList;
    }


    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
