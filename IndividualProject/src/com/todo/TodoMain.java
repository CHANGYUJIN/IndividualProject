package com.todo;

import java.util.Scanner;

import com.todo.dao.TodoList;
import com.todo.menu.Menu;
import com.todo.service.TodoUtil;

public class TodoMain {
	
	public static void start() {
		Scanner sc = new Scanner(System.in);
		TodoList l = new TodoList();
		//l.importData("todolist.txt");
		boolean quit = false;
		Menu.displaymenu();
		do {
			Menu.prompt();
			String choice = sc.next();
			switch (choice) {

			case "add":
				TodoUtil.createItem(l);
				break;
			
			case "del":
				System.out.print("Enter a number of items to delete ");
				int delnum = sc.nextInt();
				TodoUtil.deleteItem(l, delnum);
				break;
				
			case "edit":
				TodoUtil.updateItem(l);
				break;
			
			case "find":
				String find_keyword = sc.nextLine().trim();
				TodoUtil.findList(l, find_keyword);
				break;
				
			case "find_cate":
				String find_cate_keyword = sc.nextLine().trim();
				TodoUtil.findCateList(l, find_cate_keyword);
				break;
			
			case "comp":
				System.out.print("Enter a number of items to complete ");
				int compnum = sc.nextInt();
				TodoUtil.completeItem(l, compnum);
				break;
			case "asap":
				System.out.print("Enter a number of items to mark as <asap>");
				int asapnum = sc.nextInt();
				TodoUtil.hurryItem(l, asapnum);
			case "errday":
				System.out.print("Enter a number of items to mark as <errday>");
				int errdaynum = sc.nextInt();
				TodoUtil.hurryItem(l, errdaynum);
			case "ls":
				TodoUtil.listAll(l);
				break;
			
			case "ls_cate":
				TodoUtil.listCateAll(l);
				break;
				
			case "ls_comp":
				TodoUtil.listAll(l, 1, 0, 0);
				break;
				
			case "ls_asap":
				TodoUtil.listAll(l, 0, 1, 0);
				break;
			
			case "ls_errday":
				TodoUtil.listAll(l, 0, 0, 1);
				break;
				
			case "ls_name":
				System.out.println("sorted by name in ascending order");
				TodoUtil.listAll(l, "title", 1);
				break;

			case "ls_name_desc":
				System.out.println("sorted by name in descending order");
				TodoUtil.listAll(l, "title", 0);
				break;
				
			case "ls_date":
				System.out.println("sorted by date in ascending order");
				TodoUtil.listAll(l, "due_date", 1);
				break;
				
			case "ls_date_desc":
				System.out.println("sorted by date in descending order");
				TodoUtil.listAll(l, "due_date", 0);
				break;
				
			case "help":
				Menu.displaymenu();
				break;
				
			case "exit":
				quit = true;
				break;

			default:
				System.out.println("command not exist (enter 'help' to see the commands)");
				break;
			}
		} while (!quit);
		TodoUtil.saveList(l, "todolist.txt");
		
	}
	
}
