
package com.cookandroid.runcatch;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 화면 설정
        setContentViewEdgeToEdge(R.layout.activity_main, R.id.main);

        // 하단 내비게이션
        setupBottomNav(R.id.homeNavButton);

        // 러닝 시작 버튼 연결
        Button startButton = findViewById(R.id.startButton);

        startButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RunningActivity.class);
            startActivity(intent);
        });
    }
}
