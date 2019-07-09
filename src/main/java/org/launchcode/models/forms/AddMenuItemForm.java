package org.launchcode.models.forms;

import org.launchcode.models.Cheese;
import org.launchcode.models.Menu;


public class AddMenuItemForm {

    private int menuId;

    private int cheeseId;

    private Iterable<Cheese> cheeses;

    private Menu menu;

    public AddMenuItemForm() { }

    public AddMenuItemForm(Iterable<Cheese> cheeses, Menu menu){
        this.cheeses=cheeses;
        this.menu=menu;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public int getCheeseId() {
        return cheeseId;
    }

    public void setCheeseId(int cheeseId) {
        this.cheeseId = cheeseId;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Iterable<Cheese> getCheeses() {
        return cheeses;
    }
}
