package kr.tjit.a20181216_01_projectcopy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nhn.android.maps.NMapActivity;
import com.nhn.android.maps.NMapView;

public class NaverMapActivity extends NMapActivity {

    private NMapView mMapView;
    private String CLIENT_ID = "6oZr65RHcwxob0MoZmAq";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMapView = new NMapView(NaverMapActivity.this);
        setContentView(mMapView);

        mMapView.setClientId(CLIENT_ID);
        mMapView.setClickable(true);
        mMapView.setEnabled(true);
        mMapView.setFocusable(true);
        mMapView.setFocusableInTouchMode(true);
        mMapView.requestFocus();

    }
}
