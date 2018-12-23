package kr.tjit.a20181216_01_projectcopy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    //변수 생성
    LinearLayout koreanFoodBtn;
    LinearLayout bunsikBtn;
    LinearLayout japaneseFoodBtn;
    
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
        koreanFoodBtn = findViewById(R.id.koreanFoodBtn);
        bunsikBtn = findViewById(R.id.bunsikBtn);
        japaneseFoodBtn = findViewById(R.id.japaneseFoodBtn);

    }

    @Override
    public void setupEvents() {
        //한식 버튼이 눌렸을 때 할 일
        koreanFoodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "한식을 눌렀습니다.", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, RestaurantListActivity.class);
                startActivity(intent);          //티켓을 발급받아서 출발함
            }
        });

        bunsikBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "분식을 눌렀습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        japaneseFoodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "돈까스.회.일식을 눌렀습니다.", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void setValues() {

    }
}
