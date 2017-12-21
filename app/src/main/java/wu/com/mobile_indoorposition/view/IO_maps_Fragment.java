package wu.com.mobile_indoorposition.view;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import wu.com.mobile_indoorposition.view.R;

public class IO_maps_Fragment extends Fragment {
    private IOSectionsPagerAdapter ioSectionsPagerAdapter;
    private ViewPager mViewPager;


    public IO_maps_Fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_io_maps_, container, false);

        mViewPager = view.findViewById(R.id.fravector);
        Log.d("fragement", String.valueOf(mViewPager));
        ioSectionsPagerAdapter = new IOSectionsPagerAdapter(this.getChildFragmentManager());
//        Fragment googlemaps = new Google_Map_Fragment();
//        FragmentTransaction transaction = this.getChildFragmentManager().beginTransaction();
//        transaction.add(R.id.fravector, googlemaps).commit();
        mViewPager.setAdapter(ioSectionsPagerAdapter);
        TabLayout tabLayout = view.findViewById(R.id.iotabs);
        tabLayout.setupWithViewPager(mViewPager);
        return view;

    }

    public class IOSectionsPagerAdapter extends FragmentPagerAdapter {
        public IOSectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new Google_Map_Fragment();
                case 1:
                    return new Indoor_mapsview();


            }
            return null;
        }

        @Override
        public int getCount() {

            return 2;
        }

        public CharSequence getPageTitle(int position) {

            switch (position) {
                case 0:
                    return "Outdoor Maps";
                case 1:
                    return "Indoor Maps";

            }
            return null;
        }

    }


}
