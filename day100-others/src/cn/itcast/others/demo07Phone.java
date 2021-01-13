package demo01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class demo07Phone {
    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.piece);
        System.out.println(one.color);
        one.brand = "苹果";
        one.piece = 8388.0;
        one.color = "黑色";
        System.out.println(one.brand);
        System.out.println(one.piece);
        System.out.println(one.color);
        one.call("马春佳");
        one.sendMessages();
        Phone two = one;
        System.out.println(two.brand);
        System.out.println(two.piece);
        System.out.println(two.color);
        two.brand = "三星";
        two.piece = 7388.0;
        two.color = "蓝色";
        System.out.println(two.brand);
        System.out.println(two.piece);
        System.out.println(two.color);
        two.call("乔保利");
        two.sendMessages();
    }


}
