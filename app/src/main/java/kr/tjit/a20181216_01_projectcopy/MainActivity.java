package kr.tjit.a20181216_01_projectcopy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    LinearLayout zzimTangBtn;
    LinearLayout nightFoodBtn;
    LinearLayout jokbalBtn;
    LinearLayout ChineseFoodBtn;
    LinearLayout pizzaBtn;
    LinearLayout chickenBtn;
    LinearLayout japanFoodBtn;
    LinearLayout bunsikBtn;
    LinearLayout koreanFoodBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        setValues();
        setupEvents();

    }

    @Override
    public void setupEvents() {

        zzimTangBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "찜.탕을 선택했습니다.", Toast.LENGTH_SHORT).show();
            }
        });
        nightFoodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "야식을 선택했습니다.", Toast.LENGTH_SHORT).show();
            }
        });
        jokbalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "족발.보쌈을 선택했습니다.", Toast.LENGTH_SHORT).show();
            }
        });
        ChineseFoodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "중국집을 선택했습니다.", Toast.LENGTH_SHORT).show();
            }
        });
        pizzaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "피자를 선택했습니다.", Toast.LENGTH_SHORT).show();
            }
        });
        chickenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "치킨을 선택했습니다.", Toast.LENGTH_SHORT).show();
            }
        });
        japanFoodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "돈까스.회.일식을 선택했습니다.", Toast.LENGTH_SHORT).show();
            }
        });
        bunsikBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "분식을 선택했습니다.", Toast.LENGTH_SHORT).show();
            }
        });
        koreanFoodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "한식을 선택했습니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {

        zzimTangBtn = findViewById(R.id.zzimTangBtn);
        nightFoodBtn = findViewById(R.id.nightFoodBtn);
        jokbalBtn = findViewById(R.id.jokbalBtn);
        ChineseFoodBtn = findViewById(R.id.ChineseFoodBtn);
        pizzaBtn = findViewById(R.id.pizzaBtn);
        chickenBtn = findViewById(R.id.chickenBtn);
        japanFoodBtn = findViewById(R.id.japanFoodBtn);
        bunsikBtn = findViewById(R.id.bunsikBtn);
        koreanFoodBtn = findViewById(R.id.koreanFoodBtn);

    }
}
