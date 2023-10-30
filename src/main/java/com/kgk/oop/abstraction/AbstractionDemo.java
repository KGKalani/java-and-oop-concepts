package main.java.com.kgk.oop.abstraction;

import main.java.com.kgk.dashboard.LargeWidget;
import main.java.com.kgk.dashboard.SmallWidget;
import main.java.com.kgk.dashboard.Widget;

/**
 * Abstraction is a concept of hiding the implementation details from the user and
 * expose only functionality to the user.
 * --Rules--
 *  > An abstract class must be declared with an abstract keyword.
 *  > It can have abstract and non-abstract methods.
 *  > It cannot be instantiated.
 *  > It can have constructors and static methods also.
 *  > It can have final methods which will force the subclass not to change the body of the method.
 *
 * In following example, Widget is an abstraction class, and it exposes the createWidget method to user.
 * But base on the widget type, functionality of the createWidget is differed and user does not know the
 * inner implementation of it.
 */
public class AbstractionDemo {
    public static void demo(){
        Widget widget = new SmallWidget();
        widget.createWidget();

        widget = new LargeWidget();
        widget.createWidget();
    }
}
