package wu.com.mobile_indoorposition.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import wu.com.mobile_indoorposition.view.R;

public class Facility_Service extends Fragment {
    private ImageView imageView;


    public Facility_Service() {
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
        View view = inflater.inflate(R.layout.fragment_facility_, container, false);
        imageView = view.findViewById(R.id.facilityview);
        imageView.setBackgroundResource(R.drawable.facilities);

        return view;
    }


}
