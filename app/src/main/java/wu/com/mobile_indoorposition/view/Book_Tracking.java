package wu.com.mobile_indoorposition.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import wu.com.mobile_indoorposition.view.R;

public class Book_Tracking extends Fragment {
    private WebView webView;

    public Book_Tracking() {
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
        View view = inflater.inflate(R.layout.fragment_book__tracking, container, false);

        webView = getActivity().findViewById(R.id.webview1);
        //得到WebSettings对象，设置支持Javascript的参数
        webView.getSettings().setJavaScriptEnabled(true);

        //设置可以支持缩放
        webView.getSettings().setSupportZoom(true);

        //设置默认缩放方式尺寸是far
        webView.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);

        //设置出现缩放工具
        webView.getSettings().setBuiltInZoomControls(true);
        webView.setWebViewClient(new WebViewClient() {
            // Set progress bar during loading
            public void onProgressChanged(WebView view, int progress) {
            }

        });
        webView.loadUrl("http://www.lib.cuhk.edu.hk/");
        //webView.loadUrl("http://www.lib.cuhk.edu.hk/floorplan/staticmap.php?lang=en&lib=ul");

        webView.requestFocus();

        return view;
    }


}
