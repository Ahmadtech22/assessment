package utils.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class BrowseUtils {

    //Browser utils is a location for the reusable methods
    //Advantage:1 - you dont need to repeat yourself
    //2 less amount of code
    //            3 - less amount of time


    public static String getText(WebElement element) {

        return element.getText().trim();
    }





}
