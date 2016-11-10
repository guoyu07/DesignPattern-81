package com.bore.pattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @description ԭ��ģʽ  �̳�Cloneable�࣬ʵ��clone����,����ǳ���ƺ����
 * @author Pet.Li
 * @date 2016��11��1�� ����7:52:40
 * @version 1.0.0
 */
public class ProtoType implements Cloneable, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String desc;
	
	private Person person;
	
	//ǳ���ƣ�ֻ���ƻ������ͣ��������ͻ���ָ��ԭ����
	public ProtoType clone() throws CloneNotSupportedException{
		ProtoType protoType = (ProtoType) super.clone();
		return protoType;
	}
	
	//��ƣ����ƻ������ͣ���������
	public ProtoType deepClone() throws IOException, ClassNotFoundException{
		
		//д�뵱ǰ����Ķ�������
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		//���������Ʋ������¶���
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
