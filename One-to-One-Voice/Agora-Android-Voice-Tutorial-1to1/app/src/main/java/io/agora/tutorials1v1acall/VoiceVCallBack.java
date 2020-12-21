package io.agora.tutorials1v1acall;

import android.util.Log;

import io.agora.rtc.IRtcEngineEventHandler;

public class VoiceVCallBack extends IRtcEngineEventHandler {
    private String Tag="666";
    @Override
    public void onError(int err) {
        Log.e(Tag,"加入频道失败"+err);
        super.onError(err);
    }

    @Override
    public void onJoinChannelSuccess(String channel, int uid, int elapsed) {
        Log.e(Tag,"加入频道成功"+channel);
        super.onJoinChannelSuccess(channel, uid, elapsed);
    }
}
