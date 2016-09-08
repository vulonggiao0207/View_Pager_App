package com.giao.view_pager_app;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Long on 9/7/2016.
 */
public class PageAdapter  extends FragmentStatePagerAdapter {
    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag=null;
        switch (position){
            case 0:
                frag=new AndroidFragment();
                break;
            case 1:
                frag=new IosFragment();
                break;
            case 2:
                frag=new WindowsFragment();
                break;
        }
        return frag;
    }
    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title="Android";
                break;
            case 1:
                title="IOS";
                break;
            case 2:
                title="Windows";
                break;
        }

        return title;
    }

}
