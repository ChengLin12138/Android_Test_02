package com.example.lenovo.android_test_02.P;

import com.example.lenovo.android_test_02.M.FoodBean;
import com.example.lenovo.android_test_02.M.MainMolder;
import com.example.lenovo.android_test_02.M.MolderInterface;
import com.example.lenovo.android_test_02.V.ViewInterface;

import java.util.List;

public class MainP implements MolderInterface {

    MainMolder mainMolder = new MainMolder(this);
    ViewInterface viewInterface;

    public MainP(ViewInterface viewInterface) {
        this.viewInterface = viewInterface;
    }

    public void HandlerStart(){
        mainMolder.getData();
    }

    @Override
    public void molderSuccess(List<FoodBean.DataBean> list) {
        viewInterface.viewSuccess(list);
    }

}
