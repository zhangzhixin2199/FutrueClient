package com.zzx.futrue.test;

import com.zzx.futrue.ConstraintLayoutActivity;

import java.util.ArrayList;

/**
 * Created by jasonzhang on 18/3/27.
 */

public class TestHelper {
    public static ArrayList<TestTypeBean> getTestData() {
        ArrayList<TestTypeBean> list = new ArrayList<>();
        list.add(buildTestBean("ConstraintLayout","android.support.constraint.ConstraintLayout", ConstraintLayoutActivity.class));
        return list;
    }
    public static TestTypeBean buildTestBean(String name,String des,Class<?> cls){
        TestTypeBean bean = new TestTypeBean();
        bean.des = des;
        bean.name = name;
        bean.cls = cls;
        return bean;
    }
}
