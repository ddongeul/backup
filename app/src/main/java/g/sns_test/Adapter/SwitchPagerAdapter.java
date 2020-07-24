package g.sns_test.Adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import g.sns_test.Fragment.PageOneFragment;
import g.sns_test.Fragment.PageTwoFragment;
import g.sns_test.Fragment.PageThreeFragment;


public class SwitchPagerAdapter extends FragmentPagerAdapter {
    private static int PAGE_NUMBER = 6;

    public SwitchPagerAdapter(FragmentManager fm){
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return PageOneFragment.newInstance();
            case 1:
                return PageTwoFragment.newInstance();
            case 2:
                return PageThreeFragment.newInstance();
            case 3:
                return PageThreeFragment.newInstance();
            case 4:
                return PageThreeFragment.newInstance();
            case 5:
                return PageThreeFragment.newInstance();
            default:
                return null;

        }
    }


    @Override
    public int getCount() {
        return PAGE_NUMBER;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "대전대";
            case 1:
                return "한남대";
            case 2:
                return "우송대";
            case 3:
                return "배제대";
            case 4:
                return "목원대";
            case 5:
                return "충남대";
            default:
                return null;
        }
    }


}