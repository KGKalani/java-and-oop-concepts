package kgk.main.java.instanceofoperator;

import kgk.main.java.dashboard.SmallWidget;
import kgk.main.java.dashboard.Widget;
import kgk.main.java.dashboard.WidgetFactory;

/**
 * instanceof operator is used to check the object is an instance of a specific type (class/subclass/interface)
 */
public class InstanceOfDemo {
    public static void main(String[] args){
        Widget widget = null;

        System.out.print("widget instanceof Widget is ");
        System.out.println(widget instanceof Widget);

        widget =  new SmallWidget();

        System.out.print("widget instanceof Widget is ");
        System.out.println(widget instanceof Widget);

        System.out.print("widget instanceof SmallWidget is ");
        System.out.println(widget instanceof SmallWidget);

        /*
        This makes a compiled time error. Cannot to downcasting
         */
        //SmallWidget smallWidget = new Widget();

        /*
        If we perform downcasting by typecasting, ClassCastException is thrown at runtime.
         */
        //SmallWidget smallWidget = (SmallWidget) new Widget();

        /*
        Using instanceof operator we can perform downcasting as follows
         */
        WidgetFactory widgetFactory = new WidgetFactory();
        widgetFactory.CreateWidget(new SmallWidget());
    }
}
