package taller2;

import org.openqa.selenium.By;

public class HerokuApp {
    String authorLink = "By.cssSelector(.container address:nth-child(6) a:first-child)";
    String firstTableFirstText = "By.cssSelector(.container ul li:nth-child(3))";
    String menuListFirstRowText = "By.cssSelector(.container menu li:first-child)";
    String dirListThirdRowText = "By.cssSelector(.container dir li:last-child)";
    String formButton = "By.cssSelector(.container form button)";
    String formReset2Button = "By.cssSelector(.container form input.btn.reset2)";
    String thirdOptionInSelectElement =
            "By.cssSelector(.container select[name='select2'] option:last-child)";
    String firstTableIcelandRowLandAreaColumn =
            "By.cssSelector(.container table[summary] tbody tr:nth-child(4) td:last-child)";
    String hyphenationTitle = "By.cssSelector(.container table:last-of-type + h2 + p)";
    String javascriptTitle = "By.cssSelector(.container p.limited.hyphens + h3)";
}
