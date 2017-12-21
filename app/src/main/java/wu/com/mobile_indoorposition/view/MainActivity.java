package wu.com.mobile_indoorposition.view;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import wu.com.mobile_indoorposition.view.R;

public class MainActivity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.Vector);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);


    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new IO_maps_Fragment();
                case 1:
                    return new Book_Search();
                case 2:
                    return new Book_Tracking();
                case 3:
                    return new Facility_Service();


            }
            return null;
        }

        @Override
        public int getCount() {

            return 4;
        }

        public CharSequence getPageTitle(int position) {

            switch (position) {
                case 0:
                    return "Map Overview";
                case 1:
                    return "Book Search";
                case 2:
                    return "Book Tracking";
                case 3:
                    return "Facility Service";
            }
            return null;
        }

    }

}
