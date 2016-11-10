package com.bore.pattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @description 原型模式  继承Cloneable类，实现clone方法,包括浅复制和深复制
 * @author Pet.Li
 * @date 2016年11月1日 下午7:52:40
 * @version 1.0.0
 */
public class ProtoType implements Cloneable, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String desc;
	
	private Person person;
	
	//浅复制，只复制基本类型，引用类型还是指向原对象
	public ProtoType clone() throws CloneNotSupportedException{
		ProtoType protoType = (ProtoType) super.clone();
		return protoType;
	}
	
	//深复制，复制基本类型，引用类型
	public ProtoType deepClone() throws IOException, ClassNotFoundException{
		
		//写入当前对象的二进制流
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		//读出二进制产生的新对象
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (ProtoType) ois.readObject();
        
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
}
