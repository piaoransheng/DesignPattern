package com.king.prototype.deepclone;

/**
 * 本案例要克隆Dto
 * TableEntity是个引用类型，作为Dto的成员属性
 *
 */

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Dto dto = new Dto();
        dto.name = "dtoName";
        dto.tableEntity = new TableEntity("订单详情价格1","订单详情数量1");

        Dto clone = (Dto) dto.clone();

    }
}
