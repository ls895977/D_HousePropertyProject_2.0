package com.example.d_housepropertyproject.net;

import com.zhouyou.http.callback.CallBack;
import com.zhouyou.http.callback.CallBackProxy;
import com.zhouyou.http.callback.CallClazzProxy;
import com.zhouyou.http.request.GetRequest;

import java.lang.reflect.Type;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;



public class CustomGetRequest extends GetRequest {
    public CustomGetRequest(String url) {
        super(url);
    }

    @Override
    public <T> Observable<T> execute(Type type) {
        return super.execute(new CallClazzProxy<CustomApiResult<T>, T>(type) {
        });
    }

    @Override
    public <T> Observable<T> execute(Class<T> clazz) {
        return super.execute(new CallClazzProxy<CustomApiResult<T>, T>(clazz) {
        });
    }

    @Override
    public <T> Disposable execute(CallBack<T> callBack) {
        return super.execute(new CallBackProxy<CustomApiResult<T>, T>(callBack) {
        });
    }
}
