package wu.com.mobile_indoorposition.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.graphics.Matrix;

import wu.com.mobile_indoorposition.view.R;


public class Indoor_mapsview extends Fragment implements AdapterView.OnItemSelectedListener {
    private Spinner spinner;
    private ImageView imageView;
    private Matrix matrix;

    int[] images = new int[]{
            R.drawable.im_lg_gfloors,
            R.drawable.im_1_2floors,
            R.drawable.im_3_4floors
    };

    public Indoor_mapsview() {
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
        View view = inflater.inflate(R.layout.fragment_indoor_mapsview, container, false);
        spinner = view.findViewById(R.id.search_button);
        // 建立数据源
        String[] mItems = getResources().getStringArray(R.array.IndoorMaps);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, mItems);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        imageView = view.findViewById(R.id.imageview);
//        imageView.setBackgroundResource(images[0]);
        return view;
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        switch (i) {
            case 0:
                imageView.setBackgroundResource(images[0]);
                break;
            case 1:
                imageView.setBackgroundResource(images[1]);
                break;
            case 2:
                imageView.setBackgroundResource(images[2]);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
