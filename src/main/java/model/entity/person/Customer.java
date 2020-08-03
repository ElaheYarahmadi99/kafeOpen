package model.entity.person;

public class Customer extends Person {

    private Long payMoney;

    public Long getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Long payMoney) {
        this.payMoney = payMoney;
    }
}
