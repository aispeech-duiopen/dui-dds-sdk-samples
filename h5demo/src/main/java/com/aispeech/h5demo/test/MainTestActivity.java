package com.aispeech.h5demo.test;

import android.content.Intent;

import com.aispeech.h5demo.test.agent.AgentTestActivity;
import com.aispeech.h5demo.test.tts.TTSTestActivity;
import com.aispeech.h5demo.test.vad.VadTestActivity;
import com.aispeech.h5demo.test.wakeup.WakeupTestActivity;


public class MainTestActivity extends BaseTestActivity {

    @Override
    protected void initData() {
        mData.add(new ListItem<>("唤醒测试", WakeupTestActivity.class));
        mData.add(new ListItem<>("TTS测试", TTSTestActivity.class));
        mData.add(new ListItem<>("vad测试", VadTestActivity.class));
        mData.add(new ListItem<>("云端对话测试", AgentTestActivity.class));
        mData.add(new ListItem<>(" ", AgentTestActivity.class));
        mData.add(new ListItem<>("Agent 测试", AgentTestActivity.class));
        mData.add(new ListItem<>("场景模式测试", AgentTestActivity.class));
        mData.add(new ListItem<>("数据上传测试", AgentTestActivity.class));
        mData.add(new ListItem<>("全双工测试", AgentTestActivity.class));
    }

    @Override
    protected void onItemClick(ListItem item) {
        Intent intent = new Intent(MainTestActivity.this, item.getKlass());
        intent.putExtra("title", item.getTitle());
        startActivity(intent);
    }
}
