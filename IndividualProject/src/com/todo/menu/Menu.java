package com.todo.menu;
public class Menu {

    public static void displaymenu()
    {
        System.out.println();
        System.out.println("<TodoList commands>");
        System.out.println("add - add an item");
        System.out.println("del - delete an item");
        System.out.println("edit - edit an item");
        System.out.println("find <keyword> - find an item");
        System.out.println("find_cate <keyword> - find an item by category");
        System.out.println("asap - mark an item that needs to be done as sooon as possible(asap)");
        System.out.println("errday - mark an item that needs to be done everyday");
        System.out.println("ls - list all the items");
        System.out.println("ls_cate - list all the categories");
        System.out.println("ls_asap - list all the items that needs to be done as soon as possible(asap)");
        System.out.println("ls_errday - list all the items that needs to be done everyday");
        System.out.println("ls_name_asc - sort items by name in ascending order");
        System.out.println("ls_name_desc - sort items by name in descending order");
        System.out.println("ls_date - sort items by date in ascending order");
        System.out.println("ls_date_desc - sort items by date in descending order");
        System.out.println("exit - exit the program");
    }
    
    public static void prompt() {
    	System.out.print("\ncommand(enter -1 to exit during the process) > ");
    }
}
