package com.todo.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodoItem {
    private String title;
    private String desc;
    private String current_date;
    private int id;
    private int asap;
    private int errday;
    private SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
    private String category;
    private String due_date;
    private int is_completed;


    public TodoItem(String category, String title, String desc, String due_date, int is_completed, int asap, int errday){
        this.title=title;
        this.desc=desc;
        this.current_date=format.format(new Date());
        this.category = category;
        this.due_date = due_date;
        this.is_completed = is_completed;
        this.asap = asap;
        this.errday = errday;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCurrent_date() {
        return current_date;
    }

    public void setCurrent_date(Date current_date) {
        this.current_date = format.format(current_date);
        
    }
    
    public void setCurrent_date(String current_date) {
    	this.current_date = current_date;
    }
  
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAsap() {
		return asap;
	}
	
	public void setAsap(int asap) {
		this.asap = asap;
	}
	
	public int getErrday() {
		return errday;
	}
	
	public void setErrday(int errday) {
		this.errday = errday;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDue_date() {
		return due_date;
	}

	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}

	public int getIs_completed() {
		return is_completed;
	}

	public void setIs_completed(int is_completed) {
		this.is_completed = is_completed;
	}

	@Override
    public String toString() {
		if(this.is_completed == 1)
			if(this.asap == 1) {
				if(this.errday == 1)
					return "<asap, errday> " + "[" + category + "] " + title + "[V] - " + desc + " - " + due_date + " - " + current_date;
				else
					return "<asap> " + "[" + category + "] " + title + "[V] - " + desc + " - " + due_date + " - " + current_date;
			}
			else {
				return "[" + category + "] " + title + "[V] - " + desc + " - " + due_date + " - " + current_date;
			}
		else {
			if(this.asap == 1) {
				if(this.errday == 1)
					return "<asap, errday> " + "[" + category + "] " + title + " - " + desc + " - " + due_date + " - " + current_date;
				else
					return "<asap> " + "[" + category + "] " + title + " - " + desc + " - " + due_date + " - " + current_date;
			}
			else {
				if(this.errday == 1)
					return "<errday> " + "[" + category + "] " + title + " - " + desc + " - " + due_date + " - " + current_date;
				else
					return "[" + category + "] " + title + " - " + desc + " - " + due_date + " - " + current_date;
			}
		}
    }
    
    public String toSaveString() {
    	return asap + "##" + errday + "##" + category + "##" + is_completed + "##" + title + "##" + desc + "##" + due_date + "##" + current_date + "\n";
    }
    
}
