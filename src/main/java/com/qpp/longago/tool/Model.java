package com.qpp.longago.tool;

import java.util.ArrayList;

public class Model{
	private int code = 200;
	private String msg = "牛逼的操作";
	private Object obj=new ArrayList<>();
	private Object spare = "";
	public Model() {
	}

	public Model(int errorcode) {
		if (errorcode == 500) {
			this.code = 500;
			this.msg = "error";
		}
	}
	public Model(Object retobj) {
			this.code = 200;
			this.msg = "操作成功";
			this.obj = retobj;
	}
	public Model(Object retobj,Object obj) {
		this.code = 200;
		this.msg = "操作成功";
		this.obj = retobj;
		this.spare=obj;
	}
	public Model(int errorcode, Object obj) {
		this.code = errorcode;
		this.obj = obj;
	}

	public Model(int errorcode, String msg) {
		this.code = errorcode;
		this.msg = msg;
	}
	public Model(int errorcode, String msg,Object obj) {
		this.code = errorcode;
		this.msg = msg;
		this.obj =obj;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public Object getSpare() {
		return spare;
	}

	public void setSpare(Object spare) {
		this.spare = spare;
	}


	
	
}
