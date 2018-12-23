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
        koreanFoodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(mContext, "한식을 눌렀습니다.", Toast.LENGTH_SHORT).show();

//                ctrl+R 사용해서 전부 치환 가능
                Intent intent = new Intent(mContext, RestaurantListActivity.class);
                startActivity(intent);          //티켓을 발급받아서 출발함
            }
        });

        bunsikBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "분식을 눌렀습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        japaneseFoodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "돈까스.회.일식을 눌렀습니다.", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void setValues() {

    }
}
