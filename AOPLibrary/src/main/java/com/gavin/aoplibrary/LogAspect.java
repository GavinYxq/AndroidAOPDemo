package com.gavin.aoplibrary;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Create by Jason.Yin on 2022/8/11.
 */

@Aspect
public class LogAspect {

    private static final String TAG = "LogAspect";

    private static final String METHOD_EXECUTION = "execution(* *..MainActivity+.onCreate(..))";
    @Pointcut(METHOD_EXECUTION)
    public void logTest(){

    }
    @Around("logTest()")
    public void aroundLogTest(ProceedingJoinPoint joinPoint) throws Throwable{
        Log.e(TAG,"In onCreate ----");
        joinPoint.proceed();
        Log.e(TAG,"Out onCreate ----");
    }
}
 