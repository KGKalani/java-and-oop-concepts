package kgk.main.java.oop.concepts.abstraction;

import kgk.main.java.dashboard.LargeWidget;
import kgk.main.java.dashboard.SmallWidget;
import kgk.main.java.dashboard.Widget;

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
