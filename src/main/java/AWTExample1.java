import java.awt.*;

public class AWTExample1 extends Frame {

    AWTExample1() {
        Button b = new Button("ME BUTTON");

        b.setBounds(30,100,80,30);

        add(b);

        setSize(200,800);

        setTitle("This is our basic FRAME NAME");

        Checkbox payment = new
                Checkbox("Оплата в кредит");
        payment.setBounds(10, 180, 120, 20);
        add(payment);
        Checkbox delivery1 = new Checkbox("Доставка");
        delivery1.setBounds(10, 200, 120, 20);
        add(delivery1);

        CheckboxGroup delivery = new CheckboxGroup();
        Checkbox fast = new Checkbox(
                "Срочная (1 день)", delivery, true);
        fast.setBounds(10, 30, 150, 20);
        add(fast);
        Checkbox normal = new Checkbox(
                "Обычная (1 неделя)", delivery, false);
        normal.setBounds(10, 50, 150, 20);
        add(normal);
        Checkbox postal = new Checkbox(
                "По почте (до 1 месяца)",
                delivery, false);
        postal.setBounds(10, 70, 150, 20);
        add(postal);


        Choice color = new Choice();
        color.add("Белый");
        color.add("Зеленый");
        color.add("Синий");
        color.add("Черный");
        color.setBounds(10, 150, 150, 20);
        add(color);

        List accessories = new List(3);
        accessories.add("Чехол");
        accessories.add("Наушники");
        accessories.add("Аккумулятор");
        accessories.add("Блок питания");
        accessories.setBounds(10, 220, 150, 60);
        add(accessories);

        TextField tf = new TextField();
        tf.setText("Enter your name");
        tf.selectAll();
        tf.setBounds(10, 300, 150, 20);
        add(tf);


        int height = getHeight(), width = getWidth();
        int thickness = 16;
        Scrollbar hs = new Scrollbar(
                Scrollbar.HORIZONTAL, 50,
                width/10, 0, 100);
        Scrollbar vs = new Scrollbar(
                Scrollbar.VERTICAL, 50,
                height/2, 0, 100);
        add(hs); add(vs);
        hs.setBounds(0, height - thickness,
                width - thickness, thickness);
        vs.setBounds(width - thickness, 0, thickness,
                height - thickness);


        ////

        setLayout(null);

        setVisible(true);


    }

    public static void main(String args[]) {

        AWTExample1 f = new AWTExample1();

    }

}    