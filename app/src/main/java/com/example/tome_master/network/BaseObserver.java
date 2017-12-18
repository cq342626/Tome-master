package com.example.tome_master.network;


import android.accounts.NetworkErrorException;

import java.io.File;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.concurrent.TimeoutException;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public abstract class BaseObserver<T> implements Observer<T> {

    public BaseObserver() {
    }

    private String file;

    public BaseObserver(String file) {
        if (!new File(file).exists()){
            new File(file).mkdirs();
        }
        this.file = file;
    }

    @Override
    public void onSubscribe(@NonNull Disposable d) {
        onRequestStart();
    }

    @Override
    public void onNext(@NonNull T t) {
        if (t != null) {
            try {
                onSuccess(t);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                onCodeError(t);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        onRequestEnd();
    }

    @Override
    public void onError(@NonNull Throwable e) {
        try {
            if (e instanceof ConnectException
                    || e instanceof TimeoutException
                    || e instanceof NetworkErrorException
                    || e instanceof UnknownHostException) {
                onFailure(e, true);
            } else {
                onFailure(e, false);
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        onRequestEnd();
    }

    @Override
    public void onComplete() {

    }

    /**
     * 请求开始
     */
    protected void onRequestStart() {
    }

    /**
     * 请求结束
     */
    protected void onRequestEnd() {}

    /**
     * 返回成功
     *
     * @param t
     * @throws Exception
     */
    protected abstract void onSuccess(T t) throws Exception;

    /**
     * 返回失败
     *
     * @param e
     * @param isNetWorkError 是否是网络错误
     * @throws Exception
     */
    protected abstract void onFailure(Throwable e, boolean isNetWorkError) throws Exception;

    /**
     * 返回成功了,但是code错误
     *
     * @param t
     * @throws Exception
     */
    protected void onCodeError(T t) throws Exception {}
}
