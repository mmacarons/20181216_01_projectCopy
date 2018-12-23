package kr.tjit.a20181216_01_projectcopy;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import kr.tjit.a20181216_01_projectcopy.adapters.RestaurantAdapter;
import kr.tjit.a20181216_01_projectcopy.datas.Restaurant;

public class RestaurantListActivity extends BaseActivity {

    RestaurantAdapter mAdapter;
    List<Restaurant> restaurants = new ArrayList<Restaurant>();
    String foodKind;
    private android.widget.ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        setContentView에서 alt + insert -> view fields
//        잘라서 bindViews 안으로 집어넣음
        setContentView(R.layout.activity_restaurant_list);

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void bindViews() {

        this.listView = (ListView) findViewById(R.id.listView);

    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

        foodKind = getIntent().getStringExtra("음식종류");
        setTitle(String.format("%s 배달 가능 식당 목록", foodKind));

//        ();여기까지 치고 alt + enter
        fillRestaurants();

        mAdapter = new RestaurantAdapter(mContext, restaurants);
        listView.setAdapter(mAdapter);

    }

    private void fillRestaurants() {

        restaurants.clear();
        restaurants.add(new Restaurant("도미노피자", "광진구", "09:00 ~ 22:00", "http://cfs15.tistory.com/image/24/tistory/2008/11/05/18/00/491160cb593e2"));
        restaurants.add(new Restaurant("미스터피자", "관악구", "08:00 ~ 21:00", "http://postfiles12.naver.net/20160530_171/ppanppane_14646177044221JRNd_PNG/%B9%CC%BD%BA%C5%CD%C7%C7%C0%DA_%B7%CE%B0%ED_%281%29.png?type=w966"));
        restaurants.add(new Restaurant("피자헛", "강동구", "07:00 ~ 20:00", "https://mblogthumb-phinf.pstatic.net/20141124_182/howtomarry_1416806028308979cg_PNG/Pizza_Hut_logo.svg.png?type=w2"));
        restaurants.add(new Restaurant("파파존스", "성북구", "06:00 ~ 23:00", "http://postfiles2.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w966"));

    }
}
