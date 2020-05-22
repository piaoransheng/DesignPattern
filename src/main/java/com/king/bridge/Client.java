package com.king.bridge;

import com.king.bridge.brand.HuaWeiBrand;
import com.king.bridge.brand.XiaoMiBrand;
import com.king.bridge.phone.FolderPhone;
import com.king.bridge.phone.UpPhone;

public class Client {
    public static void main(String[] args) {
        Phone phone = new FolderPhone(new XiaoMiBrand());
        phone.call();

        Phone phone1 = new FolderPhone(new HuaWeiBrand());
        phone1.call();

        Phone phone2 = new UpPhone(new XiaoMiBrand());
        phone2.close();
    }
}
