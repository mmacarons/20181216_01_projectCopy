package kr.tjit.a20181216_01_projectcopy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    //변수 생성
    LinearLayout koreanFoodBtn;
    LinearLayout bunsikBtn;
    LinearLayout japaneseFoodBtn;
    private LinearLayout chickenBtn;
    private LinearLayout pizzaBtn;
    private LinearLayout chineseBtn;
    private LinearLayout jokbalBtn;
    private LinearLayout yasikBtn;
    private LinearLayout stewBtn;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //맨날 쓰는 기능들
        bindViews();            //밑으로 치워서 깔끔함
        setupEvents();          //얘는 bindViews()가 끝나야 실행 가능함
        setValues();

    }

    @Override
    public void bindViews() {
        //읽을 필요가 없는 코드들
        //메쏘드를 만들어서 밑으로 치워버려야 함

        this.stewBtn = (LinearLayout) findViewById(R.id.stewBtn);
        this.yasikBtn = (LinearLayout) findViewById(R.id.yasikBtn);
        this.jokbalBtn = (LinearLayout) findViewById(R.id.jokbalBtn);
        this.chineseBtn = (LinearLayout) findViewById(R.id.chineseBtn);
        this.pizzaBtn = (LinearLayout) findViewById(R.id.pizzaBtn);
        this.chickenBtn = (LinearLayout) findViewById(R.id.chickenBtn);
        this.japaneseFoodBtn = (LinearLayout) findViewById(R.id.japaneseFoodBtn);
        this.bunsikBtn = (LinearLayout) findViewById(R.id.bunsikBtn);
        this.koreanFoodBtn = (LinearLayout) findViewById(R.id.koreanFoodBtn);

    }

    @Override
    public void setupEvents() {
        //한식 버튼이 눌렸을 때 할 일
/*        koreanFoodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(mContext, "한식을 눌렀습니다.", Toast.LENGTH_SHORT).show();

//                한식이 눌렸다는 사실을 레스토랑리스트 액티비티에 공지. (알려줌)

//                ctrl+R 사용해서 전부 치환 가능
                Intent intent = new Intent(mContext, RestaurantListActivity.class);
                intent.putExtra("음식종류", "한식");
                startActivity(intent);          //티켓을 발급받아서 출발함
            }
        });*/


//        OnClickListener도 변수에 넣을 수 있음, 자료형은 OnClickListener
//        여기서 변수명은 foodKindClickListener
        View.OnClickListener foodKindClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                첫번째 방법: 원초적인 방법임. v가 가진 id를 비교해서 각각의 이벤트를 적용
//                별로 효율적이지 못 함.
/*
                if (v.getId() == R.id.chickenBtn) {
                    Toast.makeText(mContext, "치킨 눌림", Toast.LENGTH_SHORT).show();
                }
                else if (v.getId() == R.id.pizzaBtn) {
                    Toast.makeText(mContext, "피자 눌림", Toast.LENGTH_SHORT).show();
                }
*/

//                두번째 방법: xml에 태그를 달아서 메모처럼 활용
//                view는 각각의 리니어레이아웃을 의미
//                Toast.makeText(mContext, v.getTag().toString(), Toast.LENGTH_SHORT).show();

//                인텐트에 어떤 종류의 음식인지 첨부해서 레스토랑 목록화면 이동
                Intent intent = new Intent(mContext, RestaurantListActivity.class);
                intent.putExtra("음식종류", v.getTag().toString());
                startActivity(intent);


            }



        };

//        모든 버튼이 위의 이벤트 처리를 공유하도록 함.
//        setOnClickListener에 new OnClickListener 대신 위에서 만든 변수를 넣어줌.
        koreanFoodBtn.setOnClickListener(foodKindClickListener);
        bunsikBtn.setOnClickListener(foodKindClickListener);
        japaneseFoodBtn.setOnClickListener(foodKindClickListener);
        chickenBtn.setOnClickListener(foodKindClickListener);
        pizzaBtn.setOnClickListener(foodKindClickListener);
        chineseBtn.setOnClickListener(foodKindClickListener);
        jokbalBtn.setOnClickListener(foodKindClickListener);
        yasikBtn.setOnClickListener(foodKindClickListener);
        stewBtn.setOnClickListener(foodKindClickListener);


    }

    @Override
    public void setValues() {

    }
}
