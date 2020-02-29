package com.self;

public class PayServiceImpl implements IPayInterface {
    @Override
    public String pay() {
        return "dubbo test : pay success";
    }
}
