package main.java.com.kgk.dashboard;

public class WidgetFactory {
    public void CreateWidget(Widget widget){
        if(widget instanceof SmallWidget){
            ((SmallWidget) widget).createSmallWidget(); //downcasting
        }else if(widget instanceof LargeWidget){
            ((LargeWidget) widget).createLargeWidget(); //downcasting
        }
    }
}
